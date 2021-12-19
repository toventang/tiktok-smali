package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;

public abstract class n<I, O> extends b<I> {

    /* renamed from: e  reason: collision with root package name */
    public final k<O> f48362e;

    static {
        Covode.recordClassIndex(29168);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.b
    public void a() {
        this.f48362e.b();
    }

    public n(k<O> kVar) {
        this.f48362e = kVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.b
    public void a(float f2) {
        this.f48362e.b(f2);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.b
    public void a(Throwable th) {
        this.f48362e.b(th);
    }
}
