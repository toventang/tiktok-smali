package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(35935);
    }

    public static int a(String str, int i2) {
        while (i2 < str.length() && ((r1 = str.charAt(i2)) == ' ' || r1 == '\t')) {
            i2++;
        }
        return i2;
    }

    public static int b(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static int a(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }
}
