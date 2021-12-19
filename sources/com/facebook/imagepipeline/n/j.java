package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;

public final class j implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    public final ak<e> f48330a;

    /* renamed from: b  reason: collision with root package name */
    private final ak<e> f48331b;

    static {
        Covode.recordClassIndex(29158);
    }

    class a extends n<e, e> {

        /* renamed from: b  reason: collision with root package name */
        private al f48333b;

        static {
            Covode.recordClassIndex(29159);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            j.this.f48330a.a(this.f48362e, this.f48333b);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            b a2 = this.f48333b.a();
            boolean a3 = a(i2);
            boolean a4 = bd.a(eVar, a2.mResizeOptions);
            if (eVar != null && (a4 || a2.mLocalThumbnailPreviewsEnabled)) {
                if (!a3 || !a4) {
                    this.f48362e.b(eVar, i2 & -2);
                } else {
                    this.f48362e.b(eVar, i2);
                    return;
                }
            }
            if (a3 && !a4) {
                e.d(eVar);
                j.this.f48330a.a(this.f48362e, this.f48333b);
            }
        }

        private a(k<e> kVar, al alVar) {
            super(kVar);
            this.f48333b = alVar;
        }

        /* synthetic */ a(j jVar, k kVar, al alVar, byte b2) {
            this(kVar, alVar);
        }
    }

    public j(ak<e> akVar, ak<e> akVar2) {
        this.f48331b = akVar;
        this.f48330a = akVar2;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        this.f48331b.a(new a(this, kVar, alVar, (byte) 0), alVar);
    }
}
