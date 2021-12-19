package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.al;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;

public final class t implements b<i> {
    static {
        Covode.recordClassIndex(8631);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i a(f fVar) {
        i iVar = new i();
        iVar.f15623b = new ArrayList();
        iVar.f15622a = new ArrayList();
        iVar.f15624c = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return iVar;
            } else if (b2 == 1) {
                iVar.f15622a.add(al.b(fVar));
            } else if (b2 == 8) {
                iVar.f15625d = s.b(fVar);
            } else if (b2 == 3) {
                iVar.f15623b.add(al.b(fVar));
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                long a3 = fVar.a();
                Long l2 = null;
                h hVar = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        l2 = Long.valueOf(g.b(fVar));
                    } else if (b3 == 2) {
                        hVar = p.b(fVar);
                    }
                }
                fVar.a(a3);
                if (l2 == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (hVar != null) {
                    iVar.f15624c.put(l2, hVar);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
