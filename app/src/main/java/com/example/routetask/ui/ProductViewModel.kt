package com.example.routetask.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.CategoryResponse
import com.example.domain.entity.Product
import com.example.domain.usecase.GetProduct
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor
    (private var getProductUseCase: GetProduct
    ) : ViewModel() {

    private val _categories: MutableStateFlow<List<Product>?> = MutableStateFlow(null)
    val categories: StateFlow<List<Product>?> = _categories
    fun getProduct() {
        viewModelScope.launch {
            try {
                _categories.emit(getProductUseCase.invoke())
            } catch (e: Exception) {
                Log.e("productViewModel", e.message.toString())
            }
        }
    }

}