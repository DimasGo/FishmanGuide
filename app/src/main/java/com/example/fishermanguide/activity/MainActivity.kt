package com.example.fishermanguide.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fishermanguide.base.BaseActivity
import com.example.fishermanguide.R
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth
import kotlin.math.log

class MainActivity : BaseActivity(0) {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()

        //FireBase
        mAuth = FirebaseAuth.getInstance()

    }

   override fun onStart() {
    super.onStart()
          if(mAuth.currentUser == null){
           startActivity(Intent(this, LoginActivity::class.java))
           finish()
        }
    }

    fun onClickImage(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}