package com.ss.android.ugc.aweme.df;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class i {
    static {
        Covode.recordClassIndex(49830);
    }

    public static String a(long j2, long j3, String str) {
        return new BigDecimal(j2).divide(new BigDecimal(j3), 1, RoundingMode.HALF_UP).toString() + str;
    }

    public static String a(long j2, long j3, String str, String str2, String str3) {
        String a2 = a(j2, j3, "");
        if (a2.equals(str2)) {
            return str3;
        }
        return a2 + str;
    }
}
