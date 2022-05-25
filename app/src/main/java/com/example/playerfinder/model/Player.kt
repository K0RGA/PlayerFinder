package com.example.playerfinder.model

data class Player(
    var username: String,
    var password: String,
    var email: String,
    var phone: String,
    var age: Long,
    val rating: Float,
    var games: Set<BoardGame>
)