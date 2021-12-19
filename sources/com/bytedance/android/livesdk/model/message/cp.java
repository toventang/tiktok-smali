package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cp implements b<d> {
    static {
        Covode.recordClassIndex(11537);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return dVar;
            } else if (b2 == 1) {
                dVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                dVar.f19503a = co.b(fVar);
            }
        }
    }
}
