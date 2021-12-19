package com.facebook.fresco.animation.d;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.d;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final d f47574a;

    /* renamed from: b  reason: collision with root package name */
    private long f47575b = -1;

    static {
        Covode.recordClassIndex(28849);
    }

    private boolean b() {
        if (this.f47574a.a() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a() {
        long j2 = this.f47575b;
        if (j2 != -1) {
            return j2;
        }
        this.f47575b = 0;
        int e2 = this.f47574a.e();
        for (int i2 = 0; i2 < e2; i2++) {
            this.f47575b += (long) this.f47574a.c(i2);
        }
        return this.f47575b;
    }

    public a(d dVar) {
        this.f47574a = dVar;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (long) this.f47574a.c(i2);
        }
        return j2;
    }

    @Override // com.facebook.fresco.animation.d.b
    public final long a(long j2) {
        long a2 = a();
        long j3 = 0;
        if (a2 == 0) {
            return -1;
        }
        if (!b() && j2 / a() >= ((long) this.f47574a.a())) {
            return -1;
        }
        long j4 = j2 % a2;
        int e2 = this.f47574a.e();
        for (int i2 = 0; i2 < e2 && j3 <= j4; i2++) {
            j3 += (long) this.f47574a.c(i2);
        }
        return j2 + (j3 - j4);
    }

    @Override // com.facebook.fresco.animation.d.b
    public final int a(long j2, long j3) {
        if (!b() && j2 / a() >= ((long) this.f47574a.a())) {
            return -1;
        }
        long a2 = j2 % a();
        int i2 = 0;
        long j4 = 0;
        do {
            j4 += (long) this.f47574a.c(i2);
            i2++;
        } while (a2 >= j4);
        return i2 - 1;
    }
}
