package com.example.navigationapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(
    navHostController: NavHostController,
    name : String
){
    Text(text = "Detail $name")
    
    Button(onClick = { navHostController.popBackStack() }) {
        Text(text = "Back to Home")
    }
}