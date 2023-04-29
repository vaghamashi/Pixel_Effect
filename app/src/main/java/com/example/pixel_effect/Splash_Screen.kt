package com.example.pixel_effect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.pixel_effect.databinding.ActivitySplashScreenBinding

class Splash_Screen : AppCompatActivity() {


    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({

            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },4000)
    }
}