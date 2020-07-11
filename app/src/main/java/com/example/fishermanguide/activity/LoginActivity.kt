package com.example.fishermanguide.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.example.fishermanguide.R
import com.example.fishermanguide.utility.Untility
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : Untility(), TextWatcher, View.OnClickListener {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        button_login.isEnabled = false
        email_editext.addTextChangedListener(this)
        password_editext.addTextChangedListener(this)

        button_login.setOnClickListener(this)

        mAuth = FirebaseAuth.getInstance()
    }

    override fun afterTextChanged(p0: Editable?) {
        button_login.isEnabled = validate(email_editext.text.toString(),  password_editext.text.toString())
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onClick(p0: View) {
       val email = email_editext.text.toString()
        val password = password_editext.text.toString()

        Massage("Expect. Data verification in progress")

        if(validate(email, password)){
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(){
                if(it.isSuccessful){
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
        }
        else{
            Massage("Error")
        }
    }

    private fun validate(email: String, password: String) =
        email.isNotEmpty() && password.isNotEmpty()

    fun Create_new_account(view: View) {
        startActivity(Intent(this, Registration::class.java))
    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }
}