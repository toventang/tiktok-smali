package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class dy implements b<ak> {
    static {
        Covode.recordClassIndex(11613);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ak a(f fVar) {
        ak akVar = new ak();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return akVar;
            } else if (b2 == 1) {
                akVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                akVar.f19149a = fVar.d();
            } else if (b2 == 3) {
                akVar.f19150f = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                akVar.f19151g = fVar.e();
            }
        }
    }
}
