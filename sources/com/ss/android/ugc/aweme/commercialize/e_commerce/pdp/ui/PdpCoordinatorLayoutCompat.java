package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PdpCoordinatorLayoutCompat extends CoordinatorLayout {
    static {
        Covode.recordClassIndex(45464);
    }

    public PdpCoordinatorLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ PdpCoordinatorLayoutCompat(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PdpCoordinatorLayoutCompat(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
