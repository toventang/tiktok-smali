package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ab implements b<c> {
    static {
        Covode.recordClassIndex(9935);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 1) {
                cVar.f17868c = ac.b(fVar);
            } else if (b2 == 2) {
                cVar.f17869d = Long.valueOf(fVar.f());
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                cVar.f17870e = Boolean.valueOf(g.a(fVar));
            }
        }
    }
}
