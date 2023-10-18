package com.example.pamatt_18_10_23.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pamatt_18_10_23.views.AnuncieScreen
import com.example.pamatt_18_10_23.views.ComprarScreen
import com.example.pamatt_18_10_23.views.HomeScreen
import com.example.pamatt_18_10_23.views.NovoScreen
import com.example.pamatt_18_10_23.views.SobreScreen

@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            HomeScreen(navController)
        }

        composable("comprar"){
            ComprarScreen(navController)
        }

        composable("novo"){
            NovoScreen(navController)
        }

        composable("anuncie"){
            AnuncieScreen(navController)
        }

        composable("sobre"){
            SobreScreen(navController)
        }


    }

}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}