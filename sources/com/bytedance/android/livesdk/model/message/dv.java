package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class dv implements b<ah> {
    static {
        Covode.recordClassIndex(11610);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ah a(f fVar) {
        ah ahVar = new ah();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ahVar;
            } else if (b2 == 1) {
                ahVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                ahVar.f19132a = (int) fVar.f();
            }
        }
    }
}
