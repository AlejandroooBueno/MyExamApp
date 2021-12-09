package com.example.myexamapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CondAdapter(private val condList:List<Cond>) : RecyclerView.Adapter<CondViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CondViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_cond, parent, false)
        return CondViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: CondViewHolder, position: Int) {
        val cond= condList[position]
        holder.bind(cond)
    }

    override fun getItemCount(): Int {
        return condList.size
    }


}