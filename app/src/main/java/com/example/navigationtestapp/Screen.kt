package com.example.navigationtestapp

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    //必須の引数とオプションの引数を正しく渡すための関数
    //varargで任意の長さの引数を受け取る
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }
}

