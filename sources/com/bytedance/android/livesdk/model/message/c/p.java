package com.bytedance.android.livesdk.model.message.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class p implements b<i> {
    static {
        Covode.recordClassIndex(11517);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i a(f fVar) {
        return b(fVar);
    }

    public static i b(f fVar) {
        i iVar = new i();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return iVar;
            } else if (b2 == 1) {
                iVar.f19453a = j.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                iVar.f19454b = g.a(fVar);
            }
        }
    }
}
