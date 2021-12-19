package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class cl implements b<ay> {
    static {
        Covode.recordClassIndex(11370);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ay a(f fVar) {
        return b(fVar);
    }

    public static ay b(f fVar) {
        ay ayVar = new ay();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ayVar;
            } else if (b2 == 1) {
                ayVar.f19025a = fVar.f();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                ayVar.f19026b = j.b(fVar);
            }
        }
    }
}
