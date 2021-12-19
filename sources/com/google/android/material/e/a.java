package com.google.android.material.e;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(32501);
    }

    public static float a(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    public static boolean a(float f2, float f3) {
        return f2 + 1.0E-4f >= f3;
    }

    private static float c(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }

    private static float b(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return c(b(f2, f3, 0.0f, 0.0f), b(f2, f3, f4, 0.0f), b(f2, f3, f4, f5), b(f2, f3, 0.0f, f5));
    }
}
