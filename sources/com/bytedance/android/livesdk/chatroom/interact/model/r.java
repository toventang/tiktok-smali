package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class r implements b<RivalsListExtra> {
    static {
        Covode.recordClassIndex(8629);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ RivalsListExtra a(f fVar) {
        RivalsListExtra rivalsListExtra = new RivalsListExtra();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return rivalsListExtra;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                rivalsListExtra.logPbBean = q.b(fVar);
            }
        }
    }
}
