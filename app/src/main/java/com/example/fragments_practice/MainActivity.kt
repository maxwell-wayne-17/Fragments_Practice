package com.example.fragments_practice

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        val btnFragment1 = findViewById(R.id.btnFragment1) as Button
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null);
                commit()
            }
        }

        val btnFragment2 = findViewById(R.id.btnFragment2) as Button
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null);
                commit()
            }
        }

    }

}