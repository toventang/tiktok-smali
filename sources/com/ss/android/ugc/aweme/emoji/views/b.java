package com.ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public class b extends ViewPager {
    static {
        Covode.recordClassIndex(56242);
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

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
