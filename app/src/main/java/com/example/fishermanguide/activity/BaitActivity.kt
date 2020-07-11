package com.example.fishermanguide.activity

import android.os.Bundle
import com.example.fishermanguide.base.BaseActivity
import com.example.fishermanguide.R

class BaitActivity : BaseActivity(2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetupBottomNavigation()
    }
}