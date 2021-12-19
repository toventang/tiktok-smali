package com.ss.android.ugc.aweme.upvote.wiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class InterceptEventLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f142311a;

    static {
        Covode.recordClassIndex(93087);
    }

    public InterceptEventLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.f142311a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f142311a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ InterceptEventLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InterceptEventLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8474);
        MethodCollector.o(8474);
    }
}
