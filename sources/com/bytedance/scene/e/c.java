package com.bytedance.scene.e;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42789a = true;

    static {
        Covode.recordClassIndex(26276);
    }

    public void setTouchEnabled(boolean z) {
        this.f42789a = z;
    }

    public c(Context context) {
        super(context);
        MethodCollector.i(8807);
        MethodCollector.o(8807);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f42789a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
