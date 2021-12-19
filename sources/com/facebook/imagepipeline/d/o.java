package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.j;
import com.facebook.common.h.a;

public final class o<K, V> implements p<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final p<K, V> f47815a;

    /* renamed from: b  reason: collision with root package name */
    private final r f47816b;

    static {
        Covode.recordClassIndex(28959);
    }

    @Override // com.facebook.imagepipeline.d.p
    public final int a(j<K> jVar) {
        return this.f47815a.a((j) jVar);
    }

    @Override // com.facebook.imagepipeline.d.p
    public final a<V> a(K k2) {
        a<V> a2 = this.f47815a.a((Object) k2);
        if (a2 == null) {
            this.f47816b.a();
        } else {
            this.f47816b.b();
        }
        return a2;
    }

    public o(p<K, V> pVar, r rVar) {
        this.f47815a = pVar;
        this.f47816b = rVar;
    }

    @Override // com.facebook.imagepipeline.d.p
    public final a<V> a(K k2, a<V> aVar) {
        return this.f47815a.a(k2, aVar);
    }
}
