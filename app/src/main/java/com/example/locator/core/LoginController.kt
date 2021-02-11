package com.example.locator.core

//Auth methods would be here

    fun login (username: String, password: String) : Boolean {
        return username.equals("miusuario") && password.equals("secret_key")
        //return true
    }

