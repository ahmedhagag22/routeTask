package com.example.routetask.di

import com.example.data.remote.ApiService
import com.example.data.repo.repoImpl.ProductRepoImp
import com.example.domain.repo.contract.ProductRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService):ProductRepo{
        return ProductRepoImp(apiService)
    }
}