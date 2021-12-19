package com.bytedance.android.livesdk.utils;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.Locale;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f22224a = new ad();

    private ad() {
    }

    static {
        Covode.recordClassIndex(13121);
    }

    public static final String a(long j2) {
        if (10000 <= j2 && 999999 >= j2) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            StringBuilder sb = new StringBuilder();
            String a2 = a.a(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000.0d)}, 1));
            l.b(a2, "");
            return sb.append(a2).append("K").toString();
        } else if (j2 >= 1000000) {
            double d3 = (double) j2;
            Double.isNaN(d3);
            StringBuilder sb2 = new StringBuilder();
            String a3 = a.a(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3 / 1000000.0d)}, 1));
            l.b(a3, "");
            return sb2.append(a3).append("M").toString();
        } else if (j2 >= 1000) {
            return new StringBuffer(String.valueOf(j2)).insert(1, ',').toString();
        } else {
            return String.valueOf(j2);
        }
    }
}
