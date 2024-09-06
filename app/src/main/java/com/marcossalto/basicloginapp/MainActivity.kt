package com.marcossalto.basicloginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.marcossalto.basicloginapp.ui.screens.LoginScreen
import com.marcossalto.basicloginapp.ui.theme.BasicLoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicLoginAppTheme {
                LoginScreen()
            }
        }
    }
}
