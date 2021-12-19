package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public class r extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    boolean f144708f = true;

    static {
        Covode.recordClassIndex(94659);
    }

    public void setScrollable(boolean z) {
        this.f144708f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f144708f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
