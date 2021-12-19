package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class am implements b<m> {
    static {
        Covode.recordClassIndex(9946);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        m mVar = new m();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return mVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                mVar.f17912a = ar.b(fVar);
            }
        }
    }
}
