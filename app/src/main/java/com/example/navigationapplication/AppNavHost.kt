package com.example.navigationapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navHostController: NavHostController
){
    NavHost(
        navController = navHostController,
        startDestination = "Home"
    ) {
        composable("Home"){
            HomeScreen(navHostController)
        }

        composable("Detail"){
            DetailScreen(navHostController, "Ravikant")
        }
    }
}