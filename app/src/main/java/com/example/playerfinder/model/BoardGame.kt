package com.example.playerfinder.model

import com.google.gson.annotations.SerializedName

data class BoardGame(
    @SerializedName("name")
    val name: String,
    @SerializedName("imageURL")
    val image: String
)

