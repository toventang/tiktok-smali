package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class en {
    static {
        Covode.recordClassIndex(84219);
    }

    public static int a(double d2, Context context) {
        if (context == null || context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d3 = (double) context.getResources().getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 * d3) + 0.5d);
    }
}
