package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class en implements b<ay> {
    static {
        Covode.recordClassIndex(11634);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ay a(f fVar) {
        ay ayVar = new ay();
        ayVar.f19231f = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ayVar;
            } else if (b2 == 1) {
                ayVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                ayVar.f19230a = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                ayVar.f19231f.add(em.b(fVar));
            }
        }
    }
}
