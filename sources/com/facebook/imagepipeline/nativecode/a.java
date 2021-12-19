package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.q.b;
import com.facebook.imagepipeline.q.c;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final int f48437a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f48438b;

    static {
        Covode.recordClassIndex(29201);
    }

    public a(int i2, boolean z) {
        this.f48437a = i2;
        this.f48438b = z;
    }

    @Override // com.facebook.imagepipeline.q.c
    public final b a(com.facebook.h.c cVar, boolean z) {
        if (cVar != com.facebook.h.b.f47621a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f48437a, this.f48438b);
    }
}
