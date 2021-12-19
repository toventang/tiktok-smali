package com.vk.api.sdk.internal;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.d;
import h.f.b.l;

public abstract class a<Response> {
    static {
        Covode.recordClassIndex(103827);
    }

    /* access modifiers changed from: protected */
    public abstract Response b(d dVar);

    public final Response a(d dVar) {
        l.c(dVar, "");
        return b(dVar);
    }
}
