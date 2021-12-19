package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class x implements b<l> {
    static {
        Covode.recordClassIndex(13692);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ l a(f fVar) {
        return b(fVar);
    }

    public static l b(f fVar) {
        l lVar = new l((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return lVar;
            } else if (b2 == 1) {
                lVar.f23093a = fVar.f();
            } else if (b2 == 2) {
                lVar.f23094b = fVar.f();
            } else if (b2 == 11) {
                lVar.f23095c = t.b(fVar);
            } else if (b2 != 12) {
                g.c(fVar);
            } else {
                lVar.f23096d = t.b(fVar);
            }
        }
    }
}
