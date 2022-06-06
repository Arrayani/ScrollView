package com.arrayani.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arrayani.scrollview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}