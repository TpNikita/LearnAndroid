package com.example.learnandroid

data class GameCell(
    val x: Int,
    val y: Int,
    var state: State
)

enum class State() {
    EMPTY,
    PLAYER,
    COMPUTER
}