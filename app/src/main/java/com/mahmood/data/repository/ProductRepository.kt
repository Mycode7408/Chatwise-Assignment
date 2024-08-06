package com.mahmood.data.repository

import com.mahmood.data.api.RetrofitClient

class ProductRepository {
    private val apiService = RetrofitClient.apiService

    suspend fun getProducts() = apiService.getProducts()
}