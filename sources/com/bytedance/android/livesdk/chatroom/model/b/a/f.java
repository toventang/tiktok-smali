package com.bytedance.android.livesdk.chatroom.model.b.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class f implements b<c> {
    static {
        Covode.recordClassIndex(8677);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(com.bytedance.android.e.a.a.f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 2) {
                cVar.f15697a = (int) fVar.f();
            } else if (b2 == 3) {
                cVar.f15698b = fVar.e();
            } else if (b2 == 6) {
                cVar.f15699c = fVar.d();
            } else if (b2 == 7) {
                cVar.f15700d = (int) fVar.f();
            } else if (b2 == 8) {
                cVar.f15701e = fVar.d();
            } else if (b2 != 11) {
                g.c(fVar);
            } else {
                cVar.f15702f = (int) fVar.f();
            }
        }
    }
}
