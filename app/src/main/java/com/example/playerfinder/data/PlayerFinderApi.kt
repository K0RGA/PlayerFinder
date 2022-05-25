package com.example.playerfinder.data

import retrofit2.http.GET
import retrofit2.http.POST

interface PlayerFinderApi {
    @GET("./api/getGames")
    fun getGames()

    @POST("/api/newUser")
    fun newUser(){

    }
}