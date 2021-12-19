package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ad implements b<e> {
    static {
        Covode.recordClassIndex(9937);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        return b(fVar);
    }

    public static e b(f fVar) {
        e eVar = new e();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return eVar;
            } else if (b2 == 1) {
                eVar.f17878b = fVar.e();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                eVar.f17877a = Long.valueOf(fVar.f());
            }
        }
    }
}
