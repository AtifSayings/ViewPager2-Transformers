package com.technifysoft.viewpager2_transformers;

/*
@Author: Atif Pervaiz
Website: https://technifysoft.com/
Playstore: https://play.google.com/store/apps/dev?id=9049012648188611488
*/


import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerRotateDownTransformer implements ViewPager2.PageTransformer {

    @Override
    public void transformPage(@NonNull View page, float position) {
        float width = (float)page.getWidth();
        float height = (float)page.getHeight();
        float rotation = -15.0F * position * -1.25F;
        page.setPivotX(width * 0.5F);
        page.setPivotY(height);
        page.setRotation(rotation);
    }
}
