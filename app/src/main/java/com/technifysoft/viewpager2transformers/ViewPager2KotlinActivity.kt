package com.technifysoft.viewpager2transformers

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.viewpager2.widget.ViewPager2
import com.technifysoft.viewpager2_transformers.*
import com.technifysoft.viewpager2transformers.databinding.ActivityViewPager2KotlinBinding

class ViewPager2KotlinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPager2KotlinBinding

    private var selectedOrientation = ViewPager2.ORIENTATION_HORIZONTAL
    private lateinit var selectedPagerTransformer: ViewPager2.PageTransformer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2KotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "View Pager 2 [Kotlin Example]"

        selectedPagerTransformer = ViewPagerDefaultTransformer();
        binding.animationTv.text = "Default"

        setupViewPager2()

        binding.orientationRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == R.id.verticalRadioBtn) {
                selectedOrientation = ViewPager2.ORIENTATION_VERTICAL
                setupViewPager2()
            } else if (checkedId == R.id.horizontalRadioBtn) {
                selectedOrientation = ViewPager2.ORIENTATION_HORIZONTAL
                setupViewPager2()
            }
        }

        binding.animationTv.setOnClickListener { animationPickPopupMenu() }

    }

    private fun animationPickPopupMenu() {
        val popupMenu = PopupMenu(this, binding.animationTv)

        val animationTitles = arrayOf(
            "Accordion",
            "Anti Clock Spin",
            "Back Draw",
            "Background To Foreground",
            "Clock Spin",
            "Cube In Depth",
            "Cube In Scaling",
            "Cube In",
            "Cube Out Depth",
            "Cube Out Scaling",
            "Cube Out",
            "Default",
            "Depth",
            "Fade Out",
            "Fan",
            "Fidget Spin",
            "Foreground To Background",
            "Gate",
            "Hinge",
            "Horizontal Flip",
            "Parallax",
            "Pop",
            "Rotate Down",
            "Rotate Up",
            "Spinner",
            "Stack",
            "Tablet",
            "Toss",
            "Vertical Flip",
            "Vertical Shut",
            "Zoom In",
            "Zoom Out Slide",
            "Zoom Out"
        )

        for (i in animationTitles.indices) {
            popupMenu.menu.add(Menu.NONE, i, i, animationTitles[i])
        }

        popupMenu.show()

        popupMenu.setOnMenuItemClickListener { item ->
            val title = item.title.toString()
            binding.animationTv.text = title
            when (title) {
                "Accordion" -> {
                    selectedPagerTransformer = ViewPagerAccordionTransformer()
                    setupViewPager2()
                }
                "Anti Clock Spin" -> {
                    selectedPagerTransformer = ViewPagerAntiClockSpinTransformer()
                    setupViewPager2()
                }
                "Back Draw" -> {
                    selectedPagerTransformer = ViewPagerBackDrawTransformer()
                    setupViewPager2()
                }
                "Background To Foreground" -> {
                    selectedPagerTransformer = ViewPagerBackToForeTransformer()
                    setupViewPager2()
                }
                "Clock Spin" -> {
                    selectedPagerTransformer = ViewPagerClockSpinTransformer()
                    setupViewPager2()
                }
                "Cube In Depth" -> {
                    selectedPagerTransformer = ViewPagerCubeInDepthTransformer()
                    setupViewPager2()
                }
                "Cube In Scaling" -> {
                    selectedPagerTransformer = ViewPagerCubeInScalingTransformer()
                    setupViewPager2()
                }
                "Cube In" -> {
                    selectedPagerTransformer = ViewPagerCubeInTransformer()
                    setupViewPager2()
                }
                "Cube Out Depth" -> {
                    selectedPagerTransformer = ViewPagerCubeOutDepthTransformer()
                    setupViewPager2()
                }
                "Cube Out Scaling" -> {
                    selectedPagerTransformer = ViewPagerCubeOutScalingTransformer()
                    setupViewPager2()
                }
                "Cube Out" -> {
                    selectedPagerTransformer = ViewPagerCubeOutTransformer()
                    setupViewPager2()
                }
                "Default" -> {
                    selectedPagerTransformer = ViewPagerDefaultTransformer()
                    setupViewPager2()
                }
                "Depth" -> {
                    selectedPagerTransformer = ViewPagerDepthTransformer()
                    setupViewPager2()
                }
                "Fade Out" -> {
                    selectedPagerTransformer = ViewPagerFadeOutTransformer()
                    setupViewPager2()
                }
                "Fan" -> {
                    selectedPagerTransformer = ViewPagerFanTransformer()
                    setupViewPager2()
                }
                "Fidget Spin" -> {
                    selectedPagerTransformer = ViewPagerFidgetSpinTransformer()
                    setupViewPager2()
                }
                "Foreground To Background" -> {
                    selectedPagerTransformer = ViewPagerForeToBackTransformer()
                    setupViewPager2()
                }
                "Gate" -> {
                    selectedPagerTransformer = ViewPagerGateTransformer()
                    setupViewPager2()
                }
                "Hinge" -> {
                    selectedPagerTransformer = ViewPagerHingeTransformer()
                    setupViewPager2()
                }
                "Horizontal Flip" -> {
                    selectedPagerTransformer = ViewPagerHorizontalFlipTransformer()
                    setupViewPager2()
                }
                "Parallax" -> {
                    selectedPagerTransformer = ViewPagerParallaxTransformer(binding.viewPager2.id)
                    setupViewPager2()
                }
                "Pop" -> {
                    selectedPagerTransformer = ViewPagerPopTransformer()
                    setupViewPager2()
                }
                "Rotate Down" -> {
                    selectedPagerTransformer = ViewPagerRotateDownTransformer()
                    setupViewPager2()
                }
                "Rotate Up" -> {
                    selectedPagerTransformer = ViewPagerRotateUpTransformer()
                    setupViewPager2()
                }
                "Spinner" -> {
                    selectedPagerTransformer = ViewPagerSpinnerTransformer()
                    setupViewPager2()
                }
                "Stack" -> {
                    selectedPagerTransformer = ViewPagerStackTransformer()
                    setupViewPager2()
                }
                "Tablet" -> {
                    selectedPagerTransformer = ViewPagerTabletTransformer()
                    setupViewPager2()
                }
                "Toss" -> {
                    selectedPagerTransformer = ViewPagerTossTransformer()
                    setupViewPager2()
                }
                "Vertical Flip" -> {
                    selectedPagerTransformer = ViewPagerVerticalFlipTransformer()
                    setupViewPager2()
                }
                "Vertical Shut" -> {
                    selectedPagerTransformer = ViewPagerVerticalShutTransformer()
                    setupViewPager2()
                }
                "Zoom In" -> {
                    selectedPagerTransformer = ViewPagerZoomInTransformer()
                    setupViewPager2()
                }
                "Zoom Out Slide" -> {
                    selectedPagerTransformer = ViewPagerZoomOutSlideTransformer()
                    setupViewPager2()
                }
                "Zoom Out" -> {
                    selectedPagerTransformer = ViewPagerZoomOutTransformer()
                    setupViewPager2()
                }
                else -> {
                    selectedPagerTransformer = ViewPagerAccordionTransformer()
                    setupViewPager2()
                }
            }
            true
        }
    }

    private fun setupViewPager2() {
        //init sample list of images, i've just used colors instead of images, you may use images
        val viewPager2JavaArrayList = ArrayList<ModelViewPager2Kotlin>()
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_android))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_cross_platform))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_desktop))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_graphics))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_ios))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_mac))
        viewPager2JavaArrayList.add(ModelViewPager2Kotlin(R.drawable.banner_web))

        //setup adapter
        val adapterViewPager2Kotlin = AdapterViewPager2Kotlin(this, viewPager2JavaArrayList)
        //set adapter to view pager
        binding.viewPager2.adapter = adapterViewPager2Kotlin
        //set tab change orientation ViewPager2.ORIENTATION_VERTICAL, ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager2.orientation = selectedOrientation
        //for page change animation, here you can pass any of the Transformer Classes instance as param
        binding.viewPager2.setPageTransformer(selectedPagerTransformer)
    }

}