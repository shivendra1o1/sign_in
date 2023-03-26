package com.example.appsign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val fragment = fragmentsign_in()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerview, fragment)
                .commit()




    }

}