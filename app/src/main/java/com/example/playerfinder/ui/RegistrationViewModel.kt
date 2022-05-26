package com.example.playerfinder.ui

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.playerfinder.data.PlayerFinderApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RegistrationViewModel(application: Application) : AndroidViewModel(application) {

    fun sendPushRequest(playerFinderApi: PlayerFinderApi?) {
        playerFinderApi?.let {
            viewModelScope.launch(Dispatchers.IO) {
                Log.d("Internet","viewModelScope is launch")
                try {
                    val result = playerFinderApi.getGames()
                    Log.d("Internet", "${result.toString()}")
                } catch (e: Exception){
                    Log.d("Internet","Exception -> ${e.localizedMessage}")
                }
            }
        }
    }
}