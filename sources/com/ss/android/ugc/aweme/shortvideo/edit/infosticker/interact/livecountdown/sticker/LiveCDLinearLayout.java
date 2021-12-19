package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class LiveCDLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f127465a;

    static {
        Covode.recordClassIndex(83573);
    }

    public final void setMode(boolean z) {
        this.f127465a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f127465a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveCDLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6018);
        MethodCollector.o(6018);
    }
}
