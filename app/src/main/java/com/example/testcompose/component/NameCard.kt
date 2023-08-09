package com.example.testcompose.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcompose.theme.Spacing_2
import com.example.testcompose.theme.Spacing_3
import com.example.testcompose.ui.theme.TestComposeTheme

@Composable
fun NameCard(
    modifier: Modifier = Modifier
) {
    AppCard (
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Spacing_2)
    ){
        Column (modifier = Modifier.padding(Spacing_2)){
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween

            ){
                Row (modifier = Modifier.fillMaxWidth()){
                    Icon(imageVector = Icons.Filled.Place,
                        contentDescription = "Place"
                    )
                    Text(modifier = Modifier.padding(start = Spacing_3),
                        text = "Distance"
                    )
                }

            }

        }

    }

}

@Preview
@Composable
fun NameCardPreview() {
    TestComposeTheme {
        NameCard()
    }
}