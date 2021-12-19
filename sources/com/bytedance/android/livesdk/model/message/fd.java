package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class fd implements b<bk> {
    static {
        Covode.recordClassIndex(11651);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bk a(f fVar) {
        bk bkVar = new bk();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bkVar;
            } else if (b2 == 1) {
                bkVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                bkVar.f19337a = fVar.f();
            } else if (b2 == 3) {
                bkVar.f19338f = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                bkVar.f19339g = fVar.e();
            }
        }
    }
}
