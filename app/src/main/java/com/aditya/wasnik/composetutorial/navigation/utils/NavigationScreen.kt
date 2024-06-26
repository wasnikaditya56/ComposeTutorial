package com.aditya.wasnik.composetutorial.navigation.utils

sealed class NavigationScreen(val route: String) {

    object FirstScreen : NavigationScreen("firstscreen")
    object SecondScreen : NavigationScreen("{data}/secondscreen") {
        fun createRoute(data:String) = "$data/secondscreen"
    }
    object ThirdScreen : NavigationScreen("thirdscreen")
}