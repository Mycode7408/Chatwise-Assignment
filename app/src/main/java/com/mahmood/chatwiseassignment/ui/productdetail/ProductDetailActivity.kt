package com.mahmood.chatwiseassignment.ui.productdetail


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.mahmood.chatwiseassignment.R
import com.mahmood.data.model.Product


class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)

        val product = intent.getSerializableExtra("product") as Product

        findViewById<TextView>(R.id.textTitle).text = product.title
        findViewById<TextView>(R.id.textDescription).text = product.description
        Glide.with(this).load(product.thumbnail).into(findViewById(R.id.imageView))
    }
}
