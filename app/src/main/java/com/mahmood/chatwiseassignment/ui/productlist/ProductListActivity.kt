package com.mahmood.chatwiseassignment.ui.productlist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mahmood.chatwiseassignment.R
import com.mahmood.chatwiseassignment.ui.adapter.ProductAdapter
import com.mahmood.chatwiseassignment.ui.productdetail.ProductDetailActivity
import com.mahmood.chatwiseassignment.ui.viewmodel.ProductViewModel
import com.mahmood.data.model.Product

class ProductListActivity : AppCompatActivity(), ProductAdapter.OnItemClickListener {

    private lateinit var productViewModel: ProductViewModel
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this) // Setting the LayoutManager

        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        productViewModel.fetchProducts()

        productViewModel.products.observe(this) { products ->
            val items = mutableListOf<Any>("Products List").apply {
                addAll(products)
            }
            adapter = ProductAdapter(items, this)
            recyclerView.adapter = adapter
        }
    }

    override fun onItemClick(product: Product) {
        val intent = Intent(this, ProductDetailActivity::class.java)
        intent.putExtra("product", product)
        startActivity(intent)
    }
}

