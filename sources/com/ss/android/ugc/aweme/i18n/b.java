package com.ss.android.ugc.aweme.i18n;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class b {
    static {
        Covode.recordClassIndex(63610);
    }

    public static String a(long j2) {
        if (j2 < 0) {
            return "0";
        }
        if (j2 < 10000) {
            return String.valueOf(j2);
        }
        if (j2 < 1000000) {
            return a(j2, 1000, "K", "1000.0", "1.0M");
        }
        if (j2 < 1000000000) {
            return a(j2, 1000000, "M", "1000.0", "1.0B");
        }
        return a(j2, 1000000000, "B");
    }

    private static String a(long j2, long j3, String str) {
        return new BigDecimal(j2).divide(new BigDecimal(j3), 1, RoundingMode.HALF_UP).toString() + str;
    }

    private static String a(long j2, long j3, String str, String str2, String str3) {
        String a2 = a(j2, j3, "");
        if (a2.equals(str2)) {
            return str3;
        }
        return a2 + str;
    }
}
