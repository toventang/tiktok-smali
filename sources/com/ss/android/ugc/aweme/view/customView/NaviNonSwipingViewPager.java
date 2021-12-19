package com.ss.android.ugc.aweme.view.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class NaviNonSwipingViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private final Context f144171a;

    static {
        Covode.recordClassIndex(94351);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Context getCon() {
        return this.f144171a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NaviNonSwipingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        this.f144171a = context;
    }
}
