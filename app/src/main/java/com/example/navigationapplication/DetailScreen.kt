package com.example.navigationapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(
    navHostController: NavHostController
){
    Text(text = "Detail")
    
    Button(onClick = { navHostController.popBackStack() }) {
        Text(text = "Back to Home")
    }
}