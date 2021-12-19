package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.b.ag;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class ed implements b<am> {
    static {
        Covode.recordClassIndex(11624);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ am a(f fVar) {
        am amVar = new am();
        amVar.f19162f = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return amVar;
            } else if (b2 == 1) {
                amVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                amVar.f19161a = g.b(fVar);
            } else if (b2 == 3) {
                long a3 = fVar.a();
                Long l2 = null;
                n nVar = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        l2 = Long.valueOf(g.b(fVar));
                    } else if (b3 == 2) {
                        nVar = ag.b(fVar);
                    }
                }
                fVar.a(a3);
                if (l2 == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (nVar != null) {
                    amVar.f19162f.put(l2, nVar);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            } else if (b2 == 5) {
                amVar.f19163g = g.b(fVar);
            } else if (b2 != 6) {
                g.c(fVar);
            } else {
                amVar.f19164h = g.b(fVar);
            }
        }
    }
}
