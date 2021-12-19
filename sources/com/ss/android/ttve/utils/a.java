package com.ss.android.ttve.utils;

import android.animation.TimeInterpolator;
import com.bytedance.covode.number.Covode;

public final class a implements TimeInterpolator {
    static {
        Covode.recordClassIndex(37777);
    }

    public final float getInterpolation(float f2) {
        double d2 = (double) f2;
        if (d2 < 0.36363636363636365d) {
            return 7.5625f * f2 * f2;
        }
        if (d2 < 0.7272727272727273d) {
            float f3 = f2 - 0.54545456f;
            return (7.5625f * f3 * f3) + 0.75f;
        } else if (d2 < 0.9090909090909091d) {
            float f4 = f2 - 0.8181818f;
            return (7.5625f * f4 * f4) + 0.9375f;
        } else {
            float f5 = f2 - 0.95454544f;
            return (7.5625f * f5 * f5) + 0.984375f;
        }
    }
}
