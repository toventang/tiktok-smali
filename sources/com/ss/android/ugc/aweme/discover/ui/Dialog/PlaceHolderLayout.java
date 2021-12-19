package com.ss.android.ugc.aweme.discover.ui.Dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class PlaceHolderLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(51079);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceHolderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(3081);
        MethodCollector.o(3081);
    }
}
