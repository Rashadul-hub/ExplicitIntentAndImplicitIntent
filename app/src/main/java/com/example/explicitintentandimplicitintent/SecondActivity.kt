package com.example.explicitintentandimplicitintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.explicitintentandimplicitintent.databinding.ActivitySceondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySceondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySceondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}