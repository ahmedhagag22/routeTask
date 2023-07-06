package com.example

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.routetask.R

@BindingAdapter("imageUrl")
fun loadImageByTheUrlGlide(imageView: ImageView, url:String)
{
    Glide.with(imageView)
        .load(url)
        .placeholder(R.drawable.ic_add)
        .into(imageView)
}