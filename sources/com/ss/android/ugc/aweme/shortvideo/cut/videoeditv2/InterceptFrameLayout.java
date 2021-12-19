package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class InterceptFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f126198a;

    static {
        Covode.recordClassIndex(82854);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean getIntercept() {
        return this.f126198a;
    }

    public final void setIntercept(boolean z) {
        this.f126198a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f126198a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ InterceptFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InterceptFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3760);
        MethodCollector.o(3760);
    }
}
