package com.example.locator

import android.app.Activity
import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CustomDialog : AppCompatActivity {

    var _activity : Activity
    var _title : String
    var _text1 : String
    var _text2 : String
    lateinit var alertDialog: AlertDialog

    constructor(activity: Activity, title: String, text1: String, text2: String){
        _activity = activity
        _title = title
        _text1 = text1
        _text2 = text2
    }

    fun showDialog () {
        var builder : AlertDialog.Builder = AlertDialog.Builder(_activity)
        var inflater: LayoutInflater = _activity.layoutInflater
        var content = inflater.inflate(R.layout.custom_dialog, null)
        builder.setView(content)

        val title = content.findViewById<TextView>(R.id.title)
        val text1 = content.findViewById<TextView>(R.id.text1)
        val text2 = content.findViewById<TextView>(R.id.text2)

        title.text = _title
        text1.text = _text1
        text2.text = _text2

        builder.setCancelable(true)

        alertDialog = builder.create()
        alertDialog.show()

    }

}