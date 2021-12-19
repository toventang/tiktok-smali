package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;

public final class a implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final ak<e> f48117a;

    static {
        Covode.recordClassIndex(29076);
    }

    /* renamed from: com.facebook.imagepipeline.n.a$a  reason: collision with other inner class name */
    static class C1181a extends n<e, e> {
        static {
            Covode.recordClassIndex(29077);
        }

        private C1181a(k<e> kVar) {
            super(kVar);
        }

        /* synthetic */ C1181a(k kVar, byte b2) {
            this(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar = (e) obj;
            if (eVar == null) {
                this.f48362e.b(null, i2);
                return;
            }
            if (!e.c(eVar)) {
                eVar.j();
            }
            this.f48362e.b(eVar, i2);
        }
    }

    public a(ak<e> akVar) {
        this.f48117a = akVar;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        this.f48117a.a(new C1181a(kVar, (byte) 0), alVar);
    }
}
