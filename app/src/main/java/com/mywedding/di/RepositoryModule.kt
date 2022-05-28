package com.mywedding.di

import com.mywedding.data.EnvironmentRepository
import com.mywedding.data.Environments
import com.mywedding.data.local.interactors.invited.InvitedInteractor
import com.mywedding.data.local.interactors.invited.InvitedInteractorImpl
import com.mywedding.data.remote.BaseProjectUrl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindInvitedInteractor(
        invitedInteractor: InvitedInteractorImpl
    ): InvitedInteractor
}