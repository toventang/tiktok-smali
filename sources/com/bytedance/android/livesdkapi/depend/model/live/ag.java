package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ag implements b<l> {
    static {
        Covode.recordClassIndex(13700);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ l a(f fVar) {
        l lVar = new l();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return lVar;
            } else if (b2 == 2) {
                lVar.f23151a = fVar.d();
            } else if (b2 == 3) {
                lVar.f23152b = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                lVar.f23153c = fVar.d();
            }
        }
    }
}
