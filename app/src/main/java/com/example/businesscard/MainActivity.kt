package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCompose()
                }
            }
        }
    }
}

@Composable
fun BusinessCompose(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val androidBackground = colorResource(R.color.android_background)
    val backgroundColor = colorResource(R.color.background)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
//            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Box(
            modifier = modifier.background(androidBackground)
        ) {
            Image(
                painter = image,
                contentDescription = "Android Logo",
                modifier = modifier.width(200.dp)
            )

        }
        Text(
            text = "Débora Barros",
            fontSize = 48.sp,
            color = colorResource(R.color.name_color),
            modifier = modifier.padding(top = 12.dp)
        )
        Text(
            text = "Android Developer",
            fontSize = 22.sp,
            color = colorResource(R.color.description_color),
            modifier = modifier.padding(top = 10.dp),
            fontWeight = FontWeight.Bold
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null,
                    color = colorResource(R.color.description_color)
                )
                Text(text = "teste", color = colorResource(R.color.info_color))
                Text(text = "teste", color = colorResource(R.color.info_color))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessComposePreview() {
    BusinessCardTheme {
        BusinessCompose()
    }
}