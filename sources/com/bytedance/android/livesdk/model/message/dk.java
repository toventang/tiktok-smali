package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class dk implements b<w> {
    static {
        Covode.recordClassIndex(11599);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ w a(f fVar) {
        w wVar = new w();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return wVar;
            } else if (b2 == 1) {
                wVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                wVar.f19697a = r.b(fVar);
            } else if (b2 == 3) {
                wVar.f19698f = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                wVar.f19699g = g.a(fVar);
            }
        }
    }
}
