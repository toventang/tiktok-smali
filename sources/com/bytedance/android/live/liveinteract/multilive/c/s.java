package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.chatroom.model.b.i;
import com.bytedance.covode.number.Covode;

public final class s implements b<g> {
    static {
        Covode.recordClassIndex(6421);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ g a(f fVar) {
        g gVar = new g();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return gVar;
            } else if (b2 == 1) {
                gVar.f11760a.add(i.b(fVar));
            } else if (b2 == 2) {
                gVar.f11761b.add(i.b(fVar));
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                gVar.f11762c.add(i.b(fVar));
            }
        }
    }
}
