package com.bytedance.ies.dmt.ui.f;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(19973);
    }

    public static void a(View view, final float f2) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ies.dmt.ui.f.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(19974);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    c.a(true, view, f2);
                } else if (action == 1 || action == 3) {
                    c.a(false, view, f2);
                }
                return false;
            }
        });
    }

    public static class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public GestureDetector f33487a;

        /* renamed from: b  reason: collision with root package name */
        public View.OnTouchListener f33488b;

        static {
            Covode.recordClassIndex(19975);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f33487a;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                c.a(true, view, 0.5f);
            } else if (action == 1 || action == 3) {
                c.a(false, view, 0.5f);
            }
            View.OnTouchListener onTouchListener = this.f33488b;
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
