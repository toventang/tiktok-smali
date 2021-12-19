package com.d.a.a.a.a;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(28288);
    }

    public static float a(int i2, int i3) {
        if (i3 <= 0 || i2 <= 0) {
            return 0.0f;
        }
        float f2 = ((float) i2) / ((float) i3);
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }
}
