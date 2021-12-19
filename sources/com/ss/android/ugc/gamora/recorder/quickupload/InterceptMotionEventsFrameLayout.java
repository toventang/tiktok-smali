package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InterceptMotionEventsFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f148185a;

    static {
        Covode.recordClassIndex(97670);
    }

    public InterceptMotionEventsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        Iterator<T> it = this.f148185a.iterator();
        while (it.hasNext()) {
            it.next().a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ InterceptMotionEventsFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InterceptMotionEventsFrameLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11293);
        this.f148185a = new ArrayList();
        MethodCollector.o(11293);
    }
}
