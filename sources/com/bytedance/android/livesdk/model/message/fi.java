package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class fi implements b<bj> {
    static {
        Covode.recordClassIndex(11656);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bj a(f fVar) {
        return b(fVar);
    }

    public static bj b(f fVar) {
        bj bjVar = new bj();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bjVar;
            } else if (b2 == 1) {
                bjVar.f19332a = fVar.f();
            } else if (b2 == 2) {
                bjVar.f19333b = fVar.d();
            } else if (b2 == 3) {
                bjVar.f19334c = fVar.e();
            } else if (b2 == 4) {
                bjVar.f19335d = fVar.f();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                bjVar.f19336e = j.b(fVar);
            }
        }
    }
}
