package com.bytedance.ies.uikit.b;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private GestureDetector f35386a;

    /* renamed from: b  reason: collision with root package name */
    private a f35387b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35388c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35389d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35390e;

    public interface a {
        static {
            Covode.recordClassIndex(21182);
        }
    }

    static {
        Covode.recordClassIndex(21181);
    }

    public final void setDisllowInterceptEnabled(boolean z) {
        this.f35389d = z;
    }

    public final void setOnSwipeListener(a aVar) {
        this.f35387b = aVar;
    }

    public final void setSwipeEnabled(boolean z) {
        this.f35388c = z;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f35390e = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f35390e = false;
            }
            if (this.f35390e && this.f35389d) {
                z = true;
            }
            if (!this.f35388c || (gestureDetector = this.f35386a) == null || z || !gestureDetector.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
