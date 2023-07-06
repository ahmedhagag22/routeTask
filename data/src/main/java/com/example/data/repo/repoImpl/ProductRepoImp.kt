package com.example.data.repo.repoImpl

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.contract.ProductRepo
import retrofit2.Response

class ProductRepoImp  (private var apiService: ApiService) : ProductRepo {
   override suspend fun getProductFormRemoted(): Response<CategoryResponse> = apiService.getProduct()
}