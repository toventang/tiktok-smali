package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.v;
import com.facebook.imagepipeline.q.c;
import java.util.concurrent.Executor;

public final class at implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f48222a;

    /* renamed from: b  reason: collision with root package name */
    public final i f48223b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<e> f48224c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48225d = true;

    /* renamed from: e  reason: collision with root package name */
    private final c f48226e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48227f;

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48228g;

    /* renamed from: h  reason: collision with root package name */
    private final f f48229h;

    static {
        Covode.recordClassIndex(29121);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        this.f48224c.a(new a(kVar, alVar, this.f48225d, this.f48226e, this.f48227f, this.f48228g, this.f48229h), alVar);
    }

    class a extends n<e, e> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f48230a;

        /* renamed from: b  reason: collision with root package name */
        public final c f48231b;

        /* renamed from: c  reason: collision with root package name */
        public final al f48232c;

        /* renamed from: d  reason: collision with root package name */
        final com.facebook.imagepipeline.d.e f48233d;

        /* renamed from: f  reason: collision with root package name */
        final com.facebook.imagepipeline.d.e f48234f;

        /* renamed from: g  reason: collision with root package name */
        final f f48235g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f48236h;

        /* renamed from: i  reason: collision with root package name */
        public final v f48237i;

        static {
            Covode.recordClassIndex(29122);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
            if (com.facebook.imagepipeline.q.d.f48460a.contains(java.lang.Integer.valueOf(r8.e())) != false) goto L_0x009c;
         */
        @Override // com.facebook.imagepipeline.n.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r8, int r9) {
            /*
            // Method dump skipped, instructions count: 204
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.at.a.a(java.lang.Object, int):void");
        }

        a(final k<e> kVar, al alVar, boolean z, c cVar, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar) {
            super(kVar);
            this.f48232c = alVar;
            this.f48230a = z;
            this.f48231b = cVar;
            this.f48233d = eVar;
            this.f48234f = eVar2;
            this.f48235g = fVar;
            this.f48237i = new v(at.this.f48222a, new v.a(at.this) {
                /* class com.facebook.imagepipeline.n.at.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29123);
                }

                /* JADX WARNING: Removed duplicated region for block: B:54:0x0189 A[Catch:{ all -> 0x0192 }] */
                @Override // com.facebook.imagepipeline.n.v.a
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.facebook.imagepipeline.j.e r18, int r19) {
                    /*
                    // Method dump skipped, instructions count: 407
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.at.a.AnonymousClass1.a(com.facebook.imagepipeline.j.e, int):void");
                }
            }, 100);
            alVar.a(new e(at.this) {
                /* class com.facebook.imagepipeline.n.at.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29124);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    a.this.f48237i.a();
                    a.this.f48236h = true;
                    kVar.b();
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void c() {
                    if (a.this.f48232c.h()) {
                        a.this.f48237i.b();
                    }
                }
            });
        }
    }

    public at(Executor executor, i iVar, ak<e> akVar, c cVar, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar) {
        this.f48222a = (Executor) com.facebook.common.d.i.a(executor);
        this.f48223b = (i) com.facebook.common.d.i.a(iVar);
        this.f48224c = (ak) com.facebook.common.d.i.a(akVar);
        this.f48226e = (c) com.facebook.common.d.i.a(cVar);
        this.f48227f = eVar;
        this.f48228g = eVar2;
        this.f48229h = fVar;
    }
}
