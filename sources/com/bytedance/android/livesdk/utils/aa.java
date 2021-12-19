package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;

public final class aa {
    static {
        Covode.recordClassIndex(13118);
    }

    public static String a(long j2) {
        if (j2 < 1000) {
            return String.valueOf(j2);
        }
        if (j2 < 100000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            return sb.append(h.a("%.1f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("K").toString();
        } else if (j2 < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            return sb2.append(h.a("%.0f", Double.valueOf((d3 * 1.0d) / 1000.0d))).append("K").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d4 = (double) j2;
            Double.isNaN(d4);
            return sb3.append(h.a("%.1f", Double.valueOf((d4 * 1.0d) / 1000000.0d))).append("M").toString();
        }
    }

    public static String b(long j2) {
        if (j2 < 10000) {
            return String.valueOf(j2);
        }
        if (j2 < 100000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            return sb.append(h.a("%.1f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("K").toString();
        } else if (j2 < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            return sb2.append(h.a("%.0f", Double.valueOf((d3 * 1.0d) / 1000.0d))).append("K").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d4 = (double) j2;
            Double.isNaN(d4);
            return sb3.append(h.a("%.1f", Double.valueOf((d4 * 1.0d) / 1000000.0d))).append("M").toString();
        }
    }
}
