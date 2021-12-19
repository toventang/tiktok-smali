package com.facebook.fresco.animation.d;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.a;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f47576a;

    /* renamed from: b  reason: collision with root package name */
    private long f47577b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f47578c;

    /* renamed from: d  reason: collision with root package name */
    private int f47579d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f47580e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f47581f = -1;

    static {
        Covode.recordClassIndex(28852);
    }

    private boolean b() {
        if (this.f47576a.a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a() {
        long j2 = this.f47577b;
        if (j2 != -1) {
            return j2;
        }
        this.f47577b = 0;
        int e2 = this.f47576a.e();
        for (int i2 = 0; i2 < e2; i2++) {
            this.f47577b += (long) this.f47576a.c(i2);
        }
        return this.f47577b;
    }

    public d(a aVar) {
        this.f47576a = aVar;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (long) this.f47576a.c(i2);
        }
        return j2;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(long j2) {
        if (a() == 0) {
            return -1;
        }
        if (!b() && this.f47578c >= this.f47576a.a()) {
            return -1;
        }
        long c2 = (long) this.f47576a.c(this.f47579d);
        long j3 = this.f47580e + c2;
        if (j3 >= j2) {
            return j3;
        }
        return j2 + c2;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final int a(long j2, long j3) {
        long a2 = a();
        long j4 = 0;
        if (a2 == 0) {
            return -1;
        }
        if (!b() && j2 / a2 >= ((long) this.f47576a.a())) {
            return -1;
        }
        long j5 = j2 % a2;
        int i2 = 0;
        int i3 = 0;
        do {
            j4 += (long) this.f47576a.c(i3);
            i3++;
        } while (j5 >= j4);
        int i4 = i3 - 1;
        int i5 = this.f47579d;
        if (i5 == -1 || j3 != this.f47581f) {
            this.f47580e = j2;
            this.f47581f = j2;
            this.f47579d = i4;
            return i4;
        }
        this.f47581f = j2;
        if (this.f47580e + ((long) this.f47576a.c(i5)) > j2) {
            return this.f47579d;
        }
        this.f47580e = j2;
        int i6 = this.f47579d + 1;
        if (i6 >= this.f47576a.e()) {
            this.f47578c++;
        } else {
            i2 = i6;
        }
        if (!this.f47576a.b(i2)) {
            return this.f47579d;
        }
        this.f47579d = i2;
        return i2;
    }
}
