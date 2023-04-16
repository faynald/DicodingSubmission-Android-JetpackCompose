package com.farhanrv.southeastasiannations.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.farhanrv.southeastasiannations.ui.screen.about.AboutScreen
import com.farhanrv.southeastasiannations.ui.navigation.Screen
import com.farhanrv.southeastasiannations.ui.screen.detail.DetailScreen
import com.farhanrv.southeastasiannations.ui.screen.home.HomeScreen

@Composable
fun MainApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                navigateToDetail = { nation ->
                    navController.navigate(Screen.Detail.createRoute(nation.name))
                },
                navigateToAbout = {
                    navController.navigate(Screen.About.createRoute())
                }
            )
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
            })
        ) {
            val name = it.arguments?.getString("name")
            if (name != null) {
                DetailScreen(
                    nationName = name,
                    navigateBack = { navController.navigateUp() }
                )
            }
        }
        composable(Screen.About.route) {
            AboutScreen(
                navigateBack = { navController.navigateUp() }
            )
        }
    }

}