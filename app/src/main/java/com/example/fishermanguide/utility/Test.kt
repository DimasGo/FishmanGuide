package com.example.fishermanguide.utility

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class Test() : AppCompatActivity(){

    fun TestMassage(Text: String) {
        Toast.makeText(this, Text, Toast.LENGTH_SHORT).show()
    }


}