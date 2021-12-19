package com.facebook.imagepipeline.q;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final int f48467a;

    static {
        Covode.recordClassIndex(29224);
    }

    public g(int i2) {
        this.f48467a = i2;
    }

    @Override // com.facebook.imagepipeline.q.c
    public final b a(c cVar, boolean z) {
        return new f(z, this.f48467a);
    }
}
