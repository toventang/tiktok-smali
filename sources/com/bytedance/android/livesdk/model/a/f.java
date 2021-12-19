package com.bytedance.android.livesdk.model.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class f implements b<b> {
    static {
        Covode.recordClassIndex(11299);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static b b(com.bytedance.android.e.a.a.f fVar) {
        b bVar = new b((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                bVar.f18938a = (int) fVar.f();
            }
        }
    }
}
