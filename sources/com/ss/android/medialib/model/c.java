package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public long f59750a;

    /* renamed from: b  reason: collision with root package name */
    public double f59751b;

    static {
        Covode.recordClassIndex(36919);
    }

    public static int a(List<? extends c> list) {
        int i2 = 0;
        if (list != null && list.size() > 0) {
            for (c cVar : list) {
                long j2 = cVar.f59750a;
                double d2 = cVar.f59751b;
                double d3 = (double) j2;
                Double.isNaN(d3);
                i2 = (int) (((long) i2) + ((long) ((d3 * 1.0d) / d2)));
            }
        }
        return i2;
    }

    public c(long j2, double d2) {
        this.f59750a = j2;
        this.f59751b = d2;
    }
}
