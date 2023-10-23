package com.eatingdiary.zwjnevw.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.eatingdiary.zwjnevw.TrackItApp
import com.eatingdiary.zwjnevw.ui.theme.TrackItTheme
import com.example.obfuscation.obf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        if (obf()) super.onCreate(savedInstanceState)
        setContent {
            TrackItTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Получение данных из WelcomeScreen
                    val gender = intent.getStringExtra("gender")
                    val age = intent.getIntExtra("age", 0)
                    val height = intent.getIntExtra("height", 0)

                    if (obf()) TrackItApp(Modifier.systemBarsPadding(), gender, age, height)
                }
            }
        }
    }
}