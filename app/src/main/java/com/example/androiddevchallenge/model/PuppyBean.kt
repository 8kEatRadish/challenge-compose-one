package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes

data class PuppyBean(
    val name: String,
    val age: String,
    @DrawableRes val image: Int,
    @DrawableRes val image2: Int,
    val introduction: String,
    val variety: String,
    val gender: String
)