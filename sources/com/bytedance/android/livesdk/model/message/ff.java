package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ff implements b<bm> {
    static {
        Covode.recordClassIndex(11653);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bm a(f fVar) {
        bm bmVar = new bm();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bmVar;
            } else if (b2 == 1) {
                bmVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                bmVar.f19341a = fi.b(fVar);
            }
        }
    }
}
