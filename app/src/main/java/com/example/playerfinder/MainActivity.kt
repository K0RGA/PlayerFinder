package com.example.playerfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.playerfinder.databinding.ActivityMainBinding
import com.example.playerfinder.ui.RegistrationFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
                .add(R.id.data_container,
                        RegistrationFragment()).commit()
    }

}
