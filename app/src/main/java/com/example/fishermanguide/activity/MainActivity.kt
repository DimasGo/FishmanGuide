package com.example.fishermanguide.activity

import android.os.Bundle
import android.widget.Toast
import com.example.fishermanguide.base.BaseActivity
import com.example.fishermanguide.R
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth
import kotlin.math.log

class MainActivity : BaseActivity(0) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()

        //FireBase
        /*
        val auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword("dima_goncharuk@gmail.com", "dima020992")
            .addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(applicationContext, "Sign In", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, "Error Sign In", Toast.LENGTH_SHORT).show()
                }
            }
        */
    }
}