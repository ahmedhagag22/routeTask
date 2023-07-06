package com.example.domain.entity

data class Product(
    val brand: String,
    val category: String,
    val description: String,
    val discountPercentage: String,
    val id: Int,
    val images: List<String>,
    val price: Int,
    val rating: String,
    val stock: Int,
    val thumbnail: String,
    val title: String
)