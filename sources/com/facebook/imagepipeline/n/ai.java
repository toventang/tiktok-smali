package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.o.d;
import java.util.Map;

public final class ai implements ak<com.facebook.common.h.a<c>> {

    /* renamed from: a  reason: collision with root package name */
    private final p<e, c> f48174a;

    /* renamed from: b  reason: collision with root package name */
    private final f f48175b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<com.facebook.common.h.a<c>> f48176c;

    static {
        Covode.recordClassIndex(29099);
    }

    public static class a extends n<com.facebook.common.h.a<c>, com.facebook.common.h.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        private final e f48177a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f48178b;

        /* renamed from: c  reason: collision with root package name */
        private final p<e, c> f48179c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f48180d;

        static {
            Covode.recordClassIndex(29100);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.facebook.imagepipeline.d.p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            com.facebook.common.h.a aVar = (com.facebook.common.h.a) obj;
            com.facebook.common.h.a aVar2 = null;
            if (aVar == null) {
                if (a(i2)) {
                    this.f48362e.b(aVar2, i2);
                }
            } else if (!b(i2) || this.f48178b) {
                if (this.f48180d) {
                    aVar2 = this.f48179c.a(this.f48177a, aVar);
                }
                try {
                    this.f48362e.b(1.0f);
                    k<O> kVar = this.f48362e;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    kVar.b(aVar, i2);
                } finally {
                    com.facebook.common.h.a.c(aVar2);
                }
            }
        }

        public a(k<com.facebook.common.h.a<c>> kVar, e eVar, boolean z, p<e, c> pVar, boolean z2) {
            super(kVar);
            this.f48177a = eVar;
            this.f48178b = z;
            this.f48179c = pVar;
            this.f48180d = z2;
        }
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<com.facebook.common.h.a<c>> kVar, al alVar) {
        an c2 = alVar.c();
        String b2 = alVar.b();
        b a2 = alVar.a();
        Object d2 = alVar.d();
        d dVar = a2.mPostprocessor;
        if (dVar == null || dVar.getPostprocessorCacheKey() == null) {
            this.f48176c.a(kVar, alVar);
            return;
        }
        c2.onProducerStart(b2, "PostprocessedBitmapMemoryCacheProducer");
        e b3 = this.f48175b.b(a2, d2);
        com.facebook.common.h.a<c> a3 = this.f48174a.a(b3);
        Map<String, String> map = null;
        if (a3 != null) {
            if (c2.requiresExtraMap(b2)) {
                map = com.facebook.common.d.f.of("cached_value_found", "true");
            }
            c2.onProducerFinishWithSuccess(b2, "PostprocessedBitmapMemoryCacheProducer", map);
            c2.onUltimateProducerReached(b2, "PostprocessedBitmapMemoryCacheProducer", true);
            kVar.b(1.0f);
            kVar.b(a3, 1);
            a3.close();
            return;
        }
        a aVar = new a(kVar, b3, dVar instanceof com.facebook.imagepipeline.o.e, this.f48174a, alVar.a().mIsMemoryCacheEnabled);
        if (c2.requiresExtraMap(b2)) {
            map = com.facebook.common.d.f.of("cached_value_found", "false");
        }
        c2.onProducerFinishWithSuccess(b2, "PostprocessedBitmapMemoryCacheProducer", map);
        this.f48176c.a(aVar, alVar);
    }

    public ai(p<e, c> pVar, f fVar, ak<com.facebook.common.h.a<c>> akVar) {
        this.f48174a = pVar;
        this.f48175b = fVar;
        this.f48176c = akVar;
    }
}
