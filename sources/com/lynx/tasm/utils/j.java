package com.lynx.tasm.utils;

import android.util.TypedValue;
import com.bytedance.covode.number.Covode;

public class j {
    static {
        Covode.recordClassIndex(35482);
    }

    public static float c(float f2) {
        return f2 / DisplayMetricsHolder.a().density;
    }

    public static float a(float f2) {
        return TypedValue.applyDimension(1, f2, DisplayMetricsHolder.a());
    }

    public static float b(float f2) {
        return TypedValue.applyDimension(2, f2, DisplayMetricsHolder.a());
    }
}
