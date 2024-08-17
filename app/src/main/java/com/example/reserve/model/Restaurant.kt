package com.example.reserve.model

data class Restaurant(
    val name: String,
    val urlImage: String,
    val address: String,
    val services: MutableList<Service>,
    val menuCategory: MutableList<CategoryDish>,
    val reviews: MutableList<Review>,
    val numberPhone: String
)
