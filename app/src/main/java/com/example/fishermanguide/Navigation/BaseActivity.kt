package com.example.fishermanguide.Navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.fishermanguide.*
import com.example.fishermanguide.Activity.BaitActivity
import com.example.fishermanguide.Activity.HistoryActivity
import com.example.fishermanguide.Activity.MainActivity
import com.example.fishermanguide.Activity.TackleActivity
import kotlinx.android.synthetic.main.activity_main.*

open class BaseActivity(val navNumber: Int) : AppCompatActivity() {
    fun SetupBottomNavigation(){

       // bottom_navigation_view.setIconSize(29f, 29f)
       // bottom_navigation_view.setTextVisibility(false)
        //bottom_navigation_view.enableItemShiftingMode(false)
        //bottom_navigation_view.enableShiftingMode(false)
        //bottom_navigation_view.enableAnimation(false)
       // for (i in 0 until bottom_navigation_view.menu.size()) {
         //   bottom_navigation_view.setIconTintList(i, null)
       // }

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val NextActivity =
                when(it.itemId) {
                    R.id.nav_item_fish -> MainActivity::class.java
                    R.id.nav_item_bait -> BaitActivity::class.java
                    R.id.nav_item_tackle -> TackleActivity::class.java
                    R.id.nav_item_history -> HistoryActivity::class.java
                    else -> {
                        null
                    }
                }
            if (NextActivity != null) {
                val intent = Intent(this, NextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0,0)
                true
            }
            else {
                false
            }
            // bottom_navigation_view.
        }
        bottom_navigation_view.menu.getItem(navNumber).isChecked = true

    }
}