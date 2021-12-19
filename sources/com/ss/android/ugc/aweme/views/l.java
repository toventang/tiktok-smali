package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class l extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f144634a = true;

    static {
        Covode.recordClassIndex(94635);
    }

    public final void setScrollable(boolean z) {
        this.f144634a = z;
    }

    public l(Context context) {
        super(context);
        MethodCollector.i(2724);
        MethodCollector.o(2724);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f144634a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
