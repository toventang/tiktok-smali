package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class dh implements b<t> {
    static {
        Covode.recordClassIndex(11596);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ t a(f fVar) {
        t tVar = new t();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return tVar;
            } else if (b2 == 1) {
                tVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 3) {
                tVar.f19689f = fVar.d();
            } else if (b2 != 6) {
                g.c(fVar);
            } else {
                tVar.f19688a = fVar.f();
            }
        }
    }
}
