package com.example.testcompose.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcompose.theme.Spacing_2
import com.example.testcompose.ui.theme.TestComposeTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserName(onNameChanged: (String) -> Unit){
    var name by remember { mutableStateOf("")
}
    Column (
        modifier = Modifier.padding(Spacing_2),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            value = name,
            onValueChange = {
                name = it
                onNameChanged(it)
            },
            label = { Text(text="What is your name?") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
        )
    }

}

@Preview
@Composable
fun UserNamePreview() {
    TestComposeTheme {
        UserName{

        }
    }
}
