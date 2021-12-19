package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.h;
import com.facebook.imagepipeline.j.e;

public final class ap implements ak<com.facebook.common.h.a<h>> {

    /* renamed from: a  reason: collision with root package name */
    private final ak<e> f48203a;

    static {
        Covode.recordClassIndex(29113);
    }

    public ap(ak<e> akVar) {
        this.f48203a = akVar;
    }

    class a extends n<e, com.facebook.common.h.a<h>> {
        static {
            Covode.recordClassIndex(29114);
        }

        private a(k<com.facebook.common.h.a<h>> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            com.facebook.common.h.a aVar = null;
            try {
                if (e.e(eVar)) {
                    aVar = com.facebook.common.h.a.b(eVar.f47989a);
                }
                this.f48362e.b(aVar, i2);
            } finally {
                com.facebook.common.h.a.c(aVar);
            }
        }

        /* synthetic */ a(ap apVar, k kVar, byte b2) {
            this(kVar);
        }
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<com.facebook.common.h.a<h>> kVar, al alVar) {
        this.f48203a.a(new a(this, kVar, (byte) 0), alVar);
    }
}
