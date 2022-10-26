package com.example.spacex.di

import com.example.spacex.models.IRepository
import com.example.spacex.models.Repository
import com.example.spacex.models.remote.Service
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideRepository(service: Service): IRepository = Repository(service)
}