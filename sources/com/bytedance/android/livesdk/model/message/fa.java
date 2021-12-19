package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.model.message.bh;
import com.bytedance.covode.number.Covode;

public final class fa implements b<bh.d> {
    static {
        Covode.recordClassIndex(11648);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bh.d a(f fVar) {
        return b(fVar);
    }

    public static bh.d b(f fVar) {
        bh.d dVar = new bh.d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return dVar;
            } else if (b2 == 1) {
                dVar.f19326a = fVar.f();
            } else if (b2 == 2) {
                dVar.f19327b = fVar.f();
            } else if (b2 == 3) {
                dVar.f19328c = j.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                dVar.f19329d = j.b(fVar);
            }
        }
    }
}
