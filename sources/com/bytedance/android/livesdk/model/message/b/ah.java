package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ah implements b<o> {
    static {
        Covode.recordClassIndex(11433);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ o a(f fVar) {
        return b(fVar);
    }

    public static o b(f fVar) {
        o oVar = new o();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return oVar;
            } else if (b2 == 1) {
                oVar.f19289a = fVar.f();
            } else if (b2 == 2) {
                oVar.f19290b = (int) fVar.f();
            } else if (b2 == 3) {
                oVar.f19291c = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                oVar.f19292d = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
