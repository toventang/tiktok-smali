package com.facebook.fresco.animation.c.a;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(28845);
    }

    public static ValueAnimator a(final com.facebook.fresco.animation.c.a aVar) {
        int a2;
        if (aVar.f47563b) {
            a2 = aVar.f47562a;
        } else if (aVar.f47564d == null) {
            a2 = 0;
        } else {
            a2 = aVar.f47564d.a();
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, (int) aVar.b());
        valueAnimator.setDuration(aVar.b());
        if (a2 == 0) {
            a2 = -1;
        }
        valueAnimator.setRepeatCount(a2);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.facebook.fresco.animation.c.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28846);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        return valueAnimator;
    }
}
