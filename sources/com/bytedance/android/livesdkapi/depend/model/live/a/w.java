package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class w implements b<k> {
    static {
        Covode.recordClassIndex(13691);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ k a(f fVar) {
        return b(fVar);
    }

    public static k b(f fVar) {
        k kVar = new k((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return kVar;
            } else if (b2 == 1) {
                kVar.f23091a = fVar.f();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                kVar.f23092b = t.b(fVar);
            }
        }
    }
}
