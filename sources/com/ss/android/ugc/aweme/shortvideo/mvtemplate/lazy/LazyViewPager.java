package com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public class LazyViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private b<?> f129360a;

    static {
        Covode.recordClassIndex(84907);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        b<?> bVar;
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof b) {
            bVar = (b) pagerAdapter;
        } else {
            bVar = null;
        }
        this.f129360a = bVar;
    }

    public LazyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i2, float f2, int i3) {
        if (this.f129360a == null) {
            super.onPageScrolled(i2, f2, i3);
            return;
        }
        if (getCurrentItem() == i2) {
            int i4 = i2 + 1;
            if (0.1f < f2 && this.f129360a.b(i4)) {
                this.f129360a.startUpdate((ViewGroup) this);
                this.f129360a.a(this, i4);
                this.f129360a.finishUpdate((ViewGroup) this);
            }
        } else if (getCurrentItem() > i2 && 0.1f < 1.0f - f2 && this.f129360a.b(i2)) {
            this.f129360a.startUpdate((ViewGroup) this);
            this.f129360a.a(this, i2);
            this.f129360a.finishUpdate((ViewGroup) this);
        }
        super.onPageScrolled(i2, f2, i3);
    }
}
