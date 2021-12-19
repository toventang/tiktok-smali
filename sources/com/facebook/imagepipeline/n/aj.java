package com.facebook.imagepipeline.n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.d;
import com.facebook.imagepipeline.o.e;
import java.util.Map;
import java.util.concurrent.Executor;

public final class aj implements ak<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

    /* renamed from: a  reason: collision with root package name */
    public final f f48181a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f48182b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f48183c;

    static {
        Covode.recordClassIndex(29101);
    }

    class a extends n<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

        /* renamed from: a  reason: collision with root package name */
        final an f48184a;

        /* renamed from: b  reason: collision with root package name */
        final String f48185b;

        /* renamed from: c  reason: collision with root package name */
        final d f48186c;

        /* renamed from: d  reason: collision with root package name */
        public com.facebook.common.h.a<com.facebook.imagepipeline.j.c> f48187d;

        /* renamed from: f  reason: collision with root package name */
        public int f48188f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f48189g;

        /* renamed from: h  reason: collision with root package name */
        boolean f48190h;

        /* renamed from: j  reason: collision with root package name */
        private boolean f48192j;

        static {
            Covode.recordClassIndex(29102);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a() {
            e();
        }

        private synchronized boolean f() {
            boolean z;
            MethodCollector.i(13571);
            z = this.f48192j;
            MethodCollector.o(13571);
            return z;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            aj.this.f48182b.execute(new Runnable() {
                /* class com.facebook.imagepipeline.n.aj.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29104);
                }

                public final void run() {
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar;
                    int i2;
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar2;
                    boolean d2;
                    MethodCollector.i(12149);
                    synchronized (a.this) {
                        try {
                            aVar = a.this.f48187d;
                            i2 = a.this.f48188f;
                            aVar2 = null;
                            a.this.f48187d = null;
                            a.this.f48189g = false;
                        } finally {
                            MethodCollector.o(12149);
                        }
                    }
                    if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
                        try {
                            a aVar3 = a.this;
                            i.a(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
                            if (!(aVar.a() instanceof com.facebook.imagepipeline.j.d)) {
                                aVar3.a(aVar, i2);
                            } else {
                                aVar3.f48184a.onProducerStart(aVar3.f48185b, "PostprocessorProducer");
                                try {
                                    aVar = aVar3.a(aVar.a());
                                    try {
                                        aVar3.f48184a.onProducerFinishWithSuccess(aVar3.f48185b, "PostprocessorProducer", a.a(aVar3.f48184a, aVar3.f48185b, aVar3.f48186c));
                                        aVar3.a(aVar, i2);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    aVar3.f48184a.onProducerFinishWithFailure(aVar3.f48185b, "PostprocessorProducer", e2, a.a(aVar3.f48184a, aVar3.f48185b, aVar3.f48186c));
                                    aVar3.c(e2);
                                }
                                com.facebook.common.h.a.c(aVar2);
                            }
                            com.facebook.common.h.a.c(aVar);
                        } finally {
                            com.facebook.common.h.a.c(aVar);
                            MethodCollector.o(12149);
                        }
                    }
                    a aVar4 = a.this;
                    synchronized (aVar4) {
                        try {
                            aVar4.f48190h = false;
                            d2 = aVar4.d();
                        } finally {
                            MethodCollector.o(12149);
                        }
                    }
                    if (d2) {
                        aVar4.c();
                    }
                }
            });
        }

        public final void e() {
            if (g()) {
                this.f48362e.b();
            }
        }

        private boolean g() {
            MethodCollector.i(13649);
            synchronized (this) {
                try {
                    if (this.f48192j) {
                        return false;
                    }
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar = this.f48187d;
                    this.f48187d = null;
                    this.f48192j = true;
                    com.facebook.common.h.a.c(aVar);
                    MethodCollector.o(13649);
                    return true;
                } finally {
                    MethodCollector.o(13649);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean d() {
            MethodCollector.i(13264);
            if (this.f48192j || !this.f48189g || this.f48190h || !com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f48187d)) {
                MethodCollector.o(13264);
                return false;
            }
            this.f48190h = true;
            MethodCollector.o(13264);
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            c(th);
        }

        /* access modifiers changed from: package-private */
        public final void c(Throwable th) {
            if (g()) {
                this.f48362e.b(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final com.facebook.common.h.a<com.facebook.imagepipeline.j.c> a(com.facebook.imagepipeline.j.c cVar) {
            com.facebook.imagepipeline.j.d dVar = (com.facebook.imagepipeline.j.d) cVar;
            com.facebook.common.h.a<Bitmap> process = this.f48186c.process(dVar.f47984a, aj.this.f48181a);
            try {
                return com.facebook.common.h.a.a(new com.facebook.imagepipeline.j.d(process, cVar.e(), dVar.f47985b, dVar.f47986c));
            } finally {
                com.facebook.common.h.a.c(process);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar, int i2) {
            if (!a(i2)) {
                if (f()) {
                    return;
                }
            } else if (!g()) {
                return;
            }
            this.f48362e.b(aVar, i2);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            com.facebook.common.h.a.c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            if (r0 == false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13712);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        @Override // com.facebook.imagepipeline.n.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r4, int r5) {
            /*
                r3 = this;
                r2 = 13712(0x3590, float:1.9215E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
                com.facebook.common.h.a r4 = (com.facebook.common.h.a) r4
                boolean r0 = com.facebook.common.h.a.a(r4)
                if (r0 != 0) goto L_0x001b
                boolean r0 = a(r5)
                if (r0 == 0) goto L_0x0017
                r0 = 0
                r3.a(r0, r5)
            L_0x0017:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
                return
            L_0x001b:
                monitor-enter(r3)
                boolean r0 = r3.f48192j     // Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0025
                monitor-exit(r3)     // Catch:{ all -> 0x0043 }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
                return
            L_0x0025:
                com.facebook.common.h.a<com.facebook.imagepipeline.j.c> r1 = r3.f48187d
                com.facebook.common.h.a r0 = com.facebook.common.h.a.b(r4)
                r3.f48187d = r0
                r3.f48188f = r5
                r0 = 1
                r3.f48189g = r0
                boolean r0 = r3.d()
                monitor-exit(r3)
                com.facebook.common.h.a.c(r1)
                if (r0 == 0) goto L_0x003f
                r3.c()
            L_0x003f:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
                return
            L_0x0043:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.aj.a.a(java.lang.Object, int):void");
        }

        static Map<String, String> a(an anVar, String str, d dVar) {
            if (!anVar.requiresExtraMap(str)) {
                return null;
            }
            return com.facebook.common.d.f.of("Postprocessor", dVar.getName());
        }

        public a(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, an anVar, String str, d dVar, al alVar) {
            super(kVar);
            this.f48184a = anVar;
            this.f48185b = str;
            this.f48186c = dVar;
            alVar.a(new e(aj.this) {
                /* class com.facebook.imagepipeline.n.aj.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29103);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    a.this.e();
                }
            });
        }
    }

    class b extends n<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

        /* renamed from: b  reason: collision with root package name */
        private boolean f48197b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.common.h.a<com.facebook.imagepipeline.j.c> f48198c;

        static {
            Covode.recordClassIndex(29105);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a() {
            if (c()) {
                this.f48362e.b();
            }
        }

        public final boolean c() {
            MethodCollector.i(12003);
            synchronized (this) {
                try {
                    if (this.f48197b) {
                        return false;
                    }
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar = this.f48198c;
                    this.f48198c = null;
                    this.f48197b = true;
                    com.facebook.common.h.a.c(aVar);
                    MethodCollector.o(12003);
                    return true;
                } finally {
                    MethodCollector.o(12003);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            if (c()) {
                this.f48362e.b(th);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            MethodCollector.i(12146);
            com.facebook.common.h.a aVar = (com.facebook.common.h.a) obj;
            if (!b(i2)) {
                synchronized (this) {
                    try {
                        if (!this.f48197b) {
                            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar2 = this.f48198c;
                            this.f48198c = com.facebook.common.h.a.b(aVar);
                            com.facebook.common.h.a.c(aVar2);
                        }
                    } finally {
                        MethodCollector.o(12146);
                    }
                }
                synchronized (this) {
                    try {
                        if (!this.f48197b) {
                            com.facebook.common.h.a b2 = com.facebook.common.h.a.b(this.f48198c);
                            try {
                                this.f48362e.b(b2, 0);
                            } finally {
                                com.facebook.common.h.a.c(b2);
                                MethodCollector.o(12146);
                            }
                        }
                    } finally {
                        MethodCollector.o(12146);
                    }
                }
            } else {
                MethodCollector.o(12146);
            }
        }

        private b(a aVar, al alVar) {
            super(aVar);
            alVar.a(new e(aj.this) {
                /* class com.facebook.imagepipeline.n.aj.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29106);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    if (b.this.c()) {
                        b.this.f48362e.b();
                    }
                }
            });
        }

        /* synthetic */ b(aj ajVar, a aVar, al alVar, byte b2) {
            this(aVar, alVar);
        }
    }

    class c extends n<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {
        static {
            Covode.recordClassIndex(29107);
        }

        private c(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            if (!b(i2)) {
                this.f48362e.b(obj, i2);
            }
        }

        /* synthetic */ c(aj ajVar, a aVar, byte b2) {
            this(aVar);
        }
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> kVar, al alVar) {
        k<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar;
        an c2 = alVar.c();
        d dVar = alVar.a().mPostprocessor;
        a aVar = new a(kVar, c2, alVar.b(), dVar, alVar);
        if (dVar instanceof e) {
            cVar = new b(this, aVar, alVar, (byte) 0);
        } else {
            cVar = new c(this, aVar, (byte) 0);
        }
        this.f48183c.a(cVar, alVar);
    }

    public aj(ak<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> akVar, f fVar, Executor executor) {
        this.f48183c = (ak) i.a(akVar);
        this.f48181a = fVar;
        this.f48182b = (Executor) i.a(executor);
    }
}
