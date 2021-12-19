package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public class ChallengeViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private boolean f144430f;

    static {
        Covode.recordClassIndex(94560);
    }

    public void setPagingEnable(boolean z) {
        this.f144430f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f144430f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f144430f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public ChallengeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
