package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class cm implements b<bb> {
    static {
        Covode.recordClassIndex(11371);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bb a(f fVar) {
        bb bbVar = new bb();
        bbVar.f19033a = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bbVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                long a3 = fVar.a();
                Long l2 = null;
                Long l3 = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        l2 = Long.valueOf(g.b(fVar));
                    } else if (b3 == 2) {
                        l3 = Long.valueOf(g.b(fVar));
                    }
                }
                fVar.a(a3);
                if (l2 == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (l3 != null) {
                    bbVar.f19033a.put(l2, l3);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
