package com.example.playerfinder

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.playerfinder.data.PlayerFinderApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.HttpURLConnection
import java.net.URL


class PlayerFinderApp : Application() {

    lateinit var playerFinderApi: PlayerFinderApi

    override fun onCreate() {
        super.onCreate()

        configureRetrofit()
    }

    private fun configureRetrofit() {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://httpbin.org")
            .addConverterFactory(GsonConverterFactory.create())
            //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            //.client(okHttpClient)
            .build()

        StrictMode.setThreadPolicy(ThreadPolicy.Builder().permitAll().build())

        val queue = Volley.newRequestQueue(this)
        val url = "http://192.168.2.196:16789/api/getGames"

        val stringRequest = StringRequest(
            Request.Method.DEPRECATED_GET_OR_POST, url,
            Response.Listener<String> { response ->
                Log.d("tag", "Response is: ${response}")
            },
            Response.ErrorListener {Log.d("tag", "error")})

        queue.add(stringRequest)
    }
}