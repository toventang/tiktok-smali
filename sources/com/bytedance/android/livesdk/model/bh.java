package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bh implements b<h> {
    static {
        Covode.recordClassIndex(11339);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ h a(f fVar) {
        return b(fVar);
    }

    public static h b(f fVar) {
        h hVar = new h();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return hVar;
            } else if (b2 == 1) {
                hVar.f19068a = fVar.f();
            } else if (b2 == 2) {
                hVar.f19069b = fVar.f();
            } else if (b2 != 6) {
                g.c(fVar);
            } else {
                hVar.f19070c = fVar.f();
            }
        }
    }
}
