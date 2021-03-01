/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Repository
import com.example.androiddevchallenge.model.PuppyBean
import com.example.androiddevchallenge.ui.PuppyDetailsPage
import com.example.androiddevchallenge.ui.PuppyItem
import com.example.androiddevchallenge.ui.theme.MyTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }

    override fun onBackPressed() {
        if (Repository.currentPuppy.value != null) {
            Repository.currentPuppy.value = null
        } else {
            super.onBackPressed()
        }
    }
}

// Start building your app here!
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MyApp() {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "宠物领养") }, elevation = 0.dp) }
    ) {
        Box {
            LazyColumn(Modifier.padding()) {
                itemsIndexed(Repository.dogs.value) { index, item ->
                    PuppyItem(puppyBean = item)
                    Spacer(modifier = Modifier.height(3.dp))
                }
            }
            AnimatedVisibility(
                visible = Repository.currentPuppy.value != null,
                enter = slideInVertically() + fadeIn(),
                exit = slideOutVertically() + fadeOut()
            ) {

                Repository.currentPuppy.value?.apply {
                    PuppyDetailsPage(puppyBean = this)
                }
            }

        }
    }
}

@Composable
fun DogCard(dogBean: PuppyBean) {

}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
