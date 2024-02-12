package com.example.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
                inputText()
            }
        }
    }
}
data class LongStory(val part:String,val textColor:Int,val textSize:Int)

@Composable
fun appScreen() {
    val longStory = listOf(
        LongStory("1年目 " ,R.color.cherry_rose,20),
        LongStory("成長口実 ",R.color.weak_violet,20),
        LongStory("重労働 ",R.color.moegi,20),
             LongStory("鯱川畜木",R.color.dark_red,16)
            )
    LazyColumn {
        items(longStory){story ->
            Text(text = story.part, color = colorResource(id = story.textColor), fontSize = story.textSize.sp)
        }
    }
}
@Composable
fun buttonBackGround(){
    Text(text = stringResource(id = R.string.hello_world), fontSize = 16.sp, modifier = Modifier
        .background(
            color = colorResource(id = R.color.deep_sky_blue),
            RoundedCornerShape(20.dp)
        )
        .border(2.dp, Color.Black, RoundedCornerShape(20.dp))
        .padding(20.dp))
}
@Composable
fun showImage(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var countTapStar by remember{
            mutableStateOf(0)
        }
        var countTapTriangle by remember{
            mutableStateOf(0)
        }
        Row{
            Text(text = "Star:$countTapStar ,")
            Text(text = "Triangle:$countTapTriangle")
        }
        Row{
            Image(
                painter = painterResource(id = R.drawable.icon_svg), contentDescription = "",
                modifier = Modifier
                    .size(108.dp)
                    .border(1.dp, color = colorResource(id = R.color.moegi))
                    .clickable { countTapStar++ },
                contentScale = ContentScale.Crop,
            )
            Image(
                painter = painterResource(id = R.drawable.triangle),
                contentDescription ="",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(108.dp)
                    .clickable { countTapTriangle++ })
        }
        Text(text = stringResource(id = R.string.let_me_show),
            color = colorResource(id = R.color.white),
            fontSize = 16.sp,
            modifier = Modifier.background(color = colorResource(id = R.color.deep_sky_blue)))
    }
}
@Composable
fun inputText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter){
        var userText by remember{ mutableStateOf("")}
        OutlinedTextField(value =userText, onValueChange = {userText = it},
            modifier = Modifier.padding(20.dp),
            placeholder = {Text(text="input any word")},
            maxLines = 5
        )
    }
}

