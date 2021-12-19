package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ev implements b<bf> {
    static {
        Covode.recordClassIndex(11642);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bf a(f fVar) {
        bf bfVar = new bf();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bfVar;
            } else if (b2 == 1) {
                bfVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                bfVar.f19310a = fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                bfVar.f19311f = fVar.f();
            }
        }
    }
}
