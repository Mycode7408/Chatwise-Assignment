package com.mahmood.chatwiseassignment.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.mahmood.chatwiseassignment.R
import com.mahmood.chatwiseassignment.ui.productlist.ProductListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnViewProducts).setOnClickListener {
            startActivity(Intent(this, ProductListActivity::class.java))
        }
    }
}