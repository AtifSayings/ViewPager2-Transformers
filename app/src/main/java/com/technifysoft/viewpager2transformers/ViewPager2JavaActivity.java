package com.technifysoft.viewpager2transformers;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.technifysoft.viewpager2_transformers.ViewPagerAntiClockSpinTransformer;
import com.technifysoft.viewpager2transformers.databinding.ActivityViewPager2JavaBinding;

import java.util.ArrayList;

public class ViewPager2JavaActivity extends AppCompatActivity {

    private ActivityViewPager2JavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPager2JavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("View Pager 2 [Java Example]");

        setupViewPager2(ViewPager2.ORIENTATION_HORIZONTAL);

        binding.orientationRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.verticalRadioBtn) {
                    setupViewPager2(ViewPager2.ORIENTATION_VERTICAL);
                } else if (checkedId == R.id.horizontalRadioBtn) {
                    setupViewPager2(ViewPager2.ORIENTATION_HORIZONTAL);
                }
            }
        });

    }

    private void setupViewPager2(int selectedOrientation) {
        //init sample list of images, i've just used colors instead of images, you may use images
        ArrayList<ModelViewPager2Java> viewPager2JavaArrayList = new ArrayList<>();
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.color.purple_200));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.color.purple_500));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.color.purple_700));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.color.teal_200));
        viewPager2JavaArrayList.add(new ModelViewPager2Java(R.color.teal_700));

        //setup adapter
        AdapterViewPager2Java adapterViewPager2Java = new AdapterViewPager2Java(this, viewPager2JavaArrayList);
        //set adapter to view pager
        binding.viewPager2.setAdapter(adapterViewPager2Java);
        //set tab change orientation ViewPager2.ORIENTATION_VERTICAL, ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager2.setOrientation(selectedOrientation);
        //for page change animation, here you can pass any of the Transformer Classes instance as param
        binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
    }

}