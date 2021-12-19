package com.bytedance.android.live.core.f;

import com.bytedance.android.livesdk.utils.h;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(4616);
    }

    public static boolean c(long j2) {
        return j2 >= 1000;
    }

    public static String b(long j2) {
        if (j2 >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            return sb.append(h.a("%.2f", Double.valueOf((d2 * 1.0d) / 1000000.0d))).append("m").toString();
        } else if (j2 < 1000) {
            return String.valueOf(j2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            return sb2.append(h.a("%.2f", Double.valueOf((d3 * 1.0d) / 1000.0d))).append("k").toString();
        }
    }

    public static String a(long j2) {
        if (j2 < 1000) {
            return String.valueOf(j2);
        }
        if (j2 < 100000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            return sb.append(h.a("%.1f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("k").toString();
        } else if (j2 < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            return sb2.append(h.a("%.0f", Double.valueOf((d3 * 1.0d) / 1000.0d))).append("k").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d4 = (double) j2;
            Double.isNaN(d4);
            return sb3.append(h.a("%.1f", Double.valueOf((d4 * 1.0d) / 1000000.0d))).append("m").toString();
        }
    }
}
