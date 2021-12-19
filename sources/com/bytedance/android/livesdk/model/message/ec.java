package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ec implements b<al> {
    static {
        Covode.recordClassIndex(11623);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ al a(f fVar) {
        al alVar = new al();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return alVar;
            } else if (b2 == 1) {
                alVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                alVar.f19152a = fVar.e();
            } else if (b2 == 3) {
                alVar.f19153f = eb.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                alVar.f19154g = dz.b(fVar);
            }
        }
    }
}
