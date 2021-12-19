package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import com.bytedance.lottie.g.b;
import com.bytedance.lottie.g.c;
import java.util.Collections;

public final class p<K, A> extends a<K, A> {

    /* renamed from: e  reason: collision with root package name */
    private final b<A> f40454e = new b<>();

    static {
        Covode.recordClassIndex(24867);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final float c() {
        return 1.0f;
    }

    @Override // com.bytedance.lottie.a.b.a
    public final void a() {
        if (this.f40419d != null) {
            super.a();
        }
    }

    @Override // com.bytedance.lottie.a.b.a
    public final A d() {
        return (A) this.f40419d.a(0.0f, 0.0f, null, null, this.f40418c, this.f40418c, this.f40418c);
    }

    public p(c<A> cVar) {
        super(Collections.emptyList());
        a(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final A a(a<K> aVar, float f2) {
        return d();
    }
}
