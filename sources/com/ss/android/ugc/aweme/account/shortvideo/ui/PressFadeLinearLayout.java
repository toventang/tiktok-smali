package com.ss.android.ugc.aweme.account.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PressFadeLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f65333a;

    static {
        Covode.recordClassIndex(40168);
    }

    private void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeLinearLayout.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(40170);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f65333a;
    }

    public void setIntercept(boolean z) {
        this.f65333a = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i2), "alpha", 1.0f, 0.5f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeLinearLayout.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(40169);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    }
                });
            }
        } else if (action == 1) {
            a();
        } else if (action == 3) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PressFadeLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5507);
        MethodCollector.o(5507);
    }
}
