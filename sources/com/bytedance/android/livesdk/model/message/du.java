package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.google.gson.q;

public final class du implements b<ag> {
    static {
        Covode.recordClassIndex(11609);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ag a(f fVar) {
        ag agVar = new ag();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return agVar;
            } else if (b2 == 1) {
                agVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                agVar.f19130a = q.a(fVar.d()).j();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                agVar.f19131f = fVar.e();
            }
        }
    }
}
