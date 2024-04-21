package com.aditya.wasnik.composetutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.wasnik.composetutorial.ui.theme.ComposeTutorialTheme

class LoginActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    LoginScreen()
                }
            }
        }

    }
}

private fun logged(username: String, password: String){
    if (username == "akash" && password == "12345") {
       // Toast.makeText(this, "Success", Toast.LENGTH_LONG ).show()
        Log.e("LoginActivity", "logged: Success" )
    }
    else {
       // Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show()
        Log.e("LoginActivity", "logged: Failed" )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
            Text(text = "Hello Aditya", fontSize = 25.sp, color = Color.Blue,
            fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
        Text(text = "Welcome to", fontSize = 25.sp, color = Color.Blue,
            fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace
        )
        Text(text = "Coding", color = Color.Blue, fontSize = 25.sp,
            fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(
            value = username.value,
            onValueChange = {
                username.value = it
            },
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },
            label = {
                Text(text = "Username")
            },
            placeholder = {
                Text(text = "Enter username ")
            },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            leadingIcon = {
                Icon(Icons.Default.Info, contentDescription = "info")
            },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Enter password")
            },
            modifier = Modifier.fillMaxWidth()
        )
       OutlinedButton(onClick = { logged(username.value, password.value)},
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 10.dp)
           ) {
            Text(text = "Login")
       }
    }
}
