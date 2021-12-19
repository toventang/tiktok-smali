package com.bytedance.ies.xelement.bytedlottie;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f36799a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f36800b = new long[100];

    /* renamed from: c  reason: collision with root package name */
    public int f36801c;

    /* renamed from: d  reason: collision with root package name */
    public int f36802d;

    /* renamed from: e  reason: collision with root package name */
    public double f36803e;

    static {
        Covode.recordClassIndex(22090);
    }

    public final float a() {
        double d2 = this.f36803e;
        if (this.f36801c > 0) {
            long[] jArr = this.f36800b;
            l.d(jArr, "");
            long j2 = 0;
            for (long j3 : jArr) {
                j2 += j3;
            }
            double d3 = (double) j2;
            double d4 = this.f36803e;
            int i2 = this.f36802d;
            double d5 = (double) (i2 - this.f36801c);
            Double.isNaN(d5);
            Double.isNaN(d3);
            double d6 = (double) i2;
            Double.isNaN(d6);
            d2 = (d3 + (d4 * d5)) / d6;
        }
        this.f36799a = 0;
        this.f36801c = 0;
        this.f36802d = 0;
        this.f36803e = 0.0d;
        float f2 = (float) d2;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return 1.0E9f / f2;
    }
}
