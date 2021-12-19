package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.List;

/* access modifiers changed from: package-private */
public final class ec {
    private boolean A;
    private String B;
    private Boolean C;
    private long D;
    private String E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    final ff f51478a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f51479b;

    /* renamed from: c  reason: collision with root package name */
    long f51480c;

    /* renamed from: d  reason: collision with root package name */
    long f51481d;

    /* renamed from: e  reason: collision with root package name */
    long f51482e;

    /* renamed from: f  reason: collision with root package name */
    long f51483f;

    /* renamed from: g  reason: collision with root package name */
    long f51484g;

    /* renamed from: h  reason: collision with root package name */
    long f51485h;

    /* renamed from: i  reason: collision with root package name */
    String f51486i;

    /* renamed from: j  reason: collision with root package name */
    boolean f51487j;

    /* renamed from: k  reason: collision with root package name */
    private final String f51488k;

    /* renamed from: l  reason: collision with root package name */
    private String f51489l;

    /* renamed from: m  reason: collision with root package name */
    private String f51490m;
    private String n;
    private String o;
    private long p;
    private long q;
    private long r;
    private String s;
    private long t;
    private String u;
    private long v;
    private long w;
    private boolean x;
    private long y;
    private boolean z;

    static {
        Covode.recordClassIndex(32197);
    }

    public final List<String> A() {
        this.f51478a.p().c();
        return this.f51479b;
    }

    public final boolean a() {
        this.f51478a.p().c();
        return this.f51487j;
    }

    public final String b() {
        this.f51478a.p().c();
        return this.f51488k;
    }

    public final String c() {
        this.f51478a.p().c();
        return this.f51489l;
    }

    public final String d() {
        this.f51478a.p().c();
        return this.f51490m;
    }

    public final String e() {
        this.f51478a.p().c();
        return this.B;
    }

    public final String f() {
        this.f51478a.p().c();
        return this.E;
    }

    public final String g() {
        this.f51478a.p().c();
        return this.n;
    }

    public final String h() {
        this.f51478a.p().c();
        return this.o;
    }

    public final long i() {
        this.f51478a.p().c();
        return this.q;
    }

    public final long j() {
        this.f51478a.p().c();
        return this.r;
    }

    public final String k() {
        this.f51478a.p().c();
        return this.s;
    }

    public final long l() {
        this.f51478a.p().c();
        return this.t;
    }

    public final String m() {
        this.f51478a.p().c();
        return this.u;
    }

    public final long n() {
        this.f51478a.p().c();
        return this.v;
    }

    public final long o() {
        this.f51478a.p().c();
        return this.w;
    }

    public final long p() {
        this.f51478a.p().c();
        return this.D;
    }

    public final boolean q() {
        this.f51478a.p().c();
        return this.x;
    }

    public final long r() {
        this.f51478a.p().c();
        return this.p;
    }

    public final long s() {
        this.f51478a.p().c();
        return this.F;
    }

    public final long t() {
        this.f51478a.p().c();
        return this.G;
    }

    public final String v() {
        this.f51478a.p().c();
        return this.f51486i;
    }

    public final long w() {
        this.f51478a.p().c();
        return this.y;
    }

    public final boolean x() {
        this.f51478a.p().c();
        return this.z;
    }

    public final boolean y() {
        this.f51478a.p().c();
        return this.A;
    }

    public final Boolean z() {
        this.f51478a.p().c();
        return this.C;
    }

    public final void u() {
        this.f51478a.p().c();
        long j2 = this.p + 1;
        if (j2 > 2147483647L) {
            this.f51478a.q().f51471f.a("Bundle index overflow. appId", eb.a(this.f51488k));
            j2 = 0;
        }
        this.f51487j = true;
        this.p = j2;
    }

    public final void a(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.q != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.q = j2;
    }

    public final void b(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.r != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.r = j2;
    }

    public final void c(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.t != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.t = j2;
    }

    public final void d(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.v != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.v = j2;
    }

    public final void e(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.w != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.w = j2;
    }

    public final void f(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.D != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.D = j2;
    }

    public final void g(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.s, str);
        this.s = str;
    }

    public final void h(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.F != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.F = j2;
    }

    public final void i(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.G != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.G = j2;
    }

    public final void j(long j2) {
        boolean z2;
        this.f51478a.p().c();
        boolean z3 = this.f51487j;
        if (this.y != j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51487j = z3 | z2;
        this.y = j2;
    }

    public final void a(Boolean bool) {
        boolean equals;
        this.f51478a.p().c();
        boolean z2 = this.f51487j;
        Boolean bool2 = this.C;
        if (bool2 != null) {
            equals = bool2.equals(bool);
        } else if (bool == null) {
            equals = true;
        } else {
            equals = false;
        }
        this.f51487j = z2 | (!equals);
        this.C = bool;
    }

    public final void b(String str) {
        this.f51478a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f51487j |= !jz.c(this.f51490m, str);
        this.f51490m = str;
    }

    public final void c(String str) {
        this.f51478a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f51487j |= !jz.c(this.B, str);
        this.B = str;
    }

    public final void d(String str) {
        this.f51478a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f51487j |= !jz.c(this.E, str);
        this.E = str;
    }

    public final void e(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.n, str);
        this.n = str;
    }

    public final void f(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.o, str);
        this.o = str;
    }

    public final void g(long j2) {
        boolean z2;
        boolean z3 = true;
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.b(z2);
        this.f51478a.p().c();
        boolean z4 = this.f51487j;
        if (this.p == j2) {
            z3 = false;
        }
        this.f51487j = z3 | z4;
        this.p = j2;
    }

    public final void h(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.u, str);
        this.u = str;
    }

    public final void i(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.f51486i, str);
        this.f51486i = str;
    }

    public final void a(String str) {
        this.f51478a.p().c();
        this.f51487j |= !jz.c(this.f51489l, str);
        this.f51489l = str;
    }

    public final void b(boolean z2) {
        boolean z3;
        this.f51478a.p().c();
        boolean z4 = this.f51487j;
        if (this.z != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f51487j = z4 | z3;
        this.z = z2;
    }

    public final void c(boolean z2) {
        boolean z3;
        this.f51478a.p().c();
        boolean z4 = this.f51487j;
        if (this.A != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f51487j = z4 | z3;
        this.A = z2;
    }

    public final void a(boolean z2) {
        boolean z3;
        this.f51478a.p().c();
        boolean z4 = this.f51487j;
        if (this.x != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f51487j = z4 | z3;
        this.x = z2;
    }

    ec(ff ffVar, String str) {
        r.a(ffVar);
        r.a(str);
        this.f51478a = ffVar;
        this.f51488k = str;
        ffVar.p().c();
    }
}
