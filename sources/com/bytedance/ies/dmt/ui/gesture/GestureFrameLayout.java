package com.bytedance.ies.dmt.ui.gesture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.gesture.a.a;
import h.f.b.l;

public final class GestureFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f33499a;

    static {
        Covode.recordClassIndex(19982);
    }

    public GestureFrameLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public GestureFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        a aVar = this.f33499a;
        if (aVar != null) {
            return aVar.a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GestureFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9543);
        MethodCollector.o(9543);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ GestureFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
