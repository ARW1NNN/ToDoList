package com.example.todolist

import HomePageFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Home Page Fragment'ını yükle
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, HomePageFragment())
            .commit()
    }

}
