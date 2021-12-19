package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class eo implements b<az.a> {
    static {
        Covode.recordClassIndex(11635);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ az.a a(f fVar) {
        return b(fVar);
    }

    public static az.a b(f fVar) {
        az.a aVar = new az.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19242a = (int) fVar.f();
            } else if (b2 == 2) {
                aVar.f19243b = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 4) {
                aVar.f19244c = r.b(fVar);
            } else if (b2 != 8) {
                g.c(fVar);
            } else {
                aVar.f19245d = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
