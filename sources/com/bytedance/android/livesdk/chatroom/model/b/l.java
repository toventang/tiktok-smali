package com.bytedance.android.livesdk.chatroom.model.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class l implements b<g> {
    static {
        Covode.recordClassIndex(8688);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ g a(f fVar) {
        g gVar = new g();
        gVar.f15736a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return gVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                gVar.f15736a.add(j.b(fVar));
            }
        }
    }
}
