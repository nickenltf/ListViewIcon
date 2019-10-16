package com.uty.mylistview.Model

import com.uty.mylistview.R
import java.util.ArrayList
import kotlin.collections.ArrayList

object `FoodData` {
    private val foodName = arrayOf(
        "Ayam Bakar",
        "Burger",
        "Lobster",
        "Macarons",
        "Pasta",
        "Pizza",
        "Salad",
        "Sandwich",
        "Steak",
        "Sushi")

    private val detail = arrayOf(
        "Ayam Bakar adalah makanan yang sangat enak",
        "Burger adalah makanan yang terbuat dari lapisan roti dan daging",
        "Lobster adalah makanan laut yang enak sekali",
        "Macaronsb adalah makanan yang manis yang rata rata semua orang suka apalagi anak anak",
        "Pasta adalah makanan semacam mie yang enak sekali",
        "Pizza adalah makanan yang terbuat dari roti biasanya dengan topping daging pepperoni dan saus",
        "Salad adalah makanan yang terbuat dari sayuran yang sangat sehat",
        "Sandwich adalah makanan yang terbuat dari roti yang ditumpuk atau roti isi",
        "Steak adalah makanan dari daging yang dipanggang",
        "Sushi adalah makanan yang berasal dari jepang menggunakan nasi")

    private val foodPoster = intArrayOf(
        R.drawable.ayam,
        R.drawable.burger,
        R.drawable.lobster,
        R.drawable.macarons,
        R.drawable.pasta,
        R.drawable.pizzzzzzza,
        R.drawable.salad,
        R.drawable.sandwich,
        R.drawable.steak,
        R.drawable.sushi)

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = food_poster[position]
                list.add(food)
            }
            return list
        }
}
