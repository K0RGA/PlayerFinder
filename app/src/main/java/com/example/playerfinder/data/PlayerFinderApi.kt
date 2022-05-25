package com.example.playerfinder.data

import com.example.playerfinder.model.Player
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PlayerFinderApi {
    @GET("./api/getGames")
    fun getGames()

    @POST("/api/newUser")
    suspend fun newUser(@Body elementModel: Player)
}