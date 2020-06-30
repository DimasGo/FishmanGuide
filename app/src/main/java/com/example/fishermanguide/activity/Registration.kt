package com.example.fishermanguide.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fishermanguide.R
import kotlinx.android.synthetic.main.activity_registrationctivity.*

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrationctivity)
    }

    fun Create_new_account_button(view: View) {
        validate()
    }

    fun validate(){
        if (email_editext.text.toString().isNotEmpty() && password_editext.text.toString().isNotEmpty() && username_text.text.toString().isNotEmpty()){
            Toast.makeText(this, "Expect. Data verification in progress", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()

        }
    }
}