package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class di implements b<u> {
    static {
        Covode.recordClassIndex(11597);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ u a(f fVar) {
        u uVar = new u();
        uVar.f19693a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return uVar;
            } else if (b2 == 1) {
                uVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                uVar.f19693a.add(cs.b(fVar));
            }
        }
    }
}
