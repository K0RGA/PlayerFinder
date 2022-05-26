package com.example.playerfinder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playerfinder.ui.RegistrationFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .add(
                R.id.data_container,
                RegistrationFragment()
            ).commit()
    }

}
