package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.model.message.bh;
import com.bytedance.covode.number.Covode;

public final class ez implements b<bh.c> {
    static {
        Covode.recordClassIndex(11646);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bh.c a(f fVar) {
        return b(fVar);
    }

    public static bh.c b(f fVar) {
        bh.c cVar = new bh.c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                cVar.f19325a = j.b(fVar);
            }
        }
    }
}
