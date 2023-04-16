package com.farhanrv.southeastasiannations.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Detail : Screen("home/{name}") {
        fun createRoute(name: String) = "home/$name"
    }
    object About : Screen("about") {
        fun createRoute() = "about"
    }
}