package com.bytedance.android.livesdk.chatroom.model.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class f implements b<c> {
    static {
        Covode.recordClassIndex(8696);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(com.bytedance.android.e.a.a.f fVar) {
        c cVar = new c((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                cVar.f15747a = fVar.d();
            }
        }
    }
}
