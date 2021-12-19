package com.facebook.imagepipeline.n;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.c.b.k;
import com.facebook.c.b.m;
import com.facebook.imagepipeline.d.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.o.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ax extends o {

    /* renamed from: b  reason: collision with root package name */
    public final e f48250b;

    /* renamed from: c  reason: collision with root package name */
    public final e f48251c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48252d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48253e;

    /* renamed from: f  reason: collision with root package name */
    private final f f48254f;

    /* renamed from: g  reason: collision with root package name */
    private final ak<com.facebook.imagepipeline.j.e> f48255g;

    static {
        Covode.recordClassIndex(29129);
    }

    public static boolean a(i<?> iVar) {
        if (iVar.b()) {
            return true;
        }
        if (!iVar.c() || !(iVar.e() instanceof CancellationException)) {
            return false;
        }
        return true;
    }

    public class a extends n<com.facebook.imagepipeline.j.e, com.facebook.imagepipeline.j.e> {

        /* renamed from: a  reason: collision with root package name */
        public com.facebook.imagepipeline.j.e f48269a;

        /* renamed from: c  reason: collision with root package name */
        private final e f48271c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.c.a.e f48272d;

        static {
            Covode.recordClassIndex(29133);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            com.facebook.imagepipeline.j.e eVar = (com.facebook.imagepipeline.j.e) obj;
            if (eVar != null && a(i2) && !(eVar instanceof m)) {
                if (ax.this.f48252d) {
                    int h2 = eVar.h();
                    if (h2 <= 0 || h2 >= ax.this.f48253e) {
                        ax.this.f48250b.a(this.f48272d, eVar);
                    } else {
                        ax.this.f48251c.a(this.f48272d, eVar);
                    }
                } else {
                    this.f48271c.a(this.f48272d, eVar);
                }
            }
            this.f48362e.b(eVar, i2);
        }

        private a(k<com.facebook.imagepipeline.j.e> kVar, e eVar, com.facebook.c.a.e eVar2, com.facebook.imagepipeline.j.e eVar3) {
            super(kVar);
            this.f48271c = eVar;
            this.f48272d = eVar2;
            this.f48269a = eVar3;
        }

        /* synthetic */ a(ax axVar, k kVar, e eVar, com.facebook.c.a.e eVar2, com.facebook.imagepipeline.j.e eVar3, byte b2) {
            this(kVar, eVar, eVar2, eVar3);
        }
    }

    @Override // com.facebook.imagepipeline.n.o, com.facebook.imagepipeline.n.ak
    public final void a(final k<com.facebook.imagepipeline.j.e> kVar, final al alVar) {
        final e eVar;
        i<com.facebook.imagepipeline.j.e> a2;
        final e eVar2;
        e eVar3;
        i<com.facebook.imagepipeline.j.e> a3;
        b a4 = alVar.a();
        if (!a4.mIsDiskCacheEnabled) {
            a(kVar, kVar, alVar);
            return;
        }
        alVar.c().onProducerStart(alVar.b(), "DiskCacheProducer");
        f fVar = this.f48254f;
        alVar.d();
        final com.facebook.c.a.e a5 = fVar.a(a4);
        if (a4.mCacheChoice == b.a.SMALL) {
            eVar = this.f48251c;
        } else {
            eVar = this.f48250b;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.f48252d) {
            boolean c2 = this.f48251c.c(a5);
            boolean c3 = this.f48250b.c(a5);
            if (c2 || !c3) {
                eVar3 = this.f48251c;
                eVar2 = this.f48250b;
            } else {
                eVar3 = this.f48250b;
                eVar2 = this.f48251c;
            }
            if (eVar3 instanceof k) {
                a3 = ((k) eVar3).b(a5, atomicBoolean);
            } else {
                a3 = eVar3.a(a5, atomicBoolean);
            }
            a2 = a3.b(new g<com.facebook.imagepipeline.j.e, i<com.facebook.imagepipeline.j.e>>() {
                /* class com.facebook.imagepipeline.n.ax.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29130);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ i<com.facebook.imagepipeline.j.e> then(i<com.facebook.imagepipeline.j.e> iVar) {
                    if (ax.a(iVar)) {
                        return iVar;
                    }
                    if (!iVar.c() && iVar.d() != null) {
                        return iVar;
                    }
                    e eVar = eVar2;
                    if (eVar instanceof k) {
                        return ((k) eVar).b(a5, atomicBoolean);
                    }
                    return eVar.a(a5, atomicBoolean);
                }
            });
        } else if (eVar instanceof k) {
            a2 = ((k) eVar).b(a5, atomicBoolean);
        } else {
            a2 = eVar.a(a5, atomicBoolean);
        }
        final String b2 = alVar.b();
        final an c4 = alVar.c();
        a2.a(new g<com.facebook.imagepipeline.j.e, Void>() {
            /* class com.facebook.imagepipeline.n.ax.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29131);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ Void then(i<com.facebook.imagepipeline.j.e> iVar) {
                if (ax.a(iVar)) {
                    c4.onProducerFinishWithCancellation(b2, "DiskCacheProducer", null);
                    kVar.b();
                } else if (iVar.c()) {
                    c4.onProducerFinishWithFailure(b2, "DiskCacheProducer", iVar.e(), null);
                    ax.this.a(kVar, new a(ax.this, kVar, eVar, a5, null, (byte) 0), alVar);
                } else {
                    com.facebook.imagepipeline.j.e d2 = iVar.d();
                    if (d2 == null || (d2 instanceof m)) {
                        an anVar = c4;
                        String str = b2;
                        anVar.onProducerFinishWithSuccess(str, "DiskCacheProducer", o.a(anVar, str, false, d2.h()));
                        ax.this.a(kVar, new a(ax.this, kVar, eVar, a5, d2, (byte) 0), alVar);
                    } else {
                        an anVar2 = c4;
                        String str2 = b2;
                        anVar2.onProducerFinishWithSuccess(str2, "DiskCacheProducer", o.a(anVar2, str2, true, d2.h()));
                        kVar.b(1.0f);
                        kVar.b(d2, 1);
                        d2.close();
                    }
                }
                return null;
            }
        });
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.ax.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29132);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                atomicBoolean.set(true);
            }
        });
    }

    public final void a(k<com.facebook.imagepipeline.j.e> kVar, k<com.facebook.imagepipeline.j.e> kVar2, al alVar) {
        if (alVar.e().getValue() >= b.EnumC1183b.DISK_CACHE.getValue()) {
            kVar.b(null, 1);
        } else {
            this.f48255g.a(kVar2, alVar);
        }
    }
}
