package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class dp implements b<ab> {
    static {
        Covode.recordClassIndex(11604);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ab a(f fVar) {
        ab abVar = new ab();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return abVar;
            } else if (b2 == 1) {
                abVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                abVar.f19118a = fVar.f();
            } else if (b2 == 3) {
                abVar.f19119f = fVar.f();
            } else if (b2 == 4) {
                abVar.f19120g = fVar.d();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                abVar.f19121h = fVar.f();
            }
        }
    }
}
