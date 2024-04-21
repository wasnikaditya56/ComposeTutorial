package com.aditya.wasnik.composetutorial.components.screen

import android.annotation.SuppressLint
import android.widget.Toolbar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.aditya.wasnik.composetutorial.Greeting


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Hey Aditya")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Menu, contentDescription = "menu")
                    }
                },
                actions = {
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Notifications, contentDescription = "notification")
                    }
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Search, contentDescription = "search")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Filled.Add, contentDescription = "add")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Greeting(name = "Android")
    }
}

