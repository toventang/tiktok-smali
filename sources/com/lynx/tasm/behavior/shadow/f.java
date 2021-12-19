package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;

public class f {
    static {
        Covode.recordClassIndex(34968);
    }

    public static long a() {
        return a(0.0f, 0.0f);
    }

    public static long a(float f2, float f3) {
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        return ((long) Float.floatToRawIntBits(f3)) | (((long) floatToRawIntBits) << 32);
    }
}
