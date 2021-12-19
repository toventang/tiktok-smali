package com.ss.android.ugc.aweme.filter;

import androidx.core.b.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, Float> f95492a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(60500);
    }

    public static final String b(FilterBean filterBean) {
        l.d(filterBean, "");
        return filterBean.getFilterFolder();
    }

    public static final float a(FilterBean filterBean) {
        l.d(filterBean, "");
        Float f2 = f95492a.get(Integer.valueOf(filterBean.getId()));
        if (f2 == null) {
            f2 = Float.valueOf(-1.0f);
        }
        return f2.floatValue();
    }

    public static final float a(FilterBean filterBean, k kVar) {
        l.d(filterBean, "");
        l.d(kVar, "");
        if (filterBean.getFilterFolder() == null) {
            return 0.8f;
        }
        Map<Integer, Float> map = f95492a;
        Integer valueOf = Integer.valueOf(filterBean.getId());
        Float f2 = map.get(valueOf);
        if (f2 == null) {
            f2 = Float.valueOf(kVar.a(filterBean));
            map.put(valueOf, f2);
        }
        float floatValue = f2.floatValue();
        if (floatValue < 0.0f) {
            return 0.0f;
        }
        return floatValue;
    }

    public static final float a(FilterBean filterBean, n nVar, k kVar) {
        l.d(filterBean, "");
        l.d(nVar, "");
        l.d(kVar, "");
        return a(filterBean, nVar.a(filterBean, kVar), kVar);
    }

    public static final float a(FilterBean filterBean, int i2, k kVar) {
        double d2;
        l.d(filterBean, "");
        l.d(kVar, "");
        float a2 = a(filterBean, kVar);
        if (a2 == 1.0f) {
            double d3 = (double) i2;
            Double.isNaN(d3);
            d2 = d3 / 100.0d;
        } else if (a2 <= 0.8f) {
            double d4 = (double) a2;
            Double.isNaN(d4);
            double d5 = (double) i2;
            Double.isNaN(d5);
            d2 = d5 * (d4 / 80.0d);
        } else {
            double d6 = (double) a2;
            Double.isNaN(d6);
            double d7 = d6 / 80.0d;
            Double.isNaN(d6);
            double d8 = (1.0d - d6) / 20.0d;
            if (i2 <= 80) {
                double d9 = (double) i2;
                Double.isNaN(d9);
                d2 = d9 * d7;
            } else {
                double d10 = (double) (i2 - 80);
                Double.isNaN(d10);
                Double.isNaN(d6);
                d2 = d6 + (d8 * d10);
            }
        }
        return (float) d2;
    }

    public static final int a(FilterBean filterBean, float f2, k kVar) {
        int a2;
        l.d(filterBean, "");
        l.d(kVar, "");
        float a3 = a(filterBean, kVar);
        if (a3 == 1.0f) {
            return a.a(h.g.a.a(f2 * 100.0f), 0, 100);
        }
        if (a3 <= 0.8f) {
            float f3 = f2 / (a3 / 80.0f);
            if (Float.isNaN(f3)) {
                a2 = 0;
            } else {
                a2 = h.g.a.a(f3);
            }
            return a.a(a2, 0, 100);
        }
        float f4 = a3 / 80.0f;
        float f5 = (1.0f - a3) / 20.0f;
        if (f2 <= a3) {
            return a.a(h.g.a.a(f2 / f4), 0, 100);
        }
        return a.a(h.g.a.a(((f2 - a3) / f5) + 80.0f), 0, 100);
    }
}
