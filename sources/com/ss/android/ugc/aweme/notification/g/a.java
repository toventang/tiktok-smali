package com.ss.android.ugc.aweme.notification.g;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(72971);
    }

    public static void a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.notification.g.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(72972);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.a(true, view);
                } else if (action == 1 || action == 3) {
                    a.a(false, view);
                }
                return false;
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.g.a$a  reason: collision with other inner class name */
    public static class View$OnTouchListenerC2909a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public GestureDetector f113480a;

        /* renamed from: b  reason: collision with root package name */
        public View.OnTouchListener f113481b;

        static {
            Covode.recordClassIndex(72973);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f113480a;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                a.a(true, view);
            } else if (action == 1 || action == 3) {
                a.a(false, view);
            }
            View.OnTouchListener onTouchListener = this.f113481b;
            if (onTouchListener != null) {
                return z | onTouchListener.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    public static void a(boolean z, View view) {
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }
}
