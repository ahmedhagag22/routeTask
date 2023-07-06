package com.example.domain.repo.contract

import com.example.domain.entity.CategoryResponse
import retrofit2.Response

interface ProductRepo {
    suspend fun getProductFormRemoted(): Response<CategoryResponse>
}