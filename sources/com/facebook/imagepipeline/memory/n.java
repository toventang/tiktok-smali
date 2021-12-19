package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.d;
import com.facebook.common.h.c;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    final a f48096a;

    /* renamed from: b  reason: collision with root package name */
    private final c<byte[]> f48097b;

    static {
        Covode.recordClassIndex(29060);
    }

    static class a extends o {
        static {
            Covode.recordClassIndex(29062);
        }

        /* access modifiers changed from: package-private */
        @Override // com.facebook.imagepipeline.memory.a
        public final f<byte[]> e(int i2) {
            return new z(i2, this.f48022b.f48068g);
        }

        public a(d dVar, ad adVar, ae aeVar) {
            super(dVar, adVar, aeVar);
        }
    }

    public final com.facebook.common.h.a<byte[]> a(int i2) {
        return com.facebook.common.h.a.a(this.f48096a.a(i2), this.f48097b);
    }

    public n(d dVar, ad adVar) {
        boolean z;
        if (adVar.f48068g > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        this.f48096a = new a(dVar, adVar, y.a());
        this.f48097b = new c<byte[]>() {
            /* class com.facebook.imagepipeline.memory.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29061);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.h.c
            public final /* bridge */ /* synthetic */ void a(byte[] bArr) {
                n.this.f48096a.a(bArr);
            }
        };
    }
}
