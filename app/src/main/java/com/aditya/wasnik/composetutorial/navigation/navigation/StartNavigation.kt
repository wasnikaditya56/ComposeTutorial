package com.aditya.wasnik.composetutorial.navigation.navigation

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.aditya.wasnik.composetutorial.navigation.screen.FirstScreen
import com.aditya.wasnik.composetutorial.navigation.screen.SecondScreen
import com.aditya.wasnik.composetutorial.navigation.screen.ThirdScreen
import com.aditya.wasnik.composetutorial.navigation.utils.NavigationScreen

@Composable
fun StartNavigation(context: Activity) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.FirstScreen.route) {
        composable(NavigationScreen.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(NavigationScreen.SecondScreen.route) {
            val data = it.arguments?.getString("data")
            SecondScreen(context, navController, data)
        }
        composable(NavigationScreen.ThirdScreen.route) {
            ThirdScreen()
        }
    }
}
