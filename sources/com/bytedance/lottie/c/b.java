package com.bytedance.lottie.c;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f40487a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40488b;

    /* renamed from: c  reason: collision with root package name */
    public final double f40489c;

    /* renamed from: d  reason: collision with root package name */
    final int f40490d;

    /* renamed from: e  reason: collision with root package name */
    public final int f40491e;

    /* renamed from: f  reason: collision with root package name */
    final double f40492f;

    /* renamed from: g  reason: collision with root package name */
    public final double f40493g;

    /* renamed from: h  reason: collision with root package name */
    public final int f40494h;

    /* renamed from: i  reason: collision with root package name */
    public final int f40495i;

    /* renamed from: j  reason: collision with root package name */
    public final double f40496j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40497k;

    static {
        Covode.recordClassIndex(24888);
    }

    public final int hashCode() {
        double hashCode = (double) (((this.f40487a.hashCode() * 31) + this.f40488b.hashCode()) * 31);
        double d2 = this.f40489c;
        Double.isNaN(hashCode);
        int i2 = (((((int) (hashCode + d2)) * 31) + this.f40490d) * 31) + this.f40491e;
        long doubleToLongBits = Double.doubleToLongBits(this.f40492f);
        return (((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f40494h;
    }

    public b(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, double d5, boolean z) {
        this.f40487a = str;
        this.f40488b = str2;
        this.f40489c = d2;
        this.f40490d = i2;
        this.f40491e = i3;
        this.f40492f = d3;
        this.f40493g = d4;
        this.f40494h = i4;
        this.f40495i = i5;
        this.f40496j = d5;
        this.f40497k = z;
    }
}
