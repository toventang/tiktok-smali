package com.ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public class SwipeControlledViewPager extends b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f89494a = true;

    static {
        Covode.recordClassIndex(56240);
    }

    public void setSwipeEnabled(boolean z) {
        this.f89494a = z;
    }

    @Override // com.ss.android.ugc.aweme.emoji.views.b, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f89494a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.emoji.views.b, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f89494a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeControlledViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
