package com.example.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpackcomposebasic.ui.theme.JetpackComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                JetpackComposeBasicTheme {
                    Column {
                        ShowImage()
                    }
                }
            }
        }
    }
}

@Composable

fun ShowImage(
    countViewModel: CountViewModel = viewModel()
) {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //viewModelの変数を結びつけながら初期値設定する
            val countTapStar by countViewModel.starCount.observeAsState(initial = 0)
            val countTapTriangle by countViewModel.triangleCount.observeAsState(initial = 0)
            Row {
                Text(
                    text = "Star:$countTapStar ,",
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.cherry_rose)
                )
                Text(
                    text = "Triangle:$countTapTriangle",
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.moegi)
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.icon_svg), contentDescription = "",
                    modifier = Modifier
                        .size(108.dp)
                        .border(1.dp, color = colorResource(id = R.color.moegi))
                        .clickable { countViewModel.starCountUp() },
                    contentScale = ContentScale.Crop,
                )
                Image(
                    painter = painterResource(id = R.drawable.triangle),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(108.dp)
                        .clickable { countViewModel.triangleCountUp() })
            }
        }
    }
}

@Composable
fun ResponseComposable() {
    Text(
        text = stringResource(id = R.string.clicked_button),
        color = colorResource(id = R.color.chartreuse_green),
        fontSize = 20.sp
    )
}
