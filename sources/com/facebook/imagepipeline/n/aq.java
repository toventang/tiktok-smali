package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.v;
import com.facebook.imagepipeline.q.c;
import java.util.concurrent.Executor;

public final class aq implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f48205a;

    /* renamed from: b  reason: collision with root package name */
    public final i f48206b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<e> f48207c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48208d;

    /* renamed from: e  reason: collision with root package name */
    private final c f48209e;

    static {
        Covode.recordClassIndex(29115);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        this.f48207c.a(new a(kVar, alVar, this.f48208d, this.f48209e), alVar);
    }

    class a extends n<e, e> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f48210a;

        /* renamed from: b  reason: collision with root package name */
        public final c f48211b;

        /* renamed from: c  reason: collision with root package name */
        public final al f48212c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f48213d;

        /* renamed from: f  reason: collision with root package name */
        public final v f48214f;

        static {
            Covode.recordClassIndex(29116);
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.aq.a.a(java.lang.Object, int):void");
        }

        a(final k<e> kVar, al alVar, boolean z, c cVar) {
            super(kVar);
            this.f48212c = alVar;
            this.f48210a = z;
            this.f48211b = cVar;
            this.f48214f = new v(aq.this.f48205a, new v.a(aq.this) {
                /* class com.facebook.imagepipeline.n.aq.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29117);
                }

                /* JADX WARNING: Removed duplicated region for block: B:41:0x014b A[Catch:{ all -> 0x0154 }] */
                @Override // com.facebook.imagepipeline.n.v.a
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.facebook.imagepipeline.j.e r18, int r19) {
                    /*
                    // Method dump skipped, instructions count: 345
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.aq.a.AnonymousClass1.a(com.facebook.imagepipeline.j.e, int):void");
                }
            }, 100);
            alVar.a(new e(aq.this) {
                /* class com.facebook.imagepipeline.n.aq.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(29118);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    a.this.f48214f.a();
                    a.this.f48213d = true;
                    kVar.b();
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void c() {
                    if (a.this.f48212c.h()) {
                        a.this.f48214f.b();
                    }
                }
            });
        }
    }

    public aq(Executor executor, i iVar, ak<e> akVar, boolean z, c cVar) {
        this.f48205a = (Executor) com.facebook.common.d.i.a(executor);
        this.f48206b = (i) com.facebook.common.d.i.a(iVar);
        this.f48207c = (ak) com.facebook.common.d.i.a(akVar);
        this.f48209e = (c) com.facebook.common.d.i.a(cVar);
        this.f48208d = z;
    }
}
