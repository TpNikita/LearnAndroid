package com.example.learnandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    override fun onStart() {
        super.onStart()
        println("!!! onStart")
    }

    override fun onResume() {
        super.onResume()
        println("!!! onResume")
    }

    override fun onPause() {
        super.onPause()
        println("!!! onPause")
    }

    override fun onStop() {
        super.onStop()
        println("!!! onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("!!! onDestroy")
        //stopPlayMusic()
    }

}