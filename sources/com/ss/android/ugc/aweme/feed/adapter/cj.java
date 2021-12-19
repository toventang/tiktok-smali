package com.ss.android.ugc.aweme.feed.adapter;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class cj {
    static {
        Covode.recordClassIndex(57776);
    }

    static boolean a(int i2, int i3, int i4, int i5) {
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = (double) i4;
        double d6 = (double) i5;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        try {
            double parseDouble = Double.parseDouble(a.a(Locale.US, "%.2f", new Object[]{Double.valueOf(d4)}));
            double parseDouble2 = Double.parseDouble(a.a(Locale.US, "%.2f", new Object[]{Double.valueOf(d7)}));
            if (parseDouble <= 0.0d || parseDouble2 <= 0.0d || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
