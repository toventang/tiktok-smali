package com.ss.android.ugc.aweme.compliance.business.inference.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class CustomRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f76954a;

    static {
        Covode.recordClassIndex(47563);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final b getTouchListener() {
        return this.f76954a;
    }

    public final void setTouchListener(b bVar) {
        this.f76954a = bVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (!(motionEvent == null || motionEvent.getAction() != 1 || (bVar = this.f76954a) == null)) {
            bVar.a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ CustomRelativeLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CustomRelativeLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6426);
        MethodCollector.o(6426);
    }
}
