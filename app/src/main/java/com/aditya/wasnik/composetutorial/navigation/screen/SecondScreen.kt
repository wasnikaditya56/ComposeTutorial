package com.aditya.wasnik.composetutorial.navigation.screen

import android.app.Activity
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aditya.wasnik.composetutorial.navigation.utils.NavigationScreen

@Composable
fun SecondScreen(context: Activity, navHostController: NavHostController, data: String?) {

    println("DummyData :   "+ data)
    Button(onClick = {
        navHostController.navigate(NavigationScreen.ThirdScreen.route){
            launchSingleTop = true
        }
    }) {
        Text(text = "Goto another activity")
    }
}