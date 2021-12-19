package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class DisallowInterceptFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(13269);
    }

    public DisallowInterceptFrameLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public DisallowInterceptFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DisallowInterceptFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11417);
        MethodCollector.o(11417);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ DisallowInterceptFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
