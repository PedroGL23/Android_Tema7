package com.example.tactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ProfileActivity::class.java)


        binding.continuarAdelante.setOnClickListener {
            var info = binding.infoParaMandar.text.toString()
            intent.putExtra("info", info)
            Log.i("prueba", info)
            startActivity(intent)
        }


    }
}