package com.facebook.imagepipeline.n;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class o implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    public final ak<e> f48363a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48364b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48365c;

    /* renamed from: d  reason: collision with root package name */
    private final f f48366d;

    static {
        Covode.recordClassIndex(29169);
    }

    /* access modifiers changed from: protected */
    public boolean a(al alVar) {
        return alVar.a().mIsDiskCacheEnabled;
    }

    /* access modifiers changed from: protected */
    public com.facebook.c.a.e a(f fVar, al alVar) {
        b a2 = alVar.a();
        alVar.d();
        return fVar.a(a2);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public void a(final k<e> kVar, final al alVar) {
        com.facebook.imagepipeline.d.e eVar;
        b a2 = alVar.a();
        if (a(alVar)) {
            alVar.c().onProducerStart(alVar.b(), "DiskCacheProducer");
            com.facebook.c.a.e a3 = a(this.f48366d, alVar);
            if (a2.mCacheChoice == b.a.SMALL) {
                eVar = this.f48365c;
            } else {
                eVar = this.f48364b;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            i<e> a4 = eVar.a(a3, atomicBoolean);
            final String b2 = alVar.b();
            final an c2 = alVar.c();
            a4.a(new g<e, Void>() {
                /* class com.facebook.imagepipeline.n.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29170);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ Void then(i<e> iVar) {
                    boolean z;
                    if (iVar.b() || (iVar.c() && (iVar.e() instanceof CancellationException))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c2.onProducerFinishWithCancellation(b2, "DiskCacheProducer", null);
                        kVar.b();
                    } else if (iVar.c()) {
                        c2.onProducerFinishWithFailure(b2, "DiskCacheProducer", iVar.e(), null);
                        o.this.f48363a.a(kVar, alVar);
                    } else {
                        e d2 = iVar.d();
                        if (d2 != null) {
                            an anVar = c2;
                            String str = b2;
                            anVar.onProducerFinishWithSuccess(str, "DiskCacheProducer", o.a(anVar, str, true, d2.h()));
                            c2.onUltimateProducerReached(b2, "DiskCacheProducer", true);
                            kVar.b(1.0f);
                            kVar.b(d2, 1);
                            d2.close();
                        } else {
                            an anVar2 = c2;
                            String str2 = b2;
                            anVar2.onProducerFinishWithSuccess(str2, "DiskCacheProducer", o.a(anVar2, str2, false, 0));
                            o.this.f48363a.a(kVar, alVar);
                        }
                    }
                    return null;
                }
            });
            alVar.a(new e() {
                /* class com.facebook.imagepipeline.n.o.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29171);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    atomicBoolean.set(true);
                }
            });
        } else if (alVar.e().getValue() >= b.EnumC1183b.DISK_CACHE.getValue()) {
            kVar.b(null, 1);
        } else {
            this.f48363a.a(kVar, alVar);
        }
    }

    public o(com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar, ak<e> akVar) {
        this.f48364b = eVar;
        this.f48365c = eVar2;
        this.f48366d = fVar;
        this.f48363a = akVar;
    }

    static Map<String, String> a(an anVar, String str, boolean z, int i2) {
        if (!anVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.d.f.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i2));
        }
        return com.facebook.common.d.f.of("cached_value_found", String.valueOf(z));
    }
}
