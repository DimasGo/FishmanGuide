package com.example.fishermanguide.Activity

import android.os.Bundle
import com.example.fishermanguide.Navigation.BaseActivity
import com.example.fishermanguide.R

class MainActivity : BaseActivity(0) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()
    }
}