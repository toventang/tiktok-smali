package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;

public final class p implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48374a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48375b;

    /* renamed from: c  reason: collision with root package name */
    private final f f48376c;

    /* renamed from: d  reason: collision with root package name */
    private final ak<e> f48377d;

    static {
        Covode.recordClassIndex(29172);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        a aVar = kVar;
        if (alVar.e().getValue() >= b.EnumC1183b.DISK_CACHE.getValue()) {
            aVar.b(null, 1);
            return;
        }
        if (alVar.a().mIsDiskCacheEnabled) {
            aVar = new a(aVar, alVar, this.f48374a, this.f48375b, this.f48376c, (byte) 0);
        }
        this.f48377d.a(aVar, alVar);
    }

    static class a extends n<e, e> {

        /* renamed from: a  reason: collision with root package name */
        private final al f48378a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.e f48379b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.e f48380c;

        /* renamed from: d  reason: collision with root package name */
        private final f f48381d;

        static {
            Covode.recordClassIndex(29173);
        }

        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            if (b(i2) || eVar == null || c(i2) || eVar.c() == c.f47633a) {
                this.f48362e.b(eVar, i2);
                return;
            }
            b a2 = this.f48378a.a();
            f fVar = this.f48381d;
            this.f48378a.d();
            com.facebook.c.a.e a3 = fVar.a(a2);
            if (a2.mCacheChoice == b.a.SMALL) {
                this.f48380c.a(a3, eVar);
            } else {
                this.f48379b.a(a3, eVar);
            }
            this.f48362e.b(eVar, i2);
        }

        private a(k<e> kVar, al alVar, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar) {
            super(kVar);
            this.f48378a = alVar;
            this.f48379b = eVar;
            this.f48380c = eVar2;
            this.f48381d = fVar;
        }

        /* synthetic */ a(k kVar, al alVar, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar, byte b2) {
            this(kVar, alVar, eVar, eVar2, fVar);
        }
    }

    public p(com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, f fVar, ak<e> akVar) {
        this.f48374a = eVar;
        this.f48375b = eVar2;
        this.f48376c = fVar;
        this.f48377d = akVar;
    }
}
