package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.p.b;
import java.util.Map;

public class h implements ak<a<c>> {

    /* renamed from: a  reason: collision with root package name */
    public final p<e, c> f48318a;

    /* renamed from: b  reason: collision with root package name */
    private final f f48319b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<a<c>> f48320c;

    static {
        Covode.recordClassIndex(29154);
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "BitmapMemoryCacheProducer";
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<a<c>> kVar, al alVar) {
        Map<String, String> map;
        int i2;
        Map<String, String> map2;
        try {
            b.a();
            an c2 = alVar.c();
            String b2 = alVar.b();
            c2.onProducerStart(b2, a());
            e a2 = this.f48319b.a(alVar.a(), alVar.d());
            a<c> a3 = this.f48318a.a(a2);
            Map<String, String> map3 = null;
            if (a3 != null) {
                boolean c3 = a3.a().e().c();
                if (c3) {
                    String a4 = a();
                    if (c2.requiresExtraMap(b2)) {
                        map2 = com.facebook.common.d.f.of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    c2.onProducerFinishWithSuccess(b2, a4, map2);
                    c2.onUltimateProducerReached(b2, a(), true);
                    kVar.b(1.0f);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                kVar.b(a3, i2);
                a3.close();
                if (c3) {
                    b.a();
                    return;
                }
            }
            if (alVar.e().getValue() >= b.EnumC1183b.BITMAP_MEMORY_CACHE.getValue()) {
                String a5 = a();
                if (c2.requiresExtraMap(b2)) {
                    map = com.facebook.common.d.f.of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c2.onProducerFinishWithSuccess(b2, a5, map);
                c2.onUltimateProducerReached(b2, a(), false);
                kVar.b(null, 1);
                com.facebook.imagepipeline.p.b.a();
                return;
            }
            k<a<c>> a6 = a(kVar, a2, alVar.a().mIsMemoryCacheEnabled);
            String a7 = a();
            if (c2.requiresExtraMap(b2)) {
                map3 = com.facebook.common.d.f.of("cached_value_found", "false");
            }
            c2.onProducerFinishWithSuccess(b2, a7, map3);
            com.facebook.imagepipeline.p.b.a();
            this.f48320c.a(a6, alVar);
            com.facebook.imagepipeline.p.b.a();
            com.facebook.imagepipeline.p.b.a();
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public k<a<c>> a(k<a<c>> kVar, final e eVar, final boolean z) {
        return new n<a<c>, a<c>>(kVar) {
            /* class com.facebook.imagepipeline.n.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29155);
            }

            /* JADX INFO: finally extract failed */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.facebook.imagepipeline.d.p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.imagepipeline.n.b
            public final /* synthetic */ void a(Object obj, int i2) {
                a<c> a2;
                a aVar = (a) obj;
                try {
                    com.facebook.imagepipeline.p.b.a();
                    boolean a3 = a(i2);
                    a aVar2 = null;
                    if (aVar == null) {
                        if (a3) {
                            this.f48362e.b(null, i2);
                        }
                        com.facebook.imagepipeline.p.b.a();
                    } else if (((c) aVar.a()).c() || a(i2, 8)) {
                        this.f48362e.b(aVar, i2);
                        com.facebook.imagepipeline.p.b.a();
                    } else {
                        if (!a3 && (a2 = h.this.f48318a.a(eVar)) != null) {
                            try {
                                com.facebook.imagepipeline.j.h e2 = ((c) aVar.a()).e();
                                com.facebook.imagepipeline.j.h e3 = a2.a().e();
                                if (e3.c() || e3.a() >= e2.a()) {
                                    this.f48362e.b(a2, i2);
                                    a.c(a2);
                                    com.facebook.imagepipeline.p.b.a();
                                    return;
                                }
                                a.c(a2);
                            } catch (Throwable th) {
                                a.c(a2);
                                throw th;
                            }
                        }
                        if (z) {
                            aVar2 = h.this.f48318a.a(eVar, aVar);
                        }
                        if (a3) {
                            try {
                                this.f48362e.b(1.0f);
                            } catch (Throwable th2) {
                                a.c(aVar2);
                                throw th2;
                            }
                        }
                        k<O> kVar = this.f48362e;
                        if (aVar2 != null) {
                            aVar = aVar2;
                        }
                        kVar.b(aVar, i2);
                        a.c(aVar2);
                        com.facebook.imagepipeline.p.b.a();
                    }
                } catch (Throwable th3) {
                    com.facebook.imagepipeline.p.b.a();
                    throw th3;
                }
            }
        };
    }

    public h(p<e, c> pVar, f fVar, ak<a<c>> akVar) {
        this.f48318a = pVar;
        this.f48319b = fVar;
        this.f48320c = akVar;
    }
}
