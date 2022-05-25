package com.example.playerfinder.data

import com.example.playerfinder.model.Player
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface PlayerFinderApi {

    @Headers("Content-Type: application/json")
    @POST(value = "/post")
    suspend fun getGames(@Body body : String) : Call<JsonObject>

    @POST("/api/newUser")
    suspend fun newUser(@Body elementModel: Player)
}