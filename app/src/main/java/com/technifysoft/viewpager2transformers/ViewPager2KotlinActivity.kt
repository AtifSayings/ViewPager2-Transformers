package com.technifysoft.viewpager2transformers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.technifysoft.viewpager2transformers.databinding.ActivityViewPager2KotlinBinding

class ViewPager2KotlinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPager2KotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2KotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "View Pager 2 [Kotlin Example]"

    }

}