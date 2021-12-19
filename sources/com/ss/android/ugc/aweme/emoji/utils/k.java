package com.ss.android.ugc.aweme.emoji.utils;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(56221);
    }

    public static class a implements View.OnTouchListener {

        /* renamed from: m  reason: collision with root package name */
        public GestureDetector f89470m;
        public View.OnTouchListener n;

        static {
            Covode.recordClassIndex(56223);
        }

        public final void a(View... viewArr) {
            int i2 = 0;
            do {
                View view = viewArr[0];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
                i2++;
            } while (i2 <= 0);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f89470m;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                k.a(true, view, 0.5f);
            } else if (action == 1 || action == 3) {
                k.a(false, view, 0.5f);
            }
            View.OnTouchListener onTouchListener = this.n;
            if (onTouchListener != null) {
                return z | onTouchListener.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    public static void a(boolean z, View view, float f2) {
        float f3;
        float[] fArr = new float[2];
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        fArr[0] = f3;
        if (!z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }
}
