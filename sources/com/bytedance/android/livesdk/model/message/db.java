package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class db implements b<n> {
    static {
        Covode.recordClassIndex(11590);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ n a(f fVar) {
        n nVar = new n();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return nVar;
            } else if (b2 == 1) {
                nVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                nVar.f19656a = (int) fVar.f();
            } else if (b2 == 3) {
                nVar.f19657f = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                nVar.f19658g = da.b(fVar);
            }
        }
    }
}
