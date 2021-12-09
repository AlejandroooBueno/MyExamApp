package com.example.myexamapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val condBrandTextView: TextView = itemView.findViewById(R.id.cond_brand_textview)
    private val condImageView: ImageView = itemView.findViewById(R.id.cond_image_view)
    fun bind(cond: Cond) {
        condBrandTextView.text = cond.brand
        condImageView.setImageResource(cond.image)
    }

}