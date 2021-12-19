package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class x implements b<e> {
    static {
        Covode.recordClassIndex(11463);
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
                eVar.f19260a = y.b(fVar);
            } else if (b2 == 2) {
                eVar.f19261b = y.b(fVar);
            } else if (b2 == 3) {
                eVar.f19262c = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                eVar.f19263d = g.a(fVar);
            }
        }
    }
}
