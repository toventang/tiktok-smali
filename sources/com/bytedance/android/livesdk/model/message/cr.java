package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class cr implements b<e> {
    static {
        Covode.recordClassIndex(11539);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        e eVar = new e();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return eVar;
            } else if (b2 == 1) {
                eVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                eVar.f19599a = cq.b(fVar);
            } else if (b2 == 3) {
                eVar.f19600f = fVar.e();
            } else if (b2 == 4) {
                eVar.f19601g = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                eVar.f19602h = r.b(fVar);
            }
        }
    }
}
