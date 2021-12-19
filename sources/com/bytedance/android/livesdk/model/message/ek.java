package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class ek implements b<au> {
    static {
        Covode.recordClassIndex(11631);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ au a(f fVar) {
        au auVar = new au();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return auVar;
            } else if (b2 == 1) {
                auVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                auVar.f19209a = fVar.f();
            } else if (b2 == 3) {
                auVar.f19210f = fVar.e();
            } else if (b2 == 4) {
                auVar.f19211g = fVar.d();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                auVar.f19212h = j.b(fVar);
            }
        }
    }
}
