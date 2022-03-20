package com.example.etfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.etfood.databinding.ActivityMainBinding
import com.example.etfood.databinding.ActivityMenuBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener{ goMenu()}
    }

    private fun goMenu() {
        val intent = Intent(this, Menu::class.java)

        startActivity(intent)
    }
}