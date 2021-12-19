package com.lynx.b.a.b;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55130a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f55131b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f55132c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f55133d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f55134e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f55135f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f55136g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f55137h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f55138i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f55139j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f55140k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f55141l;
    public static final a[] o;

    /* renamed from: m  reason: collision with root package name */
    public final int f55142m;
    public final boolean n;

    public final a b() {
        if (!this.n) {
            return o[this.f55142m + 1];
        }
        return this;
    }

    public final a a() {
        if (!this.n) {
            return this;
        }
        a aVar = o[this.f55142m - 1];
        if (!aVar.n) {
            return aVar;
        }
        return f55130a;
    }

    static {
        Covode.recordClassIndex(34593);
        a aVar = new a(0, false);
        f55130a = aVar;
        a aVar2 = new a(1, true);
        f55131b = aVar2;
        a aVar3 = new a(2, false);
        f55132c = aVar3;
        a aVar4 = new a(3, true);
        f55133d = aVar4;
        a aVar5 = new a(4, false);
        f55134e = aVar5;
        a aVar6 = new a(5, true);
        f55135f = aVar6;
        a aVar7 = new a(6, false);
        f55136g = aVar7;
        a aVar8 = new a(7, true);
        f55137h = aVar8;
        a aVar9 = new a(8, false);
        f55138i = aVar9;
        a aVar10 = new a(9, true);
        f55139j = aVar10;
        a aVar11 = new a(10, false);
        f55140k = aVar11;
        a aVar12 = new a(10, true);
        f55141l = aVar12;
        o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    public final boolean a(a aVar) {
        int i2 = this.f55142m;
        int i3 = aVar.f55142m;
        if (i2 < i3) {
            return true;
        }
        if ((!this.n || f55139j == this) && i2 == i3) {
            return true;
        }
        return false;
    }

    private a(int i2, boolean z) {
        this.f55142m = i2;
        this.n = z;
    }
}
