package com.bytedance.android.livesdkapi.h;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.covode.number.Covode;

public final class g implements b<e.a> {
    static {
        Covode.recordClassIndex(13777);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e.a a(f fVar) {
        return b(fVar);
    }

    public static e.a b(f fVar) {
        e.a aVar = new e.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f23235a = fVar.d();
            } else if (b2 == 2) {
                aVar.f23236b = fVar.c();
            } else if (b2 == 3) {
                aVar.f23237c = fVar.f();
            } else if (b2 != 4) {
                com.bytedance.android.e.a.a.g.c(fVar);
            } else {
                aVar.f23238d = fVar.e();
            }
        }
    }
}
