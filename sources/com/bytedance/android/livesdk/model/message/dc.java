package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bl;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class dc implements b<o> {
    static {
        Covode.recordClassIndex(11591);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ o a(f fVar) {
        o oVar = new o();
        oVar.f19664a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return oVar;
            } else if (b2 == 1) {
                oVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                oVar.f19664a.add(bl.b(fVar));
            }
        }
    }
}
