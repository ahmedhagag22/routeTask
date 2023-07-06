package com.example.domain.usecase

import com.example.domain.repo.contract.ProductRepo

class GetProduct(private val productRepo: ProductRepo) {
   suspend operator fun invoke() =productRepo.getProductFormRemoted().body()?.products
}