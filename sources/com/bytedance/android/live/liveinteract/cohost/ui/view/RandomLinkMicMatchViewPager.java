package com.bytedance.android.live.liveinteract.cohost.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class RandomLinkMicMatchViewPager extends ViewPager {
    static {
        Covode.recordClassIndex(5551);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RandomLinkMicMatchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        setClipChildren(false);
        setFadingEdgeLength(0);
    }
}
