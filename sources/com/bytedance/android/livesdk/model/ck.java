package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ck implements b<aw> {
    static {
        Covode.recordClassIndex(11369);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ aw a(f fVar) {
        return b(fVar);
    }

    public static aw b(f fVar) {
        aw awVar = new aw();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return awVar;
            } else if (b2 == 1) {
                awVar.f19012a = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                awVar.f19013b = Long.valueOf(fVar.f());
            }
        }
    }
}
