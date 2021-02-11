package com.example.locator.core


    fun login (username: String, password: String) : Boolean {
        return username.equals("miusuario") && password.equals("secret_key")
        //return true
    }

