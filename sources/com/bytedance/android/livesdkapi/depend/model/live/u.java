package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class u implements b<a> {
    static {
        Covode.recordClassIndex(13732);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f23047a = fVar.f();
            } else if (b2 == 2) {
                aVar.f23048b = fVar.f();
            } else if (b2 == 3) {
                aVar.f23049c = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f23050d = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
