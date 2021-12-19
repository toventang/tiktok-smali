package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class gi implements b<ck> {
    static {
        Covode.recordClassIndex(11683);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ck a(f fVar) {
        ck ckVar = new ck();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ckVar;
            } else if (b2 == 1) {
                ckVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                ckVar.f19497a = j.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                ckVar.f19498f = gh.b(fVar);
            }
        }
    }
}
