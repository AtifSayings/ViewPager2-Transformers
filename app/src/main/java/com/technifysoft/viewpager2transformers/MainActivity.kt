package com.technifysoft.viewpager2transformers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.technifysoft.viewpager2transformers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.exampleJavaBtn.setOnClickListener {
            startActivity(Intent(this, ViewPager2JavaActivity::class.java))
        }

        binding.exampleKotlinBtn.setOnClickListener {
            startActivity(Intent(this, ViewPager2KotlinActivity::class.java))
        }

    }

}