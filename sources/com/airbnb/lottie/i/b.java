package com.airbnb.lottie.i;

import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(2383);
    }

    private static float b(float f2) {
        if (f2 <= 0.04045f) {
            return f2 / 12.92f;
        }
        return (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    private static float a(float f2) {
        if (f2 <= 0.0031308f) {
            return f2 * 12.92f;
        }
        return (float) ((Math.pow((double) f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int a(float f2, int i2, int i3) {
        if (d.a.f5625a && i2 == i3) {
            return i2;
        }
        float f3 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float b2 = b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b3 = b(((float) ((i2 >> 8) & 255)) / 255.0f);
        float b4 = b(((float) (i2 & 255)) / 255.0f);
        float b5 = b(((float) ((i3 >> 16) & 255)) / 255.0f);
        float b6 = b3 + ((b(((float) ((i3 >> 8) & 255)) / 255.0f) - b3) * f2);
        return (Math.round(a(b2 + ((b5 - b2) * f2)) * 255.0f) << 16) | (Math.round((f3 + (((((float) ((i3 >> 24) & 255)) / 255.0f) - f3) * f2)) * 255.0f) << 24) | (Math.round(a(b6) * 255.0f) << 8) | Math.round(a(b4 + (f2 * (b(((float) (i3 & 255)) / 255.0f) - b4))) * 255.0f);
    }
}
