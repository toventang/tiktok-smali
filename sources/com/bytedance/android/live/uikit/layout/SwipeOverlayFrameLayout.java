package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    a f12904a;

    /* renamed from: b  reason: collision with root package name */
    float f12905b;

    /* renamed from: c  reason: collision with root package name */
    float f12906c;

    /* renamed from: d  reason: collision with root package name */
    private GestureDetector f12907d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12908e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12909f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12910g;

    public interface a {
        static {
            Covode.recordClassIndex(7165);
        }

        boolean a();

        boolean b();
    }

    static {
        Covode.recordClassIndex(7163);
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f12909f = z;
    }

    public void setOnSwipeListener(a aVar) {
        this.f12904a = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f12908e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f12910g = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f12910g = false;
            }
            if (this.f12910g && this.f12909f) {
                z = true;
            }
            if (!this.f12908e || (gestureDetector = this.f12907d) == null || z || !gestureDetector.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12093);
        AnonymousClass1 r3 = new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.android.live.uikit.layout.SwipeOverlayFrameLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7164);
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                if (swipeOverlayFrameLayout.f12904a == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f12905b) {
                    return false;
                }
                float abs = Math.abs(f2);
                float abs2 = Math.abs(f3);
                float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs2 >= abs || abs4 >= abs3 || abs3 <= swipeOverlayFrameLayout.f12906c) {
                    return false;
                }
                if (f2 > 0.0f) {
                    return swipeOverlayFrameLayout.f12904a.b();
                }
                if (f2 < 0.0f) {
                    return swipeOverlayFrameLayout.f12904a.a();
                }
                return false;
            }
        };
        this.f12905b = n.b(context, 45.0f);
        this.f12906c = n.b(context, 65.0f);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        GestureDetector gestureDetector = new GestureDetector(applicationContext, r3);
        this.f12907d = gestureDetector;
        gestureDetector.setOnDoubleTapListener(null);
        this.f12907d.setIsLongpressEnabled(false);
        MethodCollector.o(12093);
    }
}
