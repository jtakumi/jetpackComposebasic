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
import androidx.compose.material3.Button
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
                pressJudge()
            }
        }
    }
}

@Composable
fun pressJudge(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var isButtonPressed by remember{ mutableStateOf(false)}
        QuestionComposable{
            if(isButtonPressed){
                isButtonPressed=false
            }else{
                isButtonPressed=true
            }

        }
        if (isButtonPressed){
            ResponseComposable()
        }
    }
}
@Composable
fun QuestionComposable(onClick:()-> Unit = {}) {
    Text(
        text = stringResource(id = R.string.announce_click),
        color = colorResource(id = R.color.apple_green),
        fontSize = 20.sp,
        modifier = Modifier.padding(12.dp)
    )
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 4.dp)
    ) {
        Text(text = stringResource(id = R.string.click_button))
    }
}
@Composable
fun ResponseComposable(){
    Text(
        text = stringResource(id = R.string.clicked_button),
        color = colorResource(id =R.color.chartreuse_green),
        fontSize = 20.sp
    )
}
