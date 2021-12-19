package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PressFadeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f131126a;

    static {
        Covode.recordClassIndex(85929);
    }

    private void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(ad.f131375a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f131126a;
    }

    public void setIntercept(boolean z) {
        this.f131126a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i2), "alpha", 1.0f, 0.5f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                ofFloat.addUpdateListener(ac.f131374a);
            }
        } else if (action == 1) {
            a();
        } else if (action == 3) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PressFadeFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2172);
        MethodCollector.o(2172);
    }
}
