package com.example.fishermanguide.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fishermanguide.Navigation.BaseActivity
import com.example.fishermanguide.R

class TackleActivity : BaseActivity(1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()
    }
}