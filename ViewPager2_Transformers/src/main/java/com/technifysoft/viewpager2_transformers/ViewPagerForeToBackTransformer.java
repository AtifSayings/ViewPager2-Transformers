package com.technifysoft.viewpager2_transformers;

/*
@Author: Atif Pervaiz
Website: https://technifysoft.com/
Playstore: https://play.google.com/store/apps/dev?id=9049012648188611488
*/


import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerForeToBackTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        float height = (float)page.getHeight();
        float width = (float)page.getWidth();
        float scale = min(position > 0.0F ? 1.0F : Math.abs(1.0F + position), 0.5F);
        page.setScaleX(scale);
        page.setScaleY(scale);
        page.setPivotX(width * 0.5F);
        page.setPivotY(height * 0.5F);
        page.setTranslationX(position > 0.0F ? width * position : -width * position * 0.25F);
    }

    private static float min(float val, float min) {
        return Math.max(val, min);
    }

}
