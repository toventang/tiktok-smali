package com.airbnb.lottie.e;

import com.airbnb.lottie.e.b.n;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f5519a;

    /* renamed from: b  reason: collision with root package name */
    public final double f5520b;

    /* renamed from: c  reason: collision with root package name */
    public final double f5521c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5522d;

    /* renamed from: e  reason: collision with root package name */
    private final char f5523e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5524f;

    static {
        Covode.recordClassIndex(2298);
    }

    public final int hashCode() {
        return a(this.f5523e, this.f5524f, this.f5522d);
    }

    public static int a(char c2, String str, String str2) {
        return ((((c2 + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public d(List<n> list, char c2, double d2, double d3, String str, String str2) {
        this.f5519a = list;
        this.f5523e = c2;
        this.f5520b = d2;
        this.f5521c = d3;
        this.f5522d = str;
        this.f5524f = str2;
    }
}
