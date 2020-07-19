package com.example.fishermanguide.activity

import android.os.Bundle
import android.view.View
import com.example.fishermanguide.R
import com.example.fishermanguide.utility.Untility
import kotlinx.android.synthetic.main.activity_registrationctivity.*

class Registration : Untility() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrationctivity)
    }

    fun Create_new_account_button(view: View) {
        validate()
    }

    fun validate(){
        if (email_editext.text.toString().isNotEmpty() && password_editext.text.toString().isNotEmpty() && username_text.text.toString().isNotEmpty()){
            Massage("Expect. Data verification in progress")
        }
        else{
            Massage("Error")
        }

    }
}