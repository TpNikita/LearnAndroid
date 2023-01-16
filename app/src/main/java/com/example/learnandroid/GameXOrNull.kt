package com.example.learnandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GameXOrNull : AppCompatActivity() {

    val gameField = listOf<GameCell>(
        GameCell(0, 0, State.EMPTY),
        GameCell(1, 0, State.EMPTY),
        GameCell(2, 0, State.EMPTY),
        GameCell(0, 1, State.EMPTY),
        GameCell(1, 1, State.EMPTY),
        GameCell(2, 1, State.EMPTY),
        GameCell(0, 2, State.EMPTY),
        GameCell(1, 2, State.EMPTY),
        GameCell(2, 2, State.EMPTY),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_x_or_null)


        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)



        btn1.setOnClickListener {
            makeMove(0, 0, btn1)
            checkVictory()
        }
        btn2.setOnClickListener {
            makeMove(1, 0, btn2)
            checkVictory()
        }
        btn3.setOnClickListener {
            makeMove(2, 0, btn3)
            checkVictory()
        }
        btn4.setOnClickListener {
            makeMove(0, 1, btn4)
            checkVictory()
        }
        btn5.setOnClickListener {
            makeMove(1, 1, btn5)
            checkVictory()
        }
        btn6.setOnClickListener {
            makeMove(2, 1, btn6)
            checkVictory()
        }
        btn7.setOnClickListener {
            makeMove(0, 2, btn7)
            checkVictory()
        }

        btn8.setOnClickListener {
            makeMove(1, 2, btn8)
            checkVictory()
        }

        btn9.setOnClickListener {
            makeMove(2, 2, btn9)
            checkVictory()
        }

    }

    private fun makeMove(x: Int, y: Int, button: Button) {
        if (gameField.find { it.x == x && it.y == y }!!.state == State.EMPTY) {
            gameField.find { it.x == x && it.y == y }!!.state = State.PLAYER
            button.text = getString(R.string.player_x)
            button.isEnabled = false
        }
    }

    private fun checkVictory() {
        for (x in 0..2) {
            var playerCount = 0
            var computerCount = 0
            for (y in 0..2) {
                if (gameField.find { it.x == x && it.y == y }!!.state == State.PLAYER) {
                    playerCount++
                }
                if (gameField.find { it.x == x && it.y == y }!!.state == State.COMPUTER) {
                    computerCount++
                }

            }
        }
        if (gameField.find { it.x == 0 && it.y == 0 }!!.state == State.PLAYER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.PLAYER &&
            gameField.find { it.x == 2 && it.y == 2 }!!.state == State.PLAYER
        ) {
            printVictoryInfo(State.PLAYER)
        }

        if (gameField.find { it.x == 0 && it.y == 0 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 2 && it.y == 2 }!!.state == State.COMPUTER
        ) {
            printVictoryInfo(State.COMPUTER)
        }

        if (gameField.find { it.x == 2 && it.y == 0 }!!.state == State.PLAYER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.PLAYER &&
            gameField.find { it.x == 0 && it.y == 2 }!!.state == State.PLAYER
        ) {
            printVictoryInfo(State.PLAYER)
        }

        if (gameField.find { it.x == 2 && it.y == 0 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 0 && it.y == 2 }!!.state == State.COMPUTER
        ) {
            printVictoryInfo(State.COMPUTER)
        }

    }

    private fun algorithmComputer() {
        for (x in 0..2) {
            var playerCount = 0
            var computerCount = 0
            var winLine: Int = 0
            var loseLine: Int = 0
            for (y in 0..2) {
                if (gameField.find { it.x == x && it.y == y }!!.state == State.PLAYER) {
                    playerCount++
                }
                if (gameField.find { it.x == x && it.y == y }!!.state == State.COMPUTER) {
                    computerCount++
                }
                if (computerCount == 2) {
                    winLine = x
                }
                if (playerCount == 2) {
                    loseLine = x
                }
            }
        }
        if (gameField.find { it.x == 0 && it.y == 0 }!!.state == State.PLAYER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.PLAYER &&
            gameField.find { it.x == 2 && it.y == 2 }!!.state == State.PLAYER
        ) {
            printVictoryInfo(State.PLAYER)
        }

        if (gameField.find { it.x == 0 && it.y == 0 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 2 && it.y == 2 }!!.state == State.COMPUTER
        ) {
            printVictoryInfo(State.COMPUTER)
        }

        if (gameField.find { it.x == 2 && it.y == 0 }!!.state == State.PLAYER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.PLAYER &&
            gameField.find { it.x == 0 && it.y == 2 }!!.state == State.PLAYER
        ) {
            printVictoryInfo(State.PLAYER)
        }

        if (gameField.find { it.x == 2 && it.y == 0 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 1 && it.y == 1 }!!.state == State.COMPUTER &&
            gameField.find { it.x == 0 && it.y == 2 }!!.state == State.COMPUTER
        ) {
            printVictoryInfo(State.COMPUTER)
        }

    }

    private fun printVictoryInfo(state: State) {
        if (state == State.PLAYER) {
            println("!!! player win")
        } else {
            println("!!! Computer win")
        }
    }

}
