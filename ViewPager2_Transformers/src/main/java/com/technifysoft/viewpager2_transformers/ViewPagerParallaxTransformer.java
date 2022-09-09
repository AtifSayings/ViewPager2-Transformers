package com.technifysoft.viewpager2_transformers;

/*
@Author: Atif Pervaiz
Website: https://technifysoft.com/
Playstore: https://play.google.com/store/apps/dev?id=9049012648188611488
*/


import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerParallaxTransformer implements ViewPager2.PageTransformer {
    private final int viewToParallax;

    public ViewPagerParallaxTransformer(int viewToParallax) {
        this.viewToParallax = viewToParallax;
    }

    @Override
    public void transformPage(@NonNull View page, float position) {
        int pageWidth = page.getWidth();
        if (position < -1.0F) {
            page.setAlpha(1.0F);
        } else if (position <= 1.0F) {
            page.findViewById(this.viewToParallax).setTranslationX(-position * (float)(pageWidth / 2));
        } else {
            page.setAlpha(1.0F);
        }
    }
}
