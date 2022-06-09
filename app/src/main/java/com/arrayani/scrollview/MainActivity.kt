package com.arrayani.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arrayani.scrollview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root) //setContentView(R.layout.activity_main)

        val inputItemTv = binding.inputItemTv
        inputItemTv.setOnClickListener{
            startActivity(Intent(applicationContext, InputItem::class.java))
        }
    }
}