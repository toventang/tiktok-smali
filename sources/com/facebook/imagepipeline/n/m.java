package com.facebook.imagepipeline.n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.f;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.g.e;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.g;
import com.facebook.imagepipeline.j.h;
import com.facebook.imagepipeline.n.v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class m implements ak<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f48334a;

    /* renamed from: b  reason: collision with root package name */
    public final com.facebook.imagepipeline.g.c f48335b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f48336c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48337d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.common.g.a f48338e;

    /* renamed from: f  reason: collision with root package name */
    private final e f48339f;

    /* renamed from: g  reason: collision with root package name */
    private final ak<com.facebook.imagepipeline.j.e> f48340g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f48341h;

    /* renamed from: i  reason: collision with root package name */
    private final int f48342i;

    static {
        Covode.recordClassIndex(29162);
    }

    class a extends c {
        static {
            Covode.recordClassIndex(29163);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final h c() {
            return g.a(0, false, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final int a(com.facebook.imagepipeline.j.e eVar) {
            return eVar.h();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final synchronized boolean a(com.facebook.imagepipeline.j.e eVar, int i2) {
            MethodCollector.i(14123);
            if (b(i2)) {
                MethodCollector.o(14123);
                return false;
            }
            boolean a2 = super.a(eVar, i2);
            MethodCollector.o(14123);
            return a2;
        }

        public a(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, al alVar, boolean z, int i2) {
            super(kVar, alVar, z, i2);
        }
    }

    abstract class c extends n<com.facebook.imagepipeline.j.e, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

        /* renamed from: a  reason: collision with root package name */
        private final String f48348a = "ProgressiveDecoder";

        /* renamed from: b  reason: collision with root package name */
        public final al f48349b;

        /* renamed from: c  reason: collision with root package name */
        public final v f48350c;

        /* renamed from: f  reason: collision with root package name */
        private final an f48352f;

        /* renamed from: g  reason: collision with root package name */
        private final com.facebook.imagepipeline.common.b f48353g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f48354h;

        static {
            Covode.recordClassIndex(29165);
        }

        /* access modifiers changed from: protected */
        public abstract int a(com.facebook.imagepipeline.j.e eVar);

        /* access modifiers changed from: protected */
        public abstract h c();

        private synchronized boolean e() {
            return this.f48354h;
        }

        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a() {
            d();
        }

        public final void d() {
            a(true);
            this.f48362e.b();
        }

        private void c(Throwable th) {
            a(true);
            this.f48362e.b(th);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(float f2) {
            super.a(f2 * 0.99f);
        }

        private void a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f48354h) {
                        this.f48362e.b(1.0f);
                        this.f48354h = true;
                        this.f48350c.a();
                    }
                }
            }
        }

        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            c(th);
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            com.facebook.imagepipeline.j.e eVar = (com.facebook.imagepipeline.j.e) obj;
            try {
                com.facebook.imagepipeline.p.b.a();
                boolean a2 = a(i2);
                if (a2 && !com.facebook.imagepipeline.j.e.e(eVar)) {
                    c(new com.facebook.common.k.a("Encoded image is not valid."));
                    com.facebook.imagepipeline.p.b.a();
                } else if (!a(eVar, i2)) {
                    com.facebook.imagepipeline.p.b.a();
                } else {
                    boolean a3 = a(i2, 4);
                    if (a2 || a3 || this.f48349b.h()) {
                        this.f48350c.b();
                    }
                    com.facebook.imagepipeline.p.b.a();
                }
            } catch (Throwable th) {
                com.facebook.imagepipeline.p.b.a();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(com.facebook.imagepipeline.j.e eVar, int i2) {
            return this.f48350c.a(eVar, i2);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3 A[Catch:{ all -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd A[Catch:{ Exception -> 0x012d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.facebook.imagepipeline.j.e r22, int r23) {
            /*
            // Method dump skipped, instructions count: 379
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.m.c.b(com.facebook.imagepipeline.j.e, int):void");
        }

        public c(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, final al alVar, final boolean z, final int i2) {
            super(kVar);
            this.f48349b = alVar;
            this.f48352f = alVar.c();
            com.facebook.imagepipeline.common.b bVar = alVar.a().mImageDecodeOptions;
            this.f48353g = bVar;
            this.f48354h = false;
            this.f48350c = new v(m.this.f48334a, new v.a(m.this) {
                /* class com.facebook.imagepipeline.n.m.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29166);
                }

                @Override // com.facebook.imagepipeline.n.v.a
                public final void a(com.facebook.imagepipeline.j.e eVar, int i2) {
                    if (eVar != null) {
                        if (m.this.f48336c || !b.a(i2, 16)) {
                            com.facebook.imagepipeline.o.b a2 = alVar.a();
                            if (m.this.f48337d || !com.facebook.common.k.g.b(a2.mSourceUri)) {
                                eVar.f47996h = q.a(a2.mRotationOptions, a2.mResizeOptions, eVar, i2);
                            }
                        }
                        c.this.b(eVar, i2);
                    }
                }
            }, bVar.f47735b);
            alVar.a(new e(m.this) {
                /* class com.facebook.imagepipeline.n.m.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29167);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    if (z) {
                        c.this.d();
                    }
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void c() {
                    if (c.this.f48349b.h()) {
                        c.this.f48350c.b();
                    }
                }
            });
        }

        private Map<String, String> a(com.facebook.imagepipeline.j.c cVar, long j2, h hVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f48352f.requiresExtraMap(this.f48349b.b())) {
                return null;
            }
            String valueOf = String.valueOf(j2);
            String valueOf2 = String.valueOf(hVar.b());
            String valueOf3 = String.valueOf(z);
            if (cVar instanceof d) {
                Bitmap bitmap = ((d) cVar).f47984a;
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", bitmap.getWidth() + "x" + bitmap.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return f.copyOf(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return f.copyOf(hashMap2);
        }
    }

    class b extends c {

        /* renamed from: f  reason: collision with root package name */
        private final com.facebook.imagepipeline.g.f f48345f;

        /* renamed from: g  reason: collision with root package name */
        private final e f48346g;

        /* renamed from: h  reason: collision with root package name */
        private int f48347h = 0;

        static {
            Covode.recordClassIndex(29164);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final h c() {
            return this.f48346g.b(this.f48345f.f47973a);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final int a(com.facebook.imagepipeline.j.e eVar) {
            return this.f48345f.f47974b;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.m.c
        public final synchronized boolean a(com.facebook.imagepipeline.j.e eVar, int i2) {
            MethodCollector.i(14092);
            boolean a2 = super.a(eVar, i2);
            if ((b(i2) || a(i2, 8)) && !a(i2, 4) && com.facebook.imagepipeline.j.e.e(eVar) && eVar.c() == com.facebook.h.b.f47621a) {
                if (!this.f48345f.a(eVar)) {
                    MethodCollector.o(14092);
                    return false;
                }
                int i3 = this.f48345f.f47973a;
                int i4 = this.f48347h;
                if (i3 <= i4) {
                    MethodCollector.o(14092);
                    return false;
                } else if (i3 >= this.f48346g.a(i4) || this.f48345f.f47975c) {
                    this.f48347h = i3;
                } else {
                    MethodCollector.o(14092);
                    return false;
                }
            }
            MethodCollector.o(14092);
            return a2;
        }

        public b(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, al alVar, com.facebook.imagepipeline.g.f fVar, e eVar, boolean z, int i2) {
            super(kVar, alVar, z, i2);
            this.f48345f = (com.facebook.imagepipeline.g.f) i.a(fVar);
            this.f48346g = (e) i.a(eVar);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, al alVar) {
        k<com.facebook.imagepipeline.j.e> bVar;
        try {
            com.facebook.imagepipeline.p.b.a();
            if (!com.facebook.common.k.g.b(alVar.a().mSourceUri)) {
                bVar = new a(kVar, alVar, this.f48341h, this.f48342i);
            } else {
                bVar = new b(kVar, alVar, new com.facebook.imagepipeline.g.f(this.f48338e), this.f48339f, this.f48341h, this.f48342i);
            }
            this.f48340g.a(bVar, alVar);
            com.facebook.imagepipeline.p.b.a();
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    public m(com.facebook.common.g.a aVar, Executor executor, com.facebook.imagepipeline.g.c cVar, e eVar, boolean z, boolean z2, boolean z3, ak<com.facebook.imagepipeline.j.e> akVar, int i2) {
        this.f48338e = (com.facebook.common.g.a) i.a(aVar);
        this.f48334a = (Executor) i.a(executor);
        this.f48335b = (com.facebook.imagepipeline.g.c) i.a(cVar);
        this.f48339f = (e) i.a(eVar);
        this.f48336c = z;
        this.f48337d = z2;
        this.f48340g = (ak) i.a(akVar);
        this.f48341h = z3;
        this.f48342i = i2;
    }
}
