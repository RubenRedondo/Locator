package com.example.locator

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.locator.core.login


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        val usernametxt = findViewById<EditText>(R.id.usernametxt);
        val passwordtxt = findViewById<EditText>(R.id.passwordtxt);
        val gobtn = findViewById<Button>(R.id.gobtn);

        gobtn.setOnClickListener{
            var auth = login(usernametxt.text.toString(), passwordtxt.text.toString())
            var dialog : CustomDialog
            if(auth){
                val i = Intent(this, HomeActivity::class.java)
                startActivity(i)
            } else {
                dialog = CustomDialog(this, "Error :(", "Your credentials are not valid.", "Try again" )
                dialog.showDialog()
            }
        }
    }


}