package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class bv implements b<w> {
    static {
        Covode.recordClassIndex(11353);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ w a(f fVar) {
        return b(fVar);
    }

    public static w b(f fVar) {
        w wVar = new w();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return wVar;
            } else if (b2 == 1) {
                wVar.f19783b = r.b(fVar);
            } else if (b2 == 2) {
                wVar.f19782a = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                wVar.f19784c = fVar.d();
            }
        }
    }
}
