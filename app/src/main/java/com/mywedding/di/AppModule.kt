package com.mywedding.di

import android.app.Application
import androidx.room.Room
import com.google.gson.Gson
import com.mywedding.data.EnvironmentRepository
import com.mywedding.data.Environments
import com.mywedding.data.local.LocalDatabase
import com.mywedding.data.remote.API
import com.mywedding.data.remote.BaseProjectUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalDatabase(app: Application): LocalDatabase =
        Room.databaseBuilder(
            app,
            LocalDatabase::class.java,
            "mywedding.db"
        )
//            .addTypeConverter(Converters())
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @BaseProjectUrl
    fun bindBaseUrl(
        environmentRepository: EnvironmentRepository
    ) = when (environmentRepository.currentEnvironment) {
        Environments.Production -> "localhost:3000"
        Environments.Dev -> "localhost:3000 "
    }

    @Provides
    fun providesUserApi(
        gson: Gson,
        okHttpClient: OkHttpClient,
        @BaseProjectUrl url: String
    ): API =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(url)
            .build()
            .create(API::class.java)
}