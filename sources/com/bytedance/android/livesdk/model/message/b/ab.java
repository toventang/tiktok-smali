package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.a.t;
import com.bytedance.covode.number.Covode;

public final class ab implements b<i> {
    static {
        Covode.recordClassIndex(11427);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i a(f fVar) {
        return b(fVar);
    }

    public static i b(f fVar) {
        i iVar = new i((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return iVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                iVar.f19270a = t.b(fVar);
            }
        }
    }
}
