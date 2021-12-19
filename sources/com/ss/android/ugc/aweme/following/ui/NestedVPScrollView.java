package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class NestedVPScrollView extends NestedScrollView {

    /* renamed from: d  reason: collision with root package name */
    private float f96381d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f96382e = -1.0f;

    static {
        Covode.recordClassIndex(61034);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.f96381d) + 0.0f >= Math.abs(rawY - this.f96382e) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f96381d = rawX;
                this.f96382e = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedVPScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (byte) 0);
        l.d(context, "");
    }
}
