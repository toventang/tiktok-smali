package com.facebook.imagepipeline.e;

import android.net.Uri;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.d.j;
import com.facebook.common.d.k;
import com.facebook.common.h.a;
import com.facebook.d.d;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.n.ak;
import com.facebook.imagepipeline.n.au;
import com.facebook.imagepipeline.n.az;
import com.facebook.imagepipeline.o.b;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

public final class h {

    /* renamed from: g  reason: collision with root package name */
    private static final CancellationException f47835g = new CancellationException("Prefetching is not enabled");

    /* renamed from: a  reason: collision with root package name */
    public final p<e, c> f47836a;

    /* renamed from: b  reason: collision with root package name */
    public final com.facebook.imagepipeline.d.e f47837b;

    /* renamed from: c  reason: collision with root package name */
    public final com.facebook.imagepipeline.d.e f47838c;

    /* renamed from: d  reason: collision with root package name */
    public final f f47839d;

    /* renamed from: e  reason: collision with root package name */
    public final az f47840e;

    /* renamed from: f  reason: collision with root package name */
    public final k<Boolean> f47841f;

    /* renamed from: h  reason: collision with root package name */
    private final n f47842h;

    /* renamed from: i  reason: collision with root package name */
    private final com.facebook.imagepipeline.k.c f47843i;

    /* renamed from: j  reason: collision with root package name */
    private final k<Boolean> f47844j;

    /* renamed from: k  reason: collision with root package name */
    private final p<e, com.facebook.common.g.h> f47845k;

    /* renamed from: l  reason: collision with root package name */
    private final k<Boolean> f47846l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicLong f47847m = new AtomicLong();

    public final com.facebook.d.c<a<c>> a(b bVar, Object obj, b.EnumC1183b bVar2, com.facebook.imagepipeline.k.c cVar) {
        try {
            n nVar = this.f47842h;
            com.facebook.imagepipeline.p.b.a();
            ak<a<c>> c2 = nVar.c(bVar);
            if (bVar.mPostprocessor != null) {
                c2 = nVar.a(c2);
            }
            if (nVar.f47946a) {
                c2 = nVar.c(c2);
            }
            com.facebook.imagepipeline.p.b.a();
            return a(c2, bVar, bVar2, obj, cVar);
        } catch (Exception e2) {
            return d.a(e2);
        }
    }

    public final void a() {
        AnonymousClass3 r1 = new j<e>() {
            /* class com.facebook.imagepipeline.e.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(28979);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.d.j
            public final /* bridge */ /* synthetic */ boolean a(e eVar) {
                return true;
            }
        };
        this.f47836a.a(r1);
        this.f47845k.a(r1);
    }

    public final void a(Uri uri) {
        b fromUri = b.fromUri(uri);
        if (fromUri != null) {
            final Uri parse = Uri.parse(com.facebook.imagepipeline.d.j.a().a(fromUri, null).a());
            AnonymousClass2 r1 = new j<e>() {
                /* class com.facebook.imagepipeline.e.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28978);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.facebook.common.d.j
                public final /* bridge */ /* synthetic */ boolean a(e eVar) {
                    return eVar.a(parse);
                }
            };
            this.f47836a.a(r1);
            this.f47845k.a(r1);
        }
        e a2 = this.f47839d.a(b.fromUri(uri));
        this.f47837b.g(a2);
        this.f47838c.g(a2);
    }

    public final void b() {
        this.f47840e.a();
    }

    public final void c() {
        this.f47840e.b();
    }

    static {
        Covode.recordClassIndex(28976);
    }

    private String e() {
        return String.valueOf(this.f47847m.getAndIncrement());
    }

    public final boolean d() {
        return this.f47840e.c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.e.h$6  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47859a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28982(0x7136, float:4.0612E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.o.b$a[] r0 = com.facebook.imagepipeline.o.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.e.h.AnonymousClass6.f47859a = r2
                com.facebook.imagepipeline.o.b$a r0 = com.facebook.imagepipeline.o.b.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.e.h.AnonymousClass6.f47859a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.o.b$a r0 = com.facebook.imagepipeline.o.b.a.SMALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.e.h.AnonymousClass6.<clinit>():void");
        }
    }

    public final boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return a(b.fromUri(uri));
    }

    public final com.facebook.d.c<Boolean> d(Uri uri) {
        return c(b.fromUri(uri));
    }

    private boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        a<c> a2 = this.f47836a.a(this.f47839d.a(bVar, null));
        try {
            return a.a((a<?>) a2);
        } finally {
            a.c(a2);
        }
    }

    public final boolean c(Uri uri) {
        if (a(uri, b.a.SMALL) || a(uri, b.a.DEFAULT)) {
            return true;
        }
        return false;
    }

    private boolean b(b bVar) {
        e a2 = this.f47839d.a(bVar);
        int i2 = AnonymousClass6.f47859a[bVar.mCacheChoice.ordinal()];
        if (i2 == 1) {
            return this.f47837b.e(a2);
        }
        if (i2 != 2) {
            return false;
        }
        return this.f47838c.e(a2);
    }

    private com.facebook.d.c<Boolean> c(b bVar) {
        final e a2 = this.f47839d.a(bVar);
        final com.facebook.d.h hVar = new com.facebook.d.h();
        this.f47837b.d(a2).b(new g<Boolean, i<Boolean>>() {
            /* class com.facebook.imagepipeline.e.h.AnonymousClass5 */

            static {
                Covode.recordClassIndex(28981);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ i<Boolean> then(i<Boolean> iVar) {
                if (iVar.b() || iVar.c() || !iVar.d().booleanValue()) {
                    return h.this.f47838c.d(a2);
                }
                return i.a((Object) true);
            }
        }).a(new g<Boolean, Void>() {
            /* class com.facebook.imagepipeline.e.h.AnonymousClass4 */

            static {
                Covode.recordClassIndex(28980);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ Void then(i<Boolean> iVar) {
                boolean z;
                com.facebook.d.h hVar = hVar;
                if (iVar.b() || iVar.c() || !iVar.d().booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                hVar.b(Boolean.valueOf(z));
                return null;
            }
        });
        return hVar;
    }

    public final k<com.facebook.d.c<a<c>>> a(b bVar, b.EnumC1183b bVar2) {
        return new k<com.facebook.d.c<a<c>>>(bVar, null, bVar2) {
            /* class com.facebook.imagepipeline.e.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f47848a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f47849b = null;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b.EnumC1183b f47850c;

            static {
                Covode.recordClassIndex(28977);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.d.k
            public final /* synthetic */ com.facebook.d.c<a<c>> b() {
                return h.this.a(this.f47848a, this.f47849b, this.f47850c);
            }

            public final String toString() {
                return com.facebook.common.d.h.a(this).a("uri", this.f47848a.mSourceUri).toString();
            }

            {
                this.f47848a = r3;
                this.f47850c = r5;
            }
        };
    }

    public final com.facebook.d.c<Void> d(b bVar, Object obj) {
        return a(bVar, obj, com.facebook.imagepipeline.common.c.MEDIUM);
    }

    private boolean a(Uri uri, b.a aVar) {
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
        a2.f48450g = aVar;
        return b(a2.a());
    }

    public final com.facebook.d.c<a<com.facebook.common.g.h>> b(b bVar, Object obj) {
        b bVar2 = bVar;
        com.facebook.common.d.i.a(bVar2.mSourceUri);
        try {
            ak<a<com.facebook.common.g.h>> a2 = this.f47842h.a(bVar2);
            if (bVar2.mResizeOptions != null) {
                com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(bVar2);
                a3.f48447d = null;
                bVar2 = a3.a();
            }
            return a(a2, bVar2, b.EnumC1183b.FULL_FETCH, obj, (com.facebook.imagepipeline.k.c) null);
        } catch (Exception e2) {
            return d.a(e2);
        }
    }

    public final com.facebook.d.c<Void> c(b bVar, Object obj) {
        ak<Void> b2;
        if (!this.f47844j.b().booleanValue()) {
            return d.a(f47835g);
        }
        try {
            if (this.f47846l.b().booleanValue()) {
                b2 = this.f47842h.b(bVar);
            } else {
                n nVar = this.f47842h;
                ak<a<c>> c2 = nVar.c(bVar);
                if (nVar.f47946a) {
                    c2 = nVar.c(c2);
                }
                b2 = nVar.b(c2);
            }
            return a(b2, bVar, b.EnumC1183b.FULL_FETCH, obj, com.facebook.imagepipeline.common.c.MEDIUM);
        } catch (Exception e2) {
            return d.a(e2);
        }
    }

    private com.facebook.imagepipeline.k.c a(b bVar, com.facebook.imagepipeline.k.c cVar) {
        if (cVar == null) {
            if (bVar.mRequestListener == null) {
                return this.f47843i;
            }
            return new com.facebook.imagepipeline.k.b(this.f47843i, bVar.mRequestListener);
        } else if (bVar.mRequestListener == null) {
            return new com.facebook.imagepipeline.k.b(this.f47843i, cVar);
        } else {
            return new com.facebook.imagepipeline.k.b(this.f47843i, cVar, bVar.mRequestListener);
        }
    }

    public final com.facebook.d.c<a<c>> a(b bVar, Object obj) {
        return a(bVar, obj, b.EnumC1183b.FULL_FETCH);
    }

    private com.facebook.d.c<Void> a(b bVar, Object obj, com.facebook.imagepipeline.common.c cVar) {
        if (!this.f47844j.b().booleanValue()) {
            return d.a(f47835g);
        }
        try {
            return a(this.f47842h.b(bVar), bVar, b.EnumC1183b.FULL_FETCH, obj, cVar);
        } catch (Exception e2) {
            return d.a(e2);
        }
    }

    public final com.facebook.d.c<a<c>> a(b bVar, Object obj, b.EnumC1183b bVar2) {
        return a(bVar, obj, bVar2, null);
    }

    private com.facebook.d.c<Void> a(ak<Void> akVar, b bVar, b.EnumC1183b bVar2, Object obj, com.facebook.imagepipeline.common.c cVar) {
        com.facebook.imagepipeline.k.c a2 = a(bVar, (com.facebook.imagepipeline.k.c) null);
        try {
            return new com.facebook.imagepipeline.f.e(akVar, new au(bVar, e(), a2, obj, b.EnumC1183b.getMax(bVar.mLowestPermittedRequestLevel, bVar2), true, false, cVar), a2);
        } catch (Exception e2) {
            return d.a(e2);
        }
    }

    private <T> com.facebook.d.c<a<T>> a(ak<a<T>> akVar, b bVar, b.EnumC1183b bVar2, Object obj, com.facebook.imagepipeline.k.c cVar) {
        boolean z;
        com.facebook.imagepipeline.p.b.a();
        com.facebook.imagepipeline.k.c a2 = a(bVar, cVar);
        try {
            b.EnumC1183b max = b.EnumC1183b.getMax(bVar.mLowestPermittedRequestLevel, bVar2);
            String e2 = e();
            if (!bVar.mProgressiveRenderingEnabled) {
                if (com.facebook.common.k.g.b(bVar.mSourceUri)) {
                    z = false;
                    au auVar = new au(bVar, e2, a2, obj, max, false, z, bVar.mRequestPriority);
                    com.facebook.imagepipeline.p.b.a();
                    com.facebook.imagepipeline.f.d dVar = new com.facebook.imagepipeline.f.d(akVar, auVar, a2);
                    com.facebook.imagepipeline.p.b.a();
                    return dVar;
                }
            }
            z = true;
            au auVar2 = new au(bVar, e2, a2, obj, max, false, z, bVar.mRequestPriority);
            com.facebook.imagepipeline.p.b.a();
            com.facebook.imagepipeline.f.d dVar2 = new com.facebook.imagepipeline.f.d(akVar, auVar2, a2);
            com.facebook.imagepipeline.p.b.a();
            return dVar2;
        } catch (Exception e3) {
            return d.a(e3);
        } finally {
            com.facebook.imagepipeline.p.b.a();
        }
    }

    public h(n nVar, Set<com.facebook.imagepipeline.k.c> set, k<Boolean> kVar, p<e, c> pVar, p<e, com.facebook.common.g.h> pVar2, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar, az azVar, k<Boolean> kVar2, k<Boolean> kVar3) {
        this.f47842h = nVar;
        this.f47843i = new com.facebook.imagepipeline.k.b(set);
        this.f47844j = kVar;
        this.f47836a = pVar;
        this.f47845k = pVar2;
        this.f47837b = eVar;
        this.f47838c = eVar2;
        this.f47839d = fVar;
        this.f47840e = azVar;
        this.f47846l = kVar2;
        this.f47841f = kVar3;
    }
}
