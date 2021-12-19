package com.bytedance.android.livesdk.model.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.covode.number.Covode;

public final class g implements b<c> {
    static {
        Covode.recordClassIndex(11300);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        return b(fVar);
    }

    public static c b(f fVar) {
        c cVar = new c((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 != 1) {
                com.bytedance.android.e.a.a.g.c(fVar);
            } else {
                cVar.f18939a = f.b(fVar);
            }
        }
    }
}
