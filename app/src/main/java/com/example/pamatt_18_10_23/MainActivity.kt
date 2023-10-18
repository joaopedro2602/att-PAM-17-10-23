package com.example.pamatt_18_10_23

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pamatt_18_10_23.components.NavContent
import com.example.pamatt_18_10_23.navigation.NavManager
import com.example.pamatt_18_10_23.ui.theme.PAMatt181023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMatt181023Theme {
                NavManager()
            }
        }
    }
}

