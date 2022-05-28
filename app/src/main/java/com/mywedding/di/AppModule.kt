package com.mywedding.di

import android.app.Application
import androidx.room.Room
import com.mywedding.data.local.LocalDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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

}