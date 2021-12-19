package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

public class c {
    static {
        Covode.recordClassIndex(35472);
    }

    public static float a(float f2) {
        if (f2 >= -3.4028235E38f && f2 <= Float.MAX_VALUE) {
            return f2;
        }
        if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        LLog.a(5, "lynx", "Invalid float property value: ".concat(String.valueOf(f2)));
        return 0.0f;
    }

    public static float a(String str) {
        if (str == null) {
            return Float.NaN;
        }
        String trim = str.trim();
        if (!trim.endsWith("%")) {
            try {
                return Float.parseFloat(trim);
            } catch (Exception unused) {
                return Float.NaN;
            }
        } else if (trim.length() < 2) {
            return Float.NaN;
        } else {
            try {
                return Float.parseFloat(trim.substring(0, trim.length() - 1)) / 100.0f;
            } catch (Exception unused2) {
                return Float.NaN;
            }
        }
    }

    public static boolean a(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (!Float.isNaN(f2) || !Float.isNaN(f3)) {
                return false;
            }
            return true;
        } else if (Math.abs(f3 - f2) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}
