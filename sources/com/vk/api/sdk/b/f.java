package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.d;
import h.f.b.l;

public abstract class f<T> extends b<T> {

    /* renamed from: c  reason: collision with root package name */
    public final int f156259c;

    static {
        Covode.recordClassIndex(103770);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, int i2) {
        super(dVar);
        l.c(dVar, "");
        this.f156259c = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException("retryLimit must be >= 0");
        }
    }
}
