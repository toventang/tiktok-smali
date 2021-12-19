package com.bytedance.analytics.a;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.analytics.b.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class g extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    private final GestureDetector f6546a;

    /* renamed from: b  reason: collision with root package name */
    private float f6547b;

    /* renamed from: c  reason: collision with root package name */
    private float f6548c;

    static {
        Covode.recordClassIndex(3148);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public g(Context context) {
        super(context);
        MethodCollector.i(5095);
        this.f6546a = new GestureDetector(context, this);
        MethodCollector.o(5095);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6547b = motionEvent.getX();
            this.f6548c = motionEvent.getY();
        } else if (action == 1) {
            b.a();
        } else if (action != 2 || ((Math.abs(motionEvent.getX() - this.f6547b) <= 20.0f && Math.abs(motionEvent.getY() - this.f6548c) <= 20.0f) || System.currentTimeMillis() - b.f6524b < ((long) a.f6512b))) {
            return dispatchTouchEvent;
        } else {
            b.a();
        }
        return dispatchTouchEvent;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (System.currentTimeMillis() - b.f6524b < ((long) a.f6512b)) {
            return false;
        }
        f.a("**** TraceRootGroupLayout onScroll ****");
        b.a();
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(5265);
        f.a("**** TraceRootGroupLayout onLayout ****");
        super.onLayout(z, i2, i3, i4, i5);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b.f6524b < ((long) a.f6512b)) {
            MethodCollector.o(5265);
            return;
        }
        b.f6524b = currentTimeMillis;
        postDelayed(new Runnable() {
            /* class com.bytedance.analytics.a.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3149);
            }

            public final void run() {
                b.a();
            }
        }, (long) a.f6512b);
        MethodCollector.o(5265);
    }
}
