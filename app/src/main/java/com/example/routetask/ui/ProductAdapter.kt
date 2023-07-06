package com.example.routetask.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.entity.Product
import com.example.routetask.databinding.ItemsBinding

class ProductAdapter(var items: List<Product?>?) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(val viewBinding: ItemsBinding) : RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(news: Product?) {
            viewBinding.product = news
            viewBinding.invalidateAll()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var viewBinding = ItemsBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var items = items?.get(position)
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

//    fun changeDate(products: List<Product?>?) {
//        items = products
//        notifyDataSetChanged()
//
//    }

}


//class MealsAdapter() :ListAdapter<Category, MealsAdapter.ViewHolder>(CategoryDiffCallback()) {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ViewHolder(itemBinding)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(getItem(position))
//    }
//
//    class ViewHolder(private val itemBinding: ItemsBinding) : RecyclerView.ViewHolder(itemBinding.root) {
//        fun bind(category: Category) {
////            itemBinding.categoryNameTv.text = category.strCategory
////            itemBinding.categoryDesTv.text = category.strCategoryDescription
////            Glide.with(itemBinding.root.context).load(category.strCategoryThumb).into(itemBinding.categoryIv)
//        }
//    }
//
////    class CategoryDiffCallback : DiffUtil.ItemCallback<Category>() {
////        override fun areItemsTheSame(
////            oldItem: Category,
////            newItem: Category
////        ): Boolean {
////            return oldItem. == newItem.idCategory
////        }
//
////        override fun areContentsTheSame(
////            oldItem: Category,
////            newItem: Category
////        ): Boolean {
////            return oldItem == newItem
////        }
////    }
//}

