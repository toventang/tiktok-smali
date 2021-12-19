package com.airbnb.lottie.e.c;

import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.j;
import com.airbnb.lottie.e.a.k;
import com.airbnb.lottie.e.a.l;
import com.airbnb.lottie.e.b.g;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.airbnb.lottie.e.b.b> f5489a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5490b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5491c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5492d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5493e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5494f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5495g;

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f5496h;

    /* renamed from: i  reason: collision with root package name */
    public final l f5497i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5498j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5499k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5500l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5501m;
    public final int n;
    public final int o;
    public final j p;
    public final k q;
    public final com.airbnb.lottie.e.a.b r;
    public final List<com.airbnb.lottie.j.a<Float>> s;
    public final b t;
    private final float u;

    static {
        Covode.recordClassIndex(2289);
    }

    public final String toString() {
        return a("");
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        return this.u / this.f5490b.b();
    }

    public enum b {
        None,
        Add,
        Invert,
        Unknown;

        static {
            Covode.recordClassIndex(2291);
        }
    }

    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown;

        static {
            Covode.recordClassIndex(2290);
        }
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(this.f5491c).append("\n");
        d a2 = this.f5490b.a(this.f5494f);
        if (a2 != null) {
            sb.append("\t\tParents: ").append(a2.f5491c);
            d a3 = this.f5490b.a(a2.f5494f);
            while (a3 != null) {
                sb.append("->").append(a3.f5491c);
                a3 = this.f5490b.a(a3.f5494f);
            }
            sb.append(str).append("\n");
        }
        if (!this.f5496h.isEmpty()) {
            sb.append(str).append("\tMasks: ").append(this.f5496h.size()).append("\n");
        }
        if (!(this.f5498j == 0 || this.f5499k == 0)) {
            sb.append(str).append("\tBackground: ").append(com.a.a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f5498j), Integer.valueOf(this.f5499k), Integer.valueOf(this.f5500l)}));
        }
        if (!this.f5489a.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            for (com.airbnb.lottie.e.b.b bVar : this.f5489a) {
                sb.append(str).append("\t\t").append(bVar).append("\n");
            }
        }
        return sb.toString();
    }

    public d(List<com.airbnb.lottie.e.b.b> list, e eVar, String str, long j2, a aVar, long j3, String str2, List<g> list2, l lVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, j jVar, k kVar, List<com.airbnb.lottie.j.a<Float>> list3, b bVar, com.airbnb.lottie.e.a.b bVar2) {
        this.f5489a = list;
        this.f5490b = eVar;
        this.f5491c = str;
        this.f5492d = j2;
        this.f5493e = aVar;
        this.f5494f = j3;
        this.f5495g = str2;
        this.f5496h = list2;
        this.f5497i = lVar;
        this.f5498j = i2;
        this.f5499k = i3;
        this.f5500l = i4;
        this.f5501m = f2;
        this.u = f3;
        this.n = i5;
        this.o = i6;
        this.p = jVar;
        this.q = kVar;
        this.s = list3;
        this.t = bVar;
        this.r = bVar2;
    }
}
