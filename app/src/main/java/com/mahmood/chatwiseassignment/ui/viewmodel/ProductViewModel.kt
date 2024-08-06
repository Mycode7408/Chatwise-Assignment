package com.mahmood.chatwiseassignment.ui.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmood.data.model.Product
import com.mahmood.data.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    private val repository = ProductRepository()
    val products = MutableLiveData<List<Product>>()

    fun fetchProducts() {
        viewModelScope.launch {
            val response = repository.getProducts()
            if (response.isSuccessful) {
                products.postValue(response.body()?.products)
            }
        }
    }
}
