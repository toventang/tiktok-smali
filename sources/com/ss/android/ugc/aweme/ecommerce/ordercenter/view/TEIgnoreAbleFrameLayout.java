package com.ss.android.ugc.aweme.ecommerce.ordercenter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class TEIgnoreAbleFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f86251a;

    static {
        Covode.recordClassIndex(53988);
    }

    public final boolean getTouchEventDisable() {
        return this.f86251a;
    }

    public final void setTouchEventDisable(boolean z) {
        this.f86251a = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f86251a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TEIgnoreAbleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(8394);
        MethodCollector.o(8394);
    }
}
