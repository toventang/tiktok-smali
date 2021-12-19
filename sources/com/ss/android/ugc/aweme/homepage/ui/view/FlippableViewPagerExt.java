package com.ss.android.ugc.aweme.homepage.ui.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.n;

public class FlippableViewPagerExt extends n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f99523a = true;

    static {
        Covode.recordClassIndex(63475);
    }

    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return true;
    }

    public FlippableViewPagerExt(Context context) {
        super(context);
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean canScrollHorizontally(int i2) {
        if (!this.f99523a || !super.canScrollHorizontally(i2)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.n, dmt.viewpager.DmtViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f99523a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.n, dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getContext();
        if (!this.f99523a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public FlippableViewPagerExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
