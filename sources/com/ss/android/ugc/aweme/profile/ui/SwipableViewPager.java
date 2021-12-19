package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.r;

public class SwipableViewPager extends r {

    /* renamed from: g  reason: collision with root package name */
    private boolean f116822g = true;

    static {
        Covode.recordClassIndex(75449);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f116822g || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public SwipableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
