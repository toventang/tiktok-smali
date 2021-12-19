package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class by implements b<y> {
    static {
        Covode.recordClassIndex(11356);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ y a(f fVar) {
        return b(fVar);
    }

    public static y b(f fVar) {
        y yVar = new y();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return yVar;
            } else if (b2 == 1) {
                yVar.f19789c = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 2) {
                yVar.f19788b = (int) fVar.f();
            } else if (b2 == 3) {
                yVar.f19790d = (int) fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                yVar.f19787a = fVar.d();
            }
        }
    }
}
