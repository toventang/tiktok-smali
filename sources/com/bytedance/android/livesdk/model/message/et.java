package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class et implements b<bd> {
    static {
        Covode.recordClassIndex(11640);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bd a(f fVar) {
        bd bdVar = new bd();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bdVar;
            } else if (b2 == 1) {
                bdVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                bdVar.f19306a = fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                bdVar.f19307f = fVar.f();
            }
        }
    }
}
