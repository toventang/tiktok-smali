package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class n implements b<a> {
    static {
        Covode.recordClassIndex(13682);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a((byte) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f23051a = Long.valueOf(fVar.f());
            } else if (b2 == 2) {
                aVar.f23052b = fVar.d();
            } else if (b2 == 3) {
                aVar.f23054d = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f23053c = fVar.d();
            }
        }
    }
}
