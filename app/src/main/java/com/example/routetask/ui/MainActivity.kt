package com.example.routetask.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.domain.entity.Product
import com.example.routetask.R
import com.example.routetask.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var adapter: ProductAdapter
    private var products = listOf<Product>()
    private val viewModel: ProductViewModel by viewModels()
    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.getProduct()

        lifecycleScope.launch {
            viewModel.categories.collect {
                products = it!!
            }
        }
                initRecyclerView()
    }

//    private fun bindProductList(produts: List<Product?>?) {
//        adapter.changeDate(produts)
//    }

    fun initRecyclerView() {

        adapter = ProductAdapter(products)
        viewBinding.recycler.adapter = adapter

    }
}