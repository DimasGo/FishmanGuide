package com.example.fishermanguide.Activity

import android.os.Bundle
import com.example.fishermanguide.base.BaseActivity
import com.example.fishermanguide.R

class TackleActivity : BaseActivity(1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()
    }
}