package com.lynx.tasm.utils;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

public class n {
    static {
        Covode.recordClassIndex(35486);
    }

    public static float a(String str) {
        return b(str, 0.0f);
    }

    public static float a(String str, float f2) {
        return b(str, f2);
    }

    public static float b(String str, float f2) {
        return a(str, 0.0f, 0.0f, 0.0f, 0.0f, f2, DisplayMetricsHolder.a());
    }

    public static float a(String str, DisplayMetrics displayMetrics) {
        int length;
        if (TextUtils.isEmpty(str)) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 1) {
            try {
                if (str.endsWith("%")) {
                    return (Float.parseFloat(str.substring(0, length - 1)) * 0.0f) / 100.0f;
                }
            } catch (Throwable unused) {
                LLog.c("lynx", "Number parse error from value = " + str + " to px!");
                return 0.0f;
            }
        }
        return a(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
    }

    public static float a(String str, float f2, float f3) {
        return a(str, f2, f3, 0.0f, 0.0f, 0.0f, DisplayMetricsHolder.a());
    }

    public static float a(String str, float f2, float f3, float f4, float f5, DisplayMetrics displayMetrics) {
        return a(str, f2, f3, f4, f5, 0.0f, displayMetrics);
    }

    public static float a(String str, float f2, float f3, float f4, float f5, float f6, DisplayMetrics displayMetrics) {
        if (TextUtils.isEmpty(str)) {
            return f6;
        }
        int length = str.length();
        if (length > 3) {
            try {
                if (str.endsWith("rpx")) {
                    return (((float) displayMetrics.widthPixels) * Float.parseFloat(str.substring(0, length - 3))) / 750.0f;
                }
            } catch (Throwable unused) {
                LLog.c("lynx", "Number parse error from value = " + str + " to px!");
                return f6;
            }
        }
        if (length > 3 && str.endsWith("ppx")) {
            return Float.parseFloat(str.substring(0, length - 3));
        }
        if (length > 2 && str.endsWith("px")) {
            return j.a(Float.parseFloat(str.substring(0, length - 2)));
        }
        if (length > 1 && str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, length - 1)) / 100.0f;
        }
        if (length > 3 && str.endsWith("rem")) {
            return Float.parseFloat(str.substring(0, length - 3)) * f2;
        }
        if (length > 2 && str.endsWith("em")) {
            return Float.parseFloat(str.substring(0, length - 2)) * f3;
        }
        if (length > 2 && str.endsWith("vw")) {
            return (f4 * Float.parseFloat(str.substring(0, length - 2))) / 100.0f;
        }
        if (length > 2 && str.endsWith("vh")) {
            return (f5 * Float.parseFloat(str.substring(0, length - 2))) / 100.0f;
        }
        if (length > 0) {
            return Float.parseFloat(str);
        }
        return f6;
    }
}
