package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class fh implements b<bo> {
    static {
        Covode.recordClassIndex(11655);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bo a(f fVar) {
        bo boVar = new bo();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return boVar;
            } else if (b2 == 1) {
                boVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                boVar.f19343a = g.a(fVar);
            }
        }
    }
}
