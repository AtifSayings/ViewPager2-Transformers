package com.technifysoft.viewpager2_transformers;

/*
@Author: Atif Pervaiz
Website: https://technifysoft.com/
Playstore: https://play.google.com/store/apps/dev?id=9049012648188611488
*/


import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerZoomInTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        float scale = position < 0.0F ? position + 1.0F : Math.abs(1.0F - position);
        page.setScaleX(scale);
        page.setScaleY(scale);
        page.setPivotX((float)page.getWidth() * 0.5F);
        page.setPivotY((float)page.getHeight() * 0.5F);
        page.setAlpha(position >= -1.0F && position <= 1.0F ? 1.0F - (scale - 1.0F) : 0.0F);
    }
}
