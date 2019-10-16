package com.uty.mylistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.mylistview.model.Food

class ListFoodAdapter(val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFoodAdapter.FoodViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ListFoodAdapter.FoodViewHolder, position: Int) {
        val food: Food = listFood[position]
        holder.tvFoood.text = food.name
        holder.tv_detai.text = food.detail
        Glide.with(holder.itemView.context)
            .load(food.poster)
            .into(holder.imgPoster)
    }

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFoood: TextView = itemView.findViewById(R.id.tv_item_nama)
        val tv_detai: TextView = itemView.findViewById(R.id.tv_item_detail)
        val imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }

}