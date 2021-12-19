package com.bytedance.android.livesdk.service.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class e implements b<c> {
    static {
        Covode.recordClassIndex(12560);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                cVar.f21284a = fVar.d();
            }
        }
    }
}
