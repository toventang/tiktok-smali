package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bt implements b<v> {
    static {
        Covode.recordClassIndex(11351);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ v a(f fVar) {
        return b(fVar);
    }

    public static v b(f fVar) {
        v vVar = new v();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return vVar;
            } else if (b2 == 1) {
                vVar.f19780b = g.a(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                vVar.f19779a = fVar.e();
            }
        }
    }
}
