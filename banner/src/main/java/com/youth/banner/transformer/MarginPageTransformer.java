package com.youth.banner.transformer;

import android.view.View;

import androidx.annotation.NonNull;

/**
 * @author: hepingdev
 * @created: 2024/2/27
 * @desc:
 */
public class MarginPageTransformer extends BasePageTransformer {
    @Override
    public void transformPage(@NonNull View view, float position) {
        //X轴偏移量
        if (position < -1) {
            view.setTranslationX(view.getWidth() / 2f);
        } else if (position <= 0f) {
            view.setTranslationX(-(view.getWidth() / 2.08f * position));
        } else if (position <= 1) {
            //X轴偏移
            view.setTranslationX(-(view.getWidth() / 2.08f * position));
        } else {
            view.setTranslationX(-(view.getWidth() / 2.2f));
        }

        //Z轴，这个很重要，否则后面的元素会逐个覆盖前一个元素，无法实现两边元素被遮挡的效果
        if (position <= 0f) {
            view.setTranslationZ(5 * position);
        } else {
            view.setTranslationZ(-5 * position);
        }
    }
}
