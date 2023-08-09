package com.example.testcompose.component

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcompose.ui.theme.TestComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarApp() {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
        ),
        title = {
            Text(text = "Just run!")
        }
    )
}

@Preview
@Composable
fun TopBarAppPreview() {
    TestComposeTheme {
        TopBarApp()
    }

}