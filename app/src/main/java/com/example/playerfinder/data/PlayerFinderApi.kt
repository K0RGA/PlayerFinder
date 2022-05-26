package com.example.playerfinder.data

import com.example.playerfinder.model.BoardGame
import com.example.playerfinder.model.Player
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PlayerFinderApi {
    //@GET("/api/getGames")
    @GET("./getGames")
    suspend fun getGames() : JsonObject

    @POST("https://www.google.ru/")
    suspend fun newUser(@Body name: String) : String
}