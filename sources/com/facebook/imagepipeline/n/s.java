package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.h;
import com.facebook.h.c;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.p.b;
import java.util.Map;

public final class s implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final p<com.facebook.c.a.e, h> f48383a;

    /* renamed from: b  reason: collision with root package name */
    private final f f48384b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<e> f48385c;

    static {
        Covode.recordClassIndex(29176);
    }

    static class a extends n<e, e> {

        /* renamed from: a  reason: collision with root package name */
        private final p<com.facebook.c.a.e, h> f48386a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.c.a.e f48387b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f48388c;

        static {
            Covode.recordClassIndex(29177);
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            try {
                b.a();
                if (b(i2) || eVar == null || c(i2) || eVar.c() == c.f47633a) {
                    this.f48362e.b(eVar, i2);
                    b.a();
                    return;
                }
                com.facebook.common.h.a<h> b2 = com.facebook.common.h.a.b(eVar.f47989a);
                if (b2 != null) {
                    com.facebook.common.h.a<h> aVar = null;
                    try {
                        if (this.f48388c) {
                            aVar = this.f48386a.a(this.f48387b, b2);
                        }
                        if (aVar != null) {
                            try {
                                e eVar2 = new e(aVar);
                                eVar2.b(eVar);
                                try {
                                    this.f48362e.b(1.0f);
                                    this.f48362e.b(eVar2, i2);
                                    e.d(eVar2);
                                    b.a();
                                    return;
                                } catch (Throwable th) {
                                    e.d(eVar2);
                                    throw th;
                                }
                            } finally {
                                com.facebook.common.h.a.c(aVar);
                            }
                        }
                    } finally {
                        com.facebook.common.h.a.c(b2);
                    }
                }
                this.f48362e.b(eVar, i2);
                b.a();
            } catch (Throwable th2) {
                b.a();
                throw th2;
            }
        }

        public a(k<e> kVar, p<com.facebook.c.a.e, h> pVar, com.facebook.c.a.e eVar, boolean z) {
            super(kVar);
            this.f48386a = pVar;
            this.f48387b = eVar;
            this.f48388c = z;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        Map<String, String> map;
        try {
            b.a();
            String b2 = alVar.b();
            an c2 = alVar.c();
            c2.onProducerStart(b2, "EncodedMemoryCacheProducer");
            com.facebook.imagepipeline.o.b a2 = alVar.a();
            f fVar = this.f48384b;
            alVar.d();
            com.facebook.c.a.e a3 = fVar.a(a2);
            com.facebook.common.h.a<h> a4 = this.f48383a.a(a3);
            Map<String, String> map2 = null;
            if (a4 != null) {
                try {
                    e eVar = new e(a4);
                    try {
                        if (c2.requiresExtraMap(b2)) {
                            map2 = com.facebook.common.d.f.of("cached_value_found", "true");
                        }
                        c2.onProducerFinishWithSuccess(b2, "EncodedMemoryCacheProducer", map2);
                        c2.onUltimateProducerReached(b2, "EncodedMemoryCacheProducer", true);
                        kVar.b(1.0f);
                        kVar.b(eVar, 1);
                        e.d(eVar);
                        com.facebook.common.h.a.c(a4);
                        b.a();
                    } catch (Throwable th) {
                        e.d(eVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    com.facebook.common.h.a.c(a4);
                    throw th2;
                }
            } else if (alVar.e().getValue() >= b.EnumC1183b.ENCODED_MEMORY_CACHE.getValue()) {
                if (c2.requiresExtraMap(b2)) {
                    map = com.facebook.common.d.f.of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c2.onProducerFinishWithSuccess(b2, "EncodedMemoryCacheProducer", map);
                c2.onUltimateProducerReached(b2, "EncodedMemoryCacheProducer", false);
                kVar.b(null, 1);
                com.facebook.common.h.a.c(a4);
                com.facebook.imagepipeline.p.b.a();
            } else {
                a aVar = new a(kVar, this.f48383a, a3, alVar.a().mIsMemoryCacheEnabled);
                if (c2.requiresExtraMap(b2)) {
                    map2 = com.facebook.common.d.f.of("cached_value_found", "false");
                }
                c2.onProducerFinishWithSuccess(b2, "EncodedMemoryCacheProducer", map2);
                this.f48385c.a(aVar, alVar);
                com.facebook.common.h.a.c(a4);
                com.facebook.imagepipeline.p.b.a();
            }
        } catch (Throwable th3) {
            com.facebook.imagepipeline.p.b.a();
            throw th3;
        }
    }

    public s(p<com.facebook.c.a.e, h> pVar, f fVar, ak<e> akVar) {
        this.f48383a = pVar;
        this.f48384b = fVar;
        this.f48385c = akVar;
    }
}
