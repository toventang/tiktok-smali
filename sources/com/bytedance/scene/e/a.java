package com.bytedance.scene.e;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends FrameLayout {
    static {
        Covode.recordClassIndex(26274);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(11028);
        MethodCollector.o(11028);
    }
}
