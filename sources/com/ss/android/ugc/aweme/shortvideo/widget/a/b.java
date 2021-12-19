package com.ss.android.ugc.aweme.shortvideo.widget.a;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(86926);
    }

    public static void a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(86928);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    b.a(view, true);
                } else if (action == 1 || action == 3) {
                    b.a(view, false);
                }
                return false;
            }
        });
    }

    public static void a(View view, boolean z) {
        float f2;
        ViewPropertyAnimator animate = view.animate();
        float f3 = 1.2f;
        if (z) {
            f2 = 1.2f;
        } else {
            f2 = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f2);
        if (!z) {
            f3 = 1.0f;
        }
        scaleX.scaleY(f3).setDuration(100).start();
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
