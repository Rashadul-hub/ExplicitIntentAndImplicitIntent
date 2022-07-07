package com.example.explicitintentandimplicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.explicitintentandimplicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Explicit Intent

        binding.explicitIntent.setOnClickListener {
            val explicitIntent = Intent(this,SecondActivity::class.java)
            startActivity(explicitIntent)
        }


         // Implicit Intent

        binding.implicitIntent.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW)
            implicitIntent.data = Uri.parse("https://www.youtube.com")
            startActivity(implicitIntent)
        }

    }
}