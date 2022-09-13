package com.technifysoft.viewpager2transformers;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.viewpager2.widget.ViewPager2;
import com.technifysoft.viewpager2_transformers.*;
import com.technifysoft.viewpager2transformers.databinding.ActivityViewPager2JavaBinding;
import java.util.ArrayList;

public class ViewPager2JavaActivity extends AppCompatActivity {

    private ActivityViewPager2JavaBinding binding;

    private int selectedOrientation = ViewPager2.ORIENTATION_HORIZONTAL;
    private ViewPager2.PageTransformer selectedPagerTransformer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPager2JavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("View Pager 2 [Java Example]");

        selectedPagerTransformer = new ViewPagerDefaultTransformer();
        binding.animationTv.setText("Default");

        setupViewPager2();

        binding.orientationRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.verticalRadioBtn) {
                    selectedOrientation = ViewPager2.ORIENTATION_VERTICAL;
                    setupViewPager2();
                } else if (checkedId == R.id.horizontalRadioBtn) {
                    selectedOrientation = ViewPager2.ORIENTATION_HORIZONTAL;
                    setupViewPager2();
                }
            }
        });

        binding.animationTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationPickPopupMenu();
            }
        });

    }

    private void animationPickPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, binding.animationTv);

        String[] animationTitles = {
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
                "Zoom Out",
        };

        for (int i = 0; i < animationTitles.length; i++) {
            popupMenu.getMenu().add(Menu.NONE, i, i, animationTitles[i]);
        }

        popupMenu.show();


        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = item.getTitle().toString();
                binding.animationTv.setText(title);
                switch (title) {
                    case "Accordion":
                        selectedPagerTransformer = new ViewPagerAccordionTransformer();
                        setupViewPager2();
                        break;
                    case "Anti Clock Spin":
                        selectedPagerTransformer = new ViewPagerAntiClockSpinTransformer();
                        setupViewPager2();
                        break;
                    case "Back Draw":
                        selectedPagerTransformer = new ViewPagerBackDrawTransformer();
                        setupViewPager2();
                        break;
                    case "Background To Foreground":
                        selectedPagerTransformer = new ViewPagerBackToForeTransformer();
                        setupViewPager2();
                        break;
                    case "Clock Spin":
                        selectedPagerTransformer = new ViewPagerClockSpinTransformer();
                        setupViewPager2();
                        break;
                    case "Cube In Depth":
                        selectedPagerTransformer = new ViewPagerCubeInDepthTransformer();
                        setupViewPager2();
                        break;
                    case "Cube In Scaling":
                        selectedPagerTransformer = new ViewPagerCubeInScalingTransformer();
                        setupViewPager2();
                        break;
                    case "Cube In":
                        selectedPagerTransformer = new ViewPagerCubeInTransformer();
                        setupViewPager2();
                        break;
                    case "Cube Out Depth":
                        selectedPagerTransformer = new ViewPagerCubeOutDepthTransformer();
                        setupViewPager2();
                        break;
                    case "Cube Out Scaling":
                        selectedPagerTransformer = new ViewPagerCubeOutScalingTransformer();
                        setupViewPager2();
                        break;
                    case "Cube Out":
                        selectedPagerTransformer = new ViewPagerCubeOutTransformer();
                        setupViewPager2();
                        break;
                    case "Default":
                        selectedPagerTransformer = new ViewPagerDefaultTransformer();
                        setupViewPager2();
                        break;
                    case "Depth":
                        selectedPagerTransformer = new ViewPagerDepthTransformer();
                        setupViewPager2();
                        break;
                    case "Fade Out":
                        selectedPagerTransformer = new ViewPagerFadeOutTransformer();
                        setupViewPager2();
                        break;
                    case "Fan":
                        selectedPagerTransformer = new ViewPagerFanTransformer();
                        setupViewPager2();
                        break;
                    case "Fidget Spin":
                        selectedPagerTransformer = new ViewPagerFidgetSpinTransformer();
                        setupViewPager2();
                        break;
                    case "Foreground To Background":
                        selectedPagerTransformer = new ViewPagerForeToBackTransformer();
                        setupViewPager2();
                        break;
                    case "Gate":
                        selectedPagerTransformer = new ViewPagerGateTransformer();
                        setupViewPager2();
                        break;
                    case "Hinge":
                        selectedPagerTransformer = new ViewPagerHingeTransformer();
                        setupViewPager2();
                        break;
                    case "Horizontal Flip":
                        selectedPagerTransformer = new ViewPagerHorizontalFlipTransformer();
                        setupViewPager2();
                        break;
                    case "Parallax":
                        selectedPagerTransformer = new ViewPagerParallaxTransformer(binding.viewPager2.getId());
                        setupViewPager2();
                        break;
                    case "Pop":
                        selectedPagerTransformer = new ViewPagerPopTransformer();
                        setupViewPager2();
                        break;
                    case "Rotate Down":
                        selectedPagerTransformer = new ViewPagerRotateDownTransformer();
                        setupViewPager2();
                        break;
                    case "Rotate Up":
                        selectedPagerTransformer = new ViewPagerRotateUpTransformer();
                        setupViewPager2();
                        break;
                    case "Spinner":
                        selectedPagerTransformer = new ViewPagerSpinnerTransformer();
                        setupViewPager2();
                        break;
                    case "Stack":
                        selectedPagerTransformer = new ViewPagerStackTransformer();
                        setupViewPager2();
                        break;
                    case "Tablet":
                        selectedPagerTransformer = new ViewPagerTabletTransformer();
                        setupViewPager2();
                        break;
                    case "Toss":
                        selectedPagerTransformer = new ViewPagerTossTransformer();
                        setupViewPager2();
                        break;
                    case "Vertical Flip":
                        selectedPagerTransformer = new ViewPagerVerticalFlipTransformer();
                        setupViewPager2();
                        break;
                    case "Vertical Shut":
                        selectedPagerTransformer = new ViewPagerVerticalShutTransformer();
                        setupViewPager2();
                        break;
                    case "Zoom In":
                        selectedPagerTransformer = new ViewPagerZoomInTransformer();
                        setupViewPager2();
                        break;
                    case "Zoom Out Slide":
                        selectedPagerTransformer = new ViewPagerZoomOutSlideTransformer();
                        setupViewPager2();
                        break;
                    case "Zoom Out":
                        selectedPagerTransformer = new ViewPagerZoomOutTransformer();
                        setupViewPager2();
                        break;
                    default:
                        selectedPagerTransformer = new ViewPagerAccordionTransformer();
                        setupViewPager2();
                        break;
                }
                return true;
            }
        });

    }

    private void setupViewPager2() {
        //init sample list of images, i've just used colors instead of images, you may use images
        ArrayList<ModelViewPager2Java> viewPager2JavaArrayList = new ArrayList<>();
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_android));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_cross_platform));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_desktop));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_graphics));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_ios));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_mac));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.drawable.banner_web));

        //setup adapter
        AdapterViewPager2Java adapterViewPager2Java = new AdapterViewPager2Java(this, viewPager2JavaArrayList);
        //set adapter to view pager
        binding.viewPager2.setAdapter(adapterViewPager2Java);
        //set tab change orientation ViewPager2.ORIENTATION_VERTICAL, ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager2.setOrientation(selectedOrientation);
        //for page change animation, here you can pass any of the Transformer Classes instance as param
        binding.viewPager2.setPageTransformer(selectedPagerTransformer);
    }

}