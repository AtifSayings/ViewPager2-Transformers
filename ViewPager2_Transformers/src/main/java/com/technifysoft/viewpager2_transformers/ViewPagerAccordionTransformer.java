package com.technifysoft.viewpager2_transformers;

/*
@Author: Atif Pervaiz
Website: https://technifysoft.com/
Playstore: https://play.google.com/store/apps/dev?id=9049012648188611488
*/


import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerAccordionTransformer implements ViewPager2.PageTransformer{
    @Override
    public void transformPage(@NonNull View page, float position) {
        page.setPivotX(position < 0.0F ? 0.0F : (float)page.getWidth());
        page.setScaleX(position < 0.0F ? 1.0F + position : 1.0F - position);
    }
}
