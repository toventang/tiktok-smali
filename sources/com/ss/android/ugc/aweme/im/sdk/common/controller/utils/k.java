package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f102420a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(65567);
    }

    public static String a(long j2) {
        if (j2 < 1000) {
            return String.valueOf(j2);
        }
        if (j2 < 1000000) {
            return a(j2, 1000, "k");
        }
        if (j2 < 1000000000) {
            return a(j2, 1000000, "m");
        }
        return a(j2, 1000000000, "b");
    }

    private static String a(long j2, long j3, String str) {
        String bigDecimal = new BigDecimal(j2).divide(new BigDecimal(j3), 1, RoundingMode.HALF_UP).toString();
        l.b(bigDecimal, "");
        if ('0' != bigDecimal.charAt(bigDecimal.length() - 1)) {
            return bigDecimal + str;
        }
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(bigDecimal, "null cannot be cast to non-null type java.lang.String");
        String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
        l.b(substring, "");
        return sb.append(substring).append(str).toString();
    }
}
