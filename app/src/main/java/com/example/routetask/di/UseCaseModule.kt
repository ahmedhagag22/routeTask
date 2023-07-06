package com.example.routetask.di

import com.example.domain.repo.contract.ProductRepo
import com.example.domain.usecase.GetProduct
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(productRepo: ProductRepo): GetProduct {
        return GetProduct(productRepo)
    }

}