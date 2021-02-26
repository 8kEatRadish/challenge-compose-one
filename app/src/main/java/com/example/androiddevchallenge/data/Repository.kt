package com.example.androiddevchallenge.data

import androidx.compose.runtime.mutableStateOf
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.DogBean
import kotlinx.coroutines.flow.MutableStateFlow

object Repository {
    val dogs = mutableStateOf(
        arrayListOf(
            DogBean("xiaochai", 1, R.mipmap.chai),
            DogBean("xiaohei", 2, R.mipmap.hei),
            DogBean("xiaojin", 2, R.mipmap.jin),
            DogBean("erha", 1, R.mipmap.erha),
            DogBean("xiaoke", 4, R.mipmap.ke),
            DogBean("shou", 3, R.mipmap.shou)
        )
    )
}