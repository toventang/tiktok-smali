package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class fy implements b<cb> {
    static {
        Covode.recordClassIndex(11672);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ cb a(f fVar) {
        cb cbVar = new cb();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cbVar;
            } else if (b2 == 1) {
                cbVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                cbVar.f19460a = fVar.e();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                cbVar.f19461f = fVar.d();
            }
        }
    }
}
