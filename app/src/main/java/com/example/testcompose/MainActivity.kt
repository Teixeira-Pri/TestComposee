package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.component.CircularProgressIndicator
import com.example.testcompose.ui.theme.TestComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color.DarkGray),
                        initialValue = 5,
                        primaryColor = Color.Red,
                        secondaryColor = Color.Blue,
                        circleRadius = 230f,
                        onPositionChange = { position ->

                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MainActivityPreview() {
    TestComposeTheme {
        MainActivity()
    }
}

