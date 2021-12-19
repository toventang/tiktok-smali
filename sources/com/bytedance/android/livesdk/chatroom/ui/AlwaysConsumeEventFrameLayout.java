package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AlwaysConsumeEventFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(8714);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10118);
        MethodCollector.o(10118);
    }
}
