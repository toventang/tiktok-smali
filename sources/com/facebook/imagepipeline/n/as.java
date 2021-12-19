package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.o.b;

public final class as extends o {
    static {
        Covode.recordClassIndex(29120);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.o
    public final boolean a(al alVar) {
        return alVar.a().isResizedImageDiskCacheActuallyEnabled();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.o
    public final e a(f fVar, al alVar) {
        b a2 = alVar.a();
        alVar.d();
        return fVar.b(a2);
    }

    public as(com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar, ak<com.facebook.imagepipeline.j.e> akVar) {
        super(eVar, eVar2, fVar, akVar);
    }
}
