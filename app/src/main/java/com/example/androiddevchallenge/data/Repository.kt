package com.example.androiddevchallenge.data

import androidx.compose.runtime.mutableStateOf
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.PuppyBean

object Repository {
    val dogs = mutableStateOf(
        arrayListOf(
            PuppyBean(
                "小黄", "7个月", R.drawable.xiaohuang_img1,
                R.drawable.xiaohuang_img2,
                "科学喂养，不散养，定期驱虫、洗澡，不离不弃 /:heart\n" +
                        "小小黄是朋友在风景区里看到的狗仔，7个月大，耳朵又大又立、" +
                        "小爪爪短小可爱。性格亲人，从不乱吠，还会自动躺倒求摸摸\uD83E\uDD70 希望有好心人带它回家，让它过上幸福狗生",
                "小狗", "妹妹"
            ),
            PuppyBean(
                "博美弟弟", "10个月", R.drawable.bomei_img1,
                R.drawable.bomei_img2,
                "一只博美弟弟求主人收养，所有疫苗齐全，身体健康，能吃能拉，现在在上海闵行区，可送狗狗的笼子，尿片，狗粮零食等……",
                "博美", "弟弟"
            ),
            PuppyBean(
                "小不点", "1个月", R.drawable.xiaobudian_img1,
                R.drawable.xiaobudian_img2,
                "狗狗是被遗弃狗妈妈所生的，妈妈是个迷你犬重四斤左右，是一个外国留学生养的，因为狗狗怀孕了怕坐飞机有危险所以委托给了志愿者代为找领养。 狗妈妈特别聪明，会看家会看脸色，会看家 ，关键特别仁义！现在还帮着哺喂刚出生就被扔到垃圾桶的小哥。",
                "小狗", "弟弟"
            ),
            PuppyBean(
                "球球", "4个月", R.drawable.qiuqiu_img1,
                R.drawable.qiuqiu_img2,
                "邻家小妹妹在垃圾桶里捡回来的，4个多月大，非常聪明懂事，会听指令，会很多技能，找有爱心有责任心的深圳居住的家庭领养",
                "小狗", "妹妹"
            ),
            PuppyBean(
                "旺财", "7个月", R.drawable.wangcai_img1,
                R.drawable.wangcai_img2,
                "合租不送养，位于汉阳区王家湾。旺财弟弟，7、8个月左右，小型犬，很帅，雪纳瑞的串串，生活习惯很好。刚捡到时长得有点像小羊，经美容洗澡后恢复了帅气美貌。活泼亲人，特别粘人。完全没有任何攻击性，喜欢跟人玩，也喜欢各种玩具。已驱虫、已绝育。",
                "小狗", "弟弟"
            ),
            PuppyBean(
                "不错", "一岁半", R.drawable.bucuo_img1,
                R.drawable.bucuo_img2,
                "公巴哥，品相很好，是表情包高产户，接近3000元购入，疫苗齐全，已绝育。会定点上厕所，会坐下会握手，已习惯睡狗窝关围栏里。运动量不大，不需要经常遛狗，适合懒人领养。由于结婚怀孕，且先生已养有两只狗狗，所以只能忍痛割爱，希望能帮它找到负责它一生的人，不离不弃，对它好，家里人也同意支持的[可怜]丑萌丑萌的非常可爱，有意者豆油私信我。领养人需签订领养协议，留下领养人身份证复印件（标注仅限领养使用），并不定期上门家访或视频回访，防止出现恶意领养。",
                "八哥", "弟弟"
            ),
        )
    )
}