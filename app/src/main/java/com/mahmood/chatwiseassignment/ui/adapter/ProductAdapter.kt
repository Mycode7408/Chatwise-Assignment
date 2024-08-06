package com.mahmood.chatwiseassignment.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mahmood.chatwiseassignment.R
import com.mahmood.data.model.Product

class ProductAdapter(private val products: List<Any>, private val listener: OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_TITLE = 0
        const val VIEW_TYPE_PRODUCT = 1
    }

    interface OnItemClickListener {
        fun onItemClick(product: Product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_TITLE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_title, parent, false)
            TitleViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
            ProductViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ProductViewHolder) {
            val product = products[position] as Product
            holder.bind(product)
            holder.itemView.setOnClickListener {
                listener.onItemClick(product)
            }
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) VIEW_TYPE_TITLE else VIEW_TYPE_PRODUCT
    }

    class TitleViewHolder(view: View) : RecyclerView.ViewHolder(view)

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textTitle: TextView = view.findViewById(R.id.textTitle)
        private val textDescription: TextView = view.findViewById(R.id.textDescription)
        private val imageView: ImageView = view.findViewById(R.id.imageView)

        fun bind(product: Product) {
            textTitle.text = product.title
            textDescription.text = product.description
            Glide.with(itemView.context).load(product.thumbnail).into(imageView)
        }
    }
}

