package com.example.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("!!! create new branch")

        val a = findViewById<EditText>(R.id.loginEt)
        val rememberCb = findViewById<CheckBox>(R.id.rememberPasswordCb)
        val actionBtn = findViewById<Button>(R.id.actionBtn)
        val gameLink = findViewById<TextView>(R.id.game_x_or_null_tv)

        val secondScreenTv = findViewById<TextView>(R.id.secondScreenTV)

        val registrationTv = findViewById<TextView>(R.id.registrationTv)
        registrationTv.setOnClickListener {
            val intent = Intent(this, QuestionAndAnswer::class.java)
            startActivity(intent)
        }

        gameLink.setOnClickListener {
            val intent = Intent(this, GameXOrNull::class.java)
            startActivity(intent)
        }

        secondScreenTv.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }

        actionBtn.setOnClickListener {
            //авторизация
            if (rememberCb.isChecked) {
                //сохраняем пароль
            }
            println("!!! нужно ли сохранять пароль ${rememberCb.isChecked}")
        }
        a.addTextChangedListener {
            println("!!! asdasd ${it?.length}")
        }
    }
}