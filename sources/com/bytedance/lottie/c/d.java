package com.bytedance.lottie.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.n;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f40644a;

    /* renamed from: b  reason: collision with root package name */
    public final double f40645b;

    /* renamed from: c  reason: collision with root package name */
    public final double f40646c;

    /* renamed from: d  reason: collision with root package name */
    public final String f40647d;

    /* renamed from: e  reason: collision with root package name */
    private final char f40648e;

    /* renamed from: f  reason: collision with root package name */
    private final String f40649f;

    static {
        Covode.recordClassIndex(24929);
    }

    public final int hashCode() {
        return a(this.f40648e, this.f40649f, this.f40647d);
    }

    public static int a(char c2, String str, String str2) {
        return ((((c2 + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public d(List<n> list, char c2, double d2, double d3, String str, String str2) {
        this.f40644a = list;
        this.f40648e = c2;
        this.f40645b = d2;
        this.f40646c = d3;
        this.f40647d = str;
        this.f40649f = str2;
    }
}
