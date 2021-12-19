package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.a;
import com.facebook.fresco.animation.d.b;

final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    final a f39974a;

    /* renamed from: b  reason: collision with root package name */
    public int f39975b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f39976c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f39977d;

    /* renamed from: e  reason: collision with root package name */
    private long f39978e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f39979f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int[] f39980g;

    static {
        Covode.recordClassIndex(24644);
    }

    private boolean b() {
        if (this.f39974a.a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a() {
        long j2 = this.f39976c;
        if (j2 != -1) {
            return j2;
        }
        this.f39976c = 0;
        int length = this.f39980g.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f39976c += (long) b(this.f39980g[i2]);
        }
        return this.f39976c;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (long) b(i2);
        }
        return j2;
    }

    private int b(int i2) {
        if (i2 >= this.f39974a.e()) {
            return this.f39974a.c(0);
        }
        return this.f39974a.c(i2);
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(long j2) {
        if (a() == 0) {
            return -1;
        }
        if (!b() && this.f39977d >= this.f39974a.a()) {
            return -1;
        }
        long b2 = (long) b(this.f39980g[this.f39975b]);
        long j3 = this.f39978e + b2;
        if (j3 >= j2) {
            return j3;
        }
        return j2 + b2;
    }

    public f(a aVar, int[] iArr) {
        this.f39974a = aVar;
        this.f39980g = iArr;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final int a(long j2, long j3) {
        if (!b() && j2 / a() >= ((long) this.f39974a.a())) {
            return -1;
        }
        long a2 = j2 % a();
        long j4 = 0;
        int i2 = 0;
        int i3 = 0;
        do {
            j4 += (long) b(this.f39980g[i3]);
            i3++;
        } while (a2 >= j4);
        int i4 = i3 - 1;
        int i5 = this.f39975b;
        if (i5 == -1 || j3 != this.f39979f) {
            this.f39978e = j2;
            this.f39979f = j2;
            this.f39975b = i4;
            return this.f39980g[i4];
        }
        this.f39979f = j2;
        if (this.f39978e + ((long) b(this.f39980g[i5])) > j2) {
            return this.f39980g[this.f39975b];
        }
        this.f39978e = j2;
        int i6 = this.f39975b + 1;
        int[] iArr = this.f39980g;
        if (i6 >= iArr.length) {
            this.f39977d++;
        } else {
            i2 = i6;
        }
        if (!this.f39974a.b(iArr[i2])) {
            return this.f39980g[this.f39975b];
        }
        this.f39975b = i2;
        return this.f39980g[i2];
    }
}
