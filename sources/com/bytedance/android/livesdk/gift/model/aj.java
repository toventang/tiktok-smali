package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bx;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class aj implements b<j> {
    static {
        Covode.recordClassIndex(9943);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ j a(f fVar) {
        return b(fVar);
    }

    public static j b(f fVar) {
        j jVar = new j();
        jVar.f17899d = new ArrayList();
        jVar.f17898c = new ArrayList();
        jVar.f17896a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return jVar;
            } else if (b2 == 1) {
                jVar.f17897b = an.b(fVar);
            } else if (b2 == 2) {
                jVar.f17896a.add(bx.b(fVar));
            } else if (b2 == 3) {
                jVar.f17898c.add(ak.b(fVar));
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                jVar.f17899d.add(aa.b(fVar));
            }
        }
    }
}
