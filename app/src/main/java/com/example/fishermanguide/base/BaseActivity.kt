package com.example.fishermanguide.base

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fishermanguide.*
import com.example.fishermanguide.activity.BaitActivity
import com.example.fishermanguide.activity.HistoryActivity
import com.example.fishermanguide.activity.MainActivity
import com.example.fishermanguide.activity.TackleActivity
import kotlinx.android.synthetic.main.activity_main.*

open class BaseActivity(val nav_number: Int) : AppCompatActivity()  {

    //Function to work with Bottom Navigation View
    fun SetupBottomNavigation(){
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
        bottom_navigation_view.menu.getItem(nav_number).isChecked = true

    }

    fun TestMassage(Text: String) {
        Toast.makeText(this, Text, Toast.LENGTH_SHORT).show()
    }

    fun OpenLoginActivity(){

    }


}