package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class n {
    static {
        Covode.recordClassIndex(42140);
    }

    public static int b(double d2) {
        double d3 = (double) d.a().getResources().getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 / d3) + 0.5d);
    }

    public static int c(double d2) {
        double d3 = (double) d.a().getResources().getDisplayMetrics().scaledDensity;
        Double.isNaN(d3);
        return (int) ((d2 * d3) + 0.5d);
    }

    public static int a(double d2) {
        Context a2 = d.a();
        if (a2 == null || a2.getResources() == null || a2.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d3 = (double) a2.getResources().getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 * d3) + 0.5d);
    }

    public static int a(Context context, int i2) {
        return (int) ((((float) i2) * context.getResources().getDisplayMetrics().density) / 2.0f);
    }
}
