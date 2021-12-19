package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bk;
import com.bytedance.covode.number.Covode;

public final class dr implements b<ad> {
    static {
        Covode.recordClassIndex(11606);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ad a(f fVar) {
        return b(fVar);
    }

    public static ad b(f fVar) {
        ad adVar = new ad();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return adVar;
            } else if (b2 == 1) {
                adVar.f19123a = fVar.f();
            } else if (b2 == 2) {
                adVar.f19124b = fVar.f();
            } else if (b2 == 3) {
                adVar.f19125c = fv.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                adVar.f19126d = bk.b(fVar);
            }
        }
    }
}
