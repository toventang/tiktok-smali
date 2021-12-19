package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bz;
import com.bytedance.covode.number.Covode;

public final class dq implements b<ac> {
    static {
        Covode.recordClassIndex(11605);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ac a(f fVar) {
        ac acVar = new ac();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return acVar;
            } else if (b2 == 1) {
                acVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                acVar.f19122a = bz.b(fVar);
            }
        }
    }
}
