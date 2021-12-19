package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.a.v;
import com.bytedance.covode.number.Covode;

public final class ai implements b<p> {
    static {
        Covode.recordClassIndex(11434);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ p a(f fVar) {
        return b(fVar);
    }

    public static p b(f fVar) {
        p pVar = new p((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return pVar;
            } else if (b2 == 1) {
                pVar.f19293a = Long.valueOf(fVar.f());
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                pVar.f19294b = v.b(fVar);
            }
        }
    }
}
