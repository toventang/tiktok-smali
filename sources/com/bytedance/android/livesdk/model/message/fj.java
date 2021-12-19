package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class fj implements b<bp> {
    static {
        Covode.recordClassIndex(11657);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bp a(f fVar) {
        return b(fVar);
    }

    public static bp b(f fVar) {
        bp bpVar = new bp();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bpVar;
            } else if (b2 == 1) {
                bpVar.f19344a = g.a(fVar);
            } else if (b2 == 3) {
                bpVar.f19345b = fVar.f();
            } else if (b2 == 4) {
                bpVar.f19346c = r.b(fVar);
            } else if (b2 == 5) {
                bpVar.f19347d = fm.b(fVar);
            } else if (b2 == 6) {
                bpVar.f19348e = fVar.e();
            } else if (b2 != 7) {
                g.c(fVar);
            } else {
                bpVar.f19349f = g.a(fVar);
            }
        }
    }
}
