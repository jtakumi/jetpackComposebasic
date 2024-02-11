package com.example.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                appScreen()
                showImage()

            }
        }
    }
}

@Composable
fun appScreen() {
    val longStory = "1年目 " +
            "成長口実 " +
            "重労働 " +
            "鯱川畜木"

    Column {
        Text(text = stringResource(id = R.string.hello_world), color = Color.Red, fontSize = 16.sp)
        Text(text = stringResource(id = R.string.font_10), color = Color.DarkGray, fontSize = 10.sp)
        Text(
            text = stringResource(id = R.string.font_30),
            color = Color.DarkGray,
            fontSize = 30f.sp
        )
        Text(text = stringResource(id = R.string.font_50), color = Color.DarkGray, fontSize = 50.sp)
        Text(text = "")
        Text(text = longStory, color = colorResource(id = R.color.cherry_rose))
        Text(text = longStory, color = colorResource(id = R.color.weak_violet))
        Text(text = longStory, color = colorResource(id = R.color.moegi))
        Text(text = longStory, color = colorResource(id = R.color.dark_red))
        Text(text = stringResource(id = R.string.hello_world), fontSize = 16.sp, modifier = Modifier
            .background(
                color = Color(0xff66cdaa),
                RoundedCornerShape(20.dp)
            )
            .border(2.dp, Color.Black, RoundedCornerShape(20.dp))
            .padding(20.dp))
    }
}
@Composable
fun showImage(){
    Image(
        painter = painterResource(id = R.drawable.icon_svg), contentDescription = "star image",
        modifier =Modifier.border(1.dp, color = colorResource(id = R.color.white)),
        contentScale = ContentScale.Crop,
    )
}
