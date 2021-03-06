package com.frogobox.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ColumnActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnActivityUI()
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ColumnActivityUI() {
    Column() {
        Text(text = "Learning Jetpack Compose")
        Text(text = "Hello Jetpack Compose")
    }
}