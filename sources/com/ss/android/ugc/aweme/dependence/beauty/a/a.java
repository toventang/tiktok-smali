package com.ss.android.ugc.aweme.dependence.beauty.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.b.c;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79581a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(49431);
    }

    public static final float b(Context context) {
        l.d(context, "");
        return r.a(context, 12.0f);
    }

    public static final float c(Context context) {
        l.d(context, "");
        return r.a(context, 20.0f);
    }

    public static final float d(Context context) {
        l.d(context, "");
        return a(context) + b(context);
    }

    public static final float a(Context context) {
        l.d(context, "");
        int a2 = c.a(context);
        float b2 = b(context);
        float c2 = c(context);
        l.d(context, "");
        float a3 = r.a(context, 52.0f);
        l.d(context, "");
        float a4 = r.a(context, 80.0f);
        double d2 = (double) ((((float) a2) - c2) - (b2 * 5.0f));
        Double.isNaN(d2);
        float f2 = (float) (d2 / 5.3d);
        if (f2 < a3) {
            return a3;
        }
        return f2 > a4 ? a4 : f2;
    }
}
