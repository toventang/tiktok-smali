package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cx implements b<k> {
    static {
        Covode.recordClassIndex(11545);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ k a(f fVar) {
        k kVar = new k();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return kVar;
            } else if (b2 == 1) {
                kVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                kVar.f19641a = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                kVar.f19642f = g.a(fVar);
            }
        }
    }
}
