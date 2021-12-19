package com.bytedance.android.livesdk.feed.o;

import com.bytedance.android.live.core.f.g;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(9756);
    }

    public static String a(long j2) {
        if (j2 >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            return sb.append(g.a("%.1f", Double.valueOf((d2 * 1.0d) / 1000000.0d))).append("m").toString();
        } else if (j2 < 1000) {
            return String.valueOf(j2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            return sb2.append(g.a("%.1f", Double.valueOf((d3 * 1.0d) / 1000.0d))).append("k").toString();
        }
    }
}
