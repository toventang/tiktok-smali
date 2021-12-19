package com.facebook.drawee.a.a.b.a;

import com.bytedance.covode.number.Covode;
import com.facebook.common.time.b;
import com.facebook.drawee.a.a.b.h;
import com.facebook.imagepipeline.k.a;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final b f47220a;

    /* renamed from: b  reason: collision with root package name */
    private final h f47221b;

    static {
        Covode.recordClassIndex(28725);
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public final void onRequestCancellation(String str) {
        this.f47221b.f47258l = this.f47220a.now();
        this.f47221b.f47248b = str;
    }

    public c(b bVar, h hVar) {
        this.f47220a = bVar;
        this.f47221b = hVar;
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public final void onRequestSuccess(com.facebook.imagepipeline.o.b bVar, String str, boolean z) {
        this.f47221b.f47258l = this.f47220a.now();
        this.f47221b.f47249c = bVar;
        this.f47221b.f47248b = str;
        this.f47221b.n = z;
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public final void onRequestFailure(com.facebook.imagepipeline.o.b bVar, String str, Throwable th, boolean z) {
        this.f47221b.f47258l = this.f47220a.now();
        this.f47221b.f47249c = bVar;
        this.f47221b.f47248b = str;
        this.f47221b.n = z;
    }

    @Override // com.facebook.imagepipeline.k.a, com.facebook.imagepipeline.k.c
    public final void onRequestStart(com.facebook.imagepipeline.o.b bVar, Object obj, String str, boolean z) {
        this.f47221b.f47257k = this.f47220a.now();
        this.f47221b.f47249c = bVar;
        this.f47221b.f47250d = obj;
        this.f47221b.f47248b = str;
        this.f47221b.n = z;
    }
}
