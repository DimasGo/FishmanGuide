package com.example.fishermanguide.utility

import android.app.Activity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

open class Untility : AppCompatActivity(){

    fun Massage(Text: String) {
        Toast.makeText(this, Text, Toast.LENGTH_SHORT).show()
    }

    fun TestFun(number: Int){

    }
}
