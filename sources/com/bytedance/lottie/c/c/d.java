package com.bytedance.lottie.c.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.j;
import com.bytedance.lottie.c.a.k;
import com.bytedance.lottie.c.a.l;
import com.bytedance.lottie.g;
import java.util.List;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bytedance.lottie.c.b.b> f40613a;

    /* renamed from: b  reason: collision with root package name */
    public final g f40614b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40615c;

    /* renamed from: d  reason: collision with root package name */
    public final long f40616d;

    /* renamed from: e  reason: collision with root package name */
    public final a f40617e;

    /* renamed from: f  reason: collision with root package name */
    public final long f40618f;

    /* renamed from: g  reason: collision with root package name */
    public final String f40619g;

    /* renamed from: h  reason: collision with root package name */
    public final List<com.bytedance.lottie.c.b.g> f40620h;

    /* renamed from: i  reason: collision with root package name */
    public final l f40621i;

    /* renamed from: j  reason: collision with root package name */
    public final int f40622j;

    /* renamed from: k  reason: collision with root package name */
    public final int f40623k;

    /* renamed from: l  reason: collision with root package name */
    public final int f40624l;

    /* renamed from: m  reason: collision with root package name */
    public final float f40625m;
    final float n;
    public final int o;
    public final int p;
    public final j q;
    public final k r;
    public final com.bytedance.lottie.c.a.b s;
    public final List<com.bytedance.lottie.g.a<Float>> t;
    public final b u;

    static {
        Covode.recordClassIndex(24920);
    }

    public final String toString() {
        return a("");
    }

    public enum b {
        None,
        Add,
        Invert,
        Unknown;

        static {
            Covode.recordClassIndex(24922);
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
            Covode.recordClassIndex(24921);
        }
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(this.f40615c).append("\n");
        d a2 = this.f40614b.a(this.f40618f);
        if (a2 != null) {
            sb.append("\t\tParents: ").append(a2.f40615c);
            d a3 = this.f40614b.a(a2.f40618f);
            while (a3 != null) {
                sb.append("->").append(a3.f40615c);
                a3 = this.f40614b.a(a3.f40618f);
            }
            sb.append(str).append("\n");
        }
        if (!this.f40620h.isEmpty()) {
            sb.append(str).append("\tMasks: ").append(this.f40620h.size()).append("\n");
        }
        if (!(this.f40622j == 0 || this.f40623k == 0)) {
            sb.append(str).append("\tBackground: ").append(com.a.a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f40622j), Integer.valueOf(this.f40623k), Integer.valueOf(this.f40624l)}));
        }
        if (!this.f40613a.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            for (com.bytedance.lottie.c.b.b bVar : this.f40613a) {
                sb.append(str).append("\t\t").append(bVar).append("\n");
            }
        }
        return sb.toString();
    }

    public d(List<com.bytedance.lottie.c.b.b> list, g gVar, String str, long j2, a aVar, long j3, String str2, List<com.bytedance.lottie.c.b.g> list2, l lVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, j jVar, k kVar, List<com.bytedance.lottie.g.a<Float>> list3, b bVar, com.bytedance.lottie.c.a.b bVar2) {
        this.f40613a = list;
        this.f40614b = gVar;
        this.f40615c = str;
        this.f40616d = j2;
        this.f40617e = aVar;
        this.f40618f = j3;
        this.f40619g = str2;
        this.f40620h = list2;
        this.f40621i = lVar;
        this.f40622j = i2;
        this.f40623k = i3;
        this.f40624l = i4;
        this.f40625m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
    }
}
