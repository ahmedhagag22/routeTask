package com.example.data.remote

import com.example.domain.entity.CategoryResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProduct(): Response<CategoryResponse>
}