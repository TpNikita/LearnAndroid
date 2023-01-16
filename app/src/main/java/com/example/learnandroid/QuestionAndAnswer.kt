package com.example.learnandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionAndAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_and_answer_activity)

        val button: Button = findViewById<Button>(R.id.answerBtn)
        val answer1 = findViewById<CheckBox>(R.id.answer1Cb)
        val answer2 = findViewById<CheckBox>(R.id.answer2Cb)
        val answer3 = findViewById<CheckBox>(R.id.answer3Cb)
        val answer4 = findViewById<CheckBox>(R.id.answer4Cb)
        val result = findViewById<TextView>(R.id.resultTv)


        button.setOnClickListener {
            var sumResult: Int = 0
            if(answer2.isChecked) sumResult++
            if(answer3.isChecked) sumResult++

            if(answer1.isChecked) sumResult--
            if(answer4.isChecked) sumResult--



            result.text = "Вы верно ответили на $sumResult вопросов"
            result.visibility = View.VISIBLE
        }

    }
}