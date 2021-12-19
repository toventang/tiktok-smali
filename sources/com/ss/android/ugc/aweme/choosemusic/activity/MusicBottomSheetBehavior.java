package com.ss.android.ugc.aweme.choosemusic.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import h.f.b.l;

public final class MusicBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    public boolean n;

    static {
        Covode.recordClassIndex(43378);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b, com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        l.d(coordinatorLayout, "");
        l.d(v, "");
        l.d(motionEvent, "");
        if (this.n) {
            return false;
        }
        return super.a(coordinatorLayout, (View) v, motionEvent);
    }
}
