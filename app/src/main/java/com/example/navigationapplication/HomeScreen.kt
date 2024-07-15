package com.example.navigationapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navHostController: NavHostController
){
    Text(text = "Home")
    Button(onClick = { navHostController.navigate("Detail") }) {
        Text(text = "Go to Details")
    }
}