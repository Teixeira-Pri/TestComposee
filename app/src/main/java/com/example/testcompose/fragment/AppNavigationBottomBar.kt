package com.example.testcompose.fragment

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.testcompose.ui.theme.TestComposeTheme

@Composable
fun AppNavigationBottomBar() {
    BottomAppBar {

    }
}

@Preview
@Composable
fun AppNavigationBottomBarPreview() {
    TestComposeTheme {
        AppNavigationBottomBar()
    }
}