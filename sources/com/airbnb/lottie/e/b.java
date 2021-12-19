package com.airbnb.lottie.e;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5363a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5364b;

    /* renamed from: c  reason: collision with root package name */
    public final double f5365c;

    /* renamed from: d  reason: collision with root package name */
    final int f5366d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5367e;

    /* renamed from: f  reason: collision with root package name */
    final double f5368f;

    /* renamed from: g  reason: collision with root package name */
    public final double f5369g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5370h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5371i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5372j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5373k;

    static {
        Covode.recordClassIndex(2257);
    }

    public final int hashCode() {
        double hashCode = (double) (((this.f5363a.hashCode() * 31) + this.f5364b.hashCode()) * 31);
        double d2 = this.f5365c;
        Double.isNaN(hashCode);
        int i2 = (((((int) (hashCode + d2)) * 31) + this.f5366d) * 31) + this.f5367e;
        long doubleToLongBits = Double.doubleToLongBits(this.f5368f);
        return (((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f5370h;
    }

    public b(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, int i6, boolean z) {
        this.f5363a = str;
        this.f5364b = str2;
        this.f5365c = d2;
        this.f5366d = i2;
        this.f5367e = i3;
        this.f5368f = d3;
        this.f5369g = d4;
        this.f5370h = i4;
        this.f5371i = i5;
        this.f5372j = i6;
        this.f5373k = z;
    }
}
