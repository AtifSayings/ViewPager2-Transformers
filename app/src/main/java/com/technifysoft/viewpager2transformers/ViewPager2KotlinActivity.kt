package com.technifysoft.viewpager2transformers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.technifysoft.viewpager2_transformers.ViewPagerAntiClockSpinTransformer
import com.technifysoft.viewpager2transformers.databinding.ActivityViewPager2KotlinBinding

class ViewPager2KotlinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPager2KotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2KotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "View Pager 2 [Kotlin Example]"

        setupViewPager2(ViewPager2.ORIENTATION_HORIZONTAL);

        binding.orientationRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == R.id.verticalRadioBtn) {
                setupViewPager2(ViewPager2.ORIENTATION_VERTICAL)
            } else if (checkedId == R.id.horizontalRadioBtn) {
                setupViewPager2(ViewPager2.ORIENTATION_HORIZONTAL)
            }
        }

    }


    private fun setupViewPager2(selectedOrientation: Int) {
        //init sample list of images, i've just used colors instead of images, you may use images
        val viewPager2JavaArrayList = ArrayList<ModelViewPager2Kotlin>()
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.color.purple_200))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.color.purple_500))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.color.purple_700))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.color.teal_200))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.color.teal_700))

        //setup adapter
        val adapterViewPager2Kotlin = AdapterViewPager2Kotlin(this, viewPager2JavaArrayList)
        //set adapter to view pager
        binding.viewPager2.adapter = adapterViewPager2Kotlin
        //set tab change orientation ViewPager2.ORIENTATION_VERTICAL, ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager2.orientation = selectedOrientation
        //for page change animation, here you can pass any of the Transformer Classes instance as param
        binding.viewPager2.setPageTransformer(ViewPagerAntiClockSpinTransformer())
    }

}