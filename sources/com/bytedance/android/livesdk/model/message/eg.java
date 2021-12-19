package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class eg implements b<ap> {
    static {
        Covode.recordClassIndex(11627);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ap a(f fVar) {
        ap apVar = new ap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return apVar;
            } else if (b2 == 1) {
                apVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                apVar.f19181a = fVar.f();
            } else if (b2 == 3) {
                apVar.f19183g = fVar.f();
            } else if (b2 == 4) {
                apVar.f19184h = fVar.e();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                apVar.f19182f = fVar.f();
            }
        }
    }
}
