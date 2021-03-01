package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Repository
import com.example.androiddevchallenge.model.PuppyBean

@Composable
fun PuppyItem(puppyBean: PuppyBean) {
    Box(
        Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(Color.Black)
            .clickable {
                Repository.currentPuppy.value = puppyBean
            },
        contentAlignment = Alignment.CenterStart
    ) {
        Image(
            painter = painterResource(id = puppyBean.image),
            contentDescription = null,
            Modifier.fillMaxSize(1f),
            alpha = 0.3f,
            contentScale = ContentScale.Crop
        )

        Row(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(1f)
        ) {
            Image(
                painter = painterResource(id = puppyBean.image2), contentDescription = null,
                Modifier
                    .width(150.dp)
                    .height(150.dp),
                alpha = 1f, contentScale = ContentScale.Crop,
            )
            Spacer(modifier = Modifier.width(60.dp))
            Column() {
                Text(
                    text = puppyBean.name,
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        fontSize = 30.sp
                    )

                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = puppyBean.variety,
                    style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = puppyBean.age,
                    style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = puppyBean.gender,
                    style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        fontSize = 20.sp
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun showPuppyItem() {
    PuppyItem(
        puppyBean = PuppyBean(
            "不错", "一岁半", R.drawable.bucuo_img1,
            R.drawable.bucuo_img2,
            "公巴哥，品相很好，是表情包高产户，接近3000元购入，疫苗齐全，已绝育。会定点上厕所，会坐下会握手，已习惯睡狗窝关围栏里。运动量不大，不需要经常遛狗，适合懒人领养。由于结婚怀孕，且先生已养有两只狗狗，所以只能忍痛割爱，希望能帮它找到负责它一生的人，不离不弃，对它好，家里人也同意支持的[可怜]丑萌丑萌的非常可爱，有意者豆油私信我。领养人需签订领养协议，留下领养人身份证复印件（标注仅限领养使用），并不定期上门家访或视频回访，防止出现恶意领养。",
            "八哥", "弟弟"
        )
    )
}