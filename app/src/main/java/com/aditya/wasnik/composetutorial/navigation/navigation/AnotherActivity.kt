package com.aditya.wasnik.composetutorial.navigation.navigation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.aditya.wasnik.composetutorial.ui.theme.ComposeTutorialTheme

class AnotherActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface() {

                }
            }
        }
    }
}