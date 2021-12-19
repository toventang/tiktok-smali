package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public final class ay<T> implements ak<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ak<T> f48273a;

    /* renamed from: b  reason: collision with root package name */
    public final az f48274b;

    static {
        Covode.recordClassIndex(29134);
    }

    public ay(ak<T> akVar, az azVar) {
        this.f48273a = (ak) i.a(akVar);
        this.f48274b = azVar;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(final k<T> kVar, final al alVar) {
        final an c2 = alVar.c();
        final String b2 = alVar.b();
        final AnonymousClass1 r1 = new av<T>("BackgroundThreadHandoffProducer", c2, b2, kVar) {
            /* class com.facebook.imagepipeline.n.ay.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29135);
            }

            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final void b(T t) {
            }

            @Override // com.facebook.common.b.h
            public final T c() {
                return null;
            }

            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final void a(T t) {
                c2.onProducerFinishWithSuccess(b2, "BackgroundThreadHandoffProducer", null);
                ay.this.f48273a.a(kVar, alVar);
            }
        };
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.ay.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29136);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                r1.a();
                ay.this.f48274b.b(r1);
            }
        });
        this.f48274b.a(r1);
    }
}
