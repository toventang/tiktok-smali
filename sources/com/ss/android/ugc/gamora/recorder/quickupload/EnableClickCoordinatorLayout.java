package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class EnableClickCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: h  reason: collision with root package name */
    private boolean f148184h;

    static {
        Covode.recordClassIndex(97669);
    }

    public EnableClickCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setNoClick(boolean z) {
        this.f148184h = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f148184h) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ EnableClickCoordinatorLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EnableClickCoordinatorLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
