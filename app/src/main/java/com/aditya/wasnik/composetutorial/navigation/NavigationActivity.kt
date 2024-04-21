package com.aditya.wasnik.composetutorial.navigation

import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.aditya.wasnik.composetutorial.navigation.navigation.StartNavigation
import com.aditya.wasnik.composetutorial.ui.theme.ComposeTutorialTheme

class NavigationActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme() {
                Surface {
                   StartNavigation(this)
                }
            }
        }
    }
}