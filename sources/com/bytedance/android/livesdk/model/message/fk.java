package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class fk implements b<bq> {
    static {
        Covode.recordClassIndex(11658);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bq a(f fVar) {
        bq bqVar = new bq();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bqVar;
            } else if (b2 == 1) {
                bqVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                bqVar.f19350a = fVar.e();
            } else if (b2 == 3) {
                bqVar.f19351f = fVar.e();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                bqVar.f19352g = fm.b(fVar);
            }
        }
    }
}
