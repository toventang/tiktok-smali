package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public abstract class fq {

    /* renamed from: a  reason: collision with root package name */
    int f50866a;

    /* renamed from: b  reason: collision with root package name */
    int f50867b;

    /* renamed from: c  reason: collision with root package name */
    fr f50868c;

    /* renamed from: d  reason: collision with root package name */
    private int f50869d;

    static {
        Covode.recordClassIndex(31794);
    }

    public static long a(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static int e(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract int a();

    public abstract void a(int i2);

    public abstract double b();

    public abstract boolean b(int i2);

    public abstract float c();

    public abstract int c(int i2);

    public abstract long d();

    public abstract void d(int i2);

    public abstract long e();

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract fe l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    /* access modifiers changed from: package-private */
    public abstract long s();

    public abstract boolean t();

    public abstract int u();

    private fq() {
        this.f50867b = 100;
        this.f50869d = Integer.MAX_VALUE;
    }

    /* synthetic */ fq(byte b2) {
        this();
    }

    static fq a(byte[] bArr, int i2) {
        fs fsVar = new fs(bArr, i2, (byte) 0);
        try {
            fsVar.c(i2);
            return fsVar;
        } catch (gu e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
