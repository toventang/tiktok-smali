package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class fc implements b<bi> {
    static {
        Covode.recordClassIndex(11650);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bi a(f fVar) {
        bi biVar = new bi();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return biVar;
            } else if (b2 == 1) {
                biVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                biVar.f19330a = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                biVar.f19331f = fVar.d();
            }
        }
    }
}
