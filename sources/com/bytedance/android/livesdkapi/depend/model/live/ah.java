package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ah implements b<n> {
    static {
        Covode.recordClassIndex(13701);
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
                nVar.f23155a = g.a(fVar);
            } else if (b2 == 2) {
                nVar.f23156b = g.a(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                nVar.f23157c = fVar.d();
            }
        }
    }
}
