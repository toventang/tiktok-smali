package com.ss.android.ugc.aweme.ecommercelive.business.common.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.covode.number.Covode;

public final class g implements b<b> {
    static {
        Covode.recordClassIndex(55306);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 1) {
                bVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                bVar.f87953i = fVar.e();
            } else if (b2 == 3) {
                bVar.f87954j = fVar.e();
            } else if (b2 == 4) {
                bVar.f87955k = h.b(fVar);
            } else if (b2 != 5) {
                com.bytedance.android.e.a.a.g.c(fVar);
            } else {
                bVar.f87956l = i.b(fVar);
            }
        }
    }
}
