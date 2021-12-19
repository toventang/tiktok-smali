package com.ss.android.ugc.aweme.prop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public class NoScrollViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private boolean f118315f = true;

    static {
        Covode.recordClassIndex(76830);
    }

    public void setNoScroll(boolean z) {
        this.f118315f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public void setCurrentItem(int i2) {
        super.setCurrentItem(i2, false);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f118315f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f118315f || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i2, int i3) {
        super.scrollTo(i2, i3);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public void setCurrentItem(int i2, boolean z) {
        super.setCurrentItem(i2, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
