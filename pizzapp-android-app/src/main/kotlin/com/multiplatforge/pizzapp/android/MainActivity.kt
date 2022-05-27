package com.multiplatforge.pizzapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.multiplatforge.pizzapp.android.ui.ContentView
import com.multiplatforge.pizzapp.android.ui.theme.PizzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PizzAppTheme {
                ContentView()
            }
        }
    }
}