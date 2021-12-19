package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class i {
    static {
        Covode.recordClassIndex(34045);
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i2 == 1) {
            return "MMMM d, yyyy";
        }
        if (i2 == 2) {
            return "MMM d, yyyy";
        }
        if (i2 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i2)));
    }

    private static String b(int i2) {
        if (i2 == 0 || i2 == 1) {
            return "h:mm:ss a z";
        }
        if (i2 == 2) {
            return "h:mm:ss a";
        }
        if (i2 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i2)));
    }

    public static DateFormat a(int i2, int i3) {
        return new SimpleDateFormat(a(i2) + " " + b(i3), Locale.US);
    }
}
