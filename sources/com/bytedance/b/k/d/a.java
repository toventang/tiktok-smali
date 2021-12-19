package com.bytedance.b.k.d;

import com.bytedance.covode.number.Covode;

public abstract class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f26319e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26320f;

    /* renamed from: g  reason: collision with root package name */
    public long f26321g;

    static {
        Covode.recordClassIndex(15288);
    }

    public a() {
        this(0);
    }

    public a(long j2) {
        this(j2, 0);
    }

    public a(long j2, long j3) {
        this.f26319e = j2;
        this.f26321g = j3;
        if (j3 > 0) {
            this.f26320f = true;
        }
    }
}
