package com.bytedance.b.c.c;

import com.bytedance.apm.q.b;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(15184);
    }

    public static double a() {
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = b.c();
        try {
            Thread.sleep(360);
        } catch (InterruptedException unused) {
        }
        double c3 = (double) b.c();
        double d2 = (double) c2;
        Double.isNaN(c3);
        Double.isNaN(d2);
        double currentTimeMillis2 = (double) (System.currentTimeMillis() - currentTimeMillis);
        Double.isNaN(currentTimeMillis2);
        double d3 = ((c3 - d2) * 1000.0d) / currentTimeMillis2;
        double g2 = (double) b.g();
        Double.isNaN(g2);
        return d3 / g2;
    }
}
