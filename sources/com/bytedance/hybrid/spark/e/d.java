package com.bytedance.hybrid.spark.e;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f31184a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(18107);
    }

    public static int a(Context context, double d2) {
        l.c(context, "");
        if (context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        if (resources.getDisplayMetrics() == null) {
            return 0;
        }
        Resources resources2 = context.getResources();
        l.a((Object) resources2, "");
        double d3 = (double) resources2.getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 * d3) + 0.5d);
    }
}
