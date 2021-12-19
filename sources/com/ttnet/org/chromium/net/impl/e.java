package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.t;
import java.util.Date;

public final class e extends t.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155674a = true;

    /* renamed from: b  reason: collision with root package name */
    private final long f155675b;

    /* renamed from: c  reason: collision with root package name */
    private final long f155676c;

    /* renamed from: d  reason: collision with root package name */
    private final long f155677d;

    /* renamed from: e  reason: collision with root package name */
    private final long f155678e;

    /* renamed from: f  reason: collision with root package name */
    private final long f155679f;

    /* renamed from: g  reason: collision with root package name */
    private final long f155680g;

    /* renamed from: h  reason: collision with root package name */
    private final long f155681h;

    /* renamed from: i  reason: collision with root package name */
    private final long f155682i;

    /* renamed from: j  reason: collision with root package name */
    private final long f155683j;

    /* renamed from: k  reason: collision with root package name */
    private final long f155684k;

    /* renamed from: l  reason: collision with root package name */
    private final long f155685l;

    /* renamed from: m  reason: collision with root package name */
    private final long f155686m;
    private final long n;
    private final boolean o;
    private final long p;
    private final Long q;
    private final Long r;
    private final Long s;
    private final Long t;
    private final String u;
    private final Long v;
    private final Long w;
    private final String x;
    private final String y;

    private static boolean a(long j2, long j3) {
        return (j3 >= j2 && j2 != -1) || j3 == -1;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final boolean n() {
        return this.o;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long o() {
        return this.q;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long p() {
        return this.r;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long q() {
        return this.s;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long r() {
        return this.t;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final String t() {
        return this.u;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long u() {
        return this.v;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Long v() {
        return this.w;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final String w() {
        return this.x;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final String x() {
        return this.y;
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date a() {
        return a(this.f155675b);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date b() {
        return a(this.f155676c);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date c() {
        return a(this.f155677d);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date d() {
        return a(this.f155678e);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date e() {
        return a(this.f155679f);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date f() {
        return a(this.f155680g);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date g() {
        return a(this.f155681h);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date h() {
        return a(this.f155682i);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date i() {
        return a(this.f155683j);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date j() {
        return a(this.f155684k);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date k() {
        return a(this.f155685l);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date l() {
        return a(this.f155686m);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date m() {
        return a(this.n);
    }

    @Override // com.ttnet.org.chromium.net.t.b
    public final Date s() {
        return a(this.p);
    }

    static {
        Covode.recordClassIndex(103492);
    }

    private static Date a(long j2) {
        if (j2 != -1) {
            return new Date(j2);
        }
        return null;
    }

    public e(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, long j15, long j16, long j17, String str, long j18, long j19, String str2, String str3) {
        if (!f155674a) {
            if (!a(j3, j4)) {
                throw new AssertionError();
            } else if (!a(j5, j6)) {
                throw new AssertionError();
            } else if (!a(j7, j8)) {
                throw new AssertionError();
            } else if (!a(j9, j10)) {
                throw new AssertionError();
            } else if (!a(j11, j12)) {
                throw new AssertionError();
            } else if (j14 < j13) {
                throw new AssertionError();
            }
        }
        this.f155675b = j2;
        this.f155676c = j3;
        this.f155677d = j4;
        this.f155678e = j5;
        this.f155679f = j6;
        this.f155680g = j7;
        this.f155681h = j8;
        this.f155682i = j9;
        this.f155683j = j10;
        this.f155684k = j11;
        this.f155685l = j12;
        this.f155686m = j13;
        this.n = j14;
        this.o = z;
        this.p = j17;
        this.s = Long.valueOf(j15);
        this.t = Long.valueOf(j16);
        this.u = str;
        this.v = Long.valueOf(j18);
        this.w = Long.valueOf(j19);
        if (j10 == -1 || j13 == -1) {
            this.q = null;
        } else {
            this.q = Long.valueOf(j13 - j10);
        }
        if (j2 == -1 || j14 == -1) {
            this.r = null;
        } else {
            this.r = Long.valueOf(j14 - j2);
        }
        this.x = str2;
        this.y = str3;
    }
}
