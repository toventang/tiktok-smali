package com.bytedance.ies.xelement.banner;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class b implements ViewPager.f {
    static {
        Covode.recordClassIndex(22060);
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public final void a(View view, float f2) {
        float f3;
        ViewPager viewPager = (ViewPager) view.getParent();
        int left = (view.getLeft() - viewPager.getPaddingLeft()) - viewPager.getScrollX();
        int measuredWidth = (viewPager.getMeasuredWidth() - viewPager.getPaddingLeft()) - viewPager.getPaddingRight();
        if (measuredWidth != 0) {
            f3 = ((float) left) / ((float) measuredWidth);
        } else {
            f3 = 0.0f;
        }
        float min = Math.min(9.0f, Math.max(-9.0f, f3 * 9.0f));
        view.setCameraDistance(1280.0f);
        view.setRotationY(-min);
    }
}
