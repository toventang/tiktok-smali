package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class o implements b<b> {
    static {
        Covode.recordClassIndex(13683);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        return b(fVar);
    }

    public static b b(f fVar) {
        b bVar = new b((char) 0);
        bVar.f23056b = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 1) {
                bVar.f23055a = g.b(fVar);
            } else if (b2 == 2) {
                bVar.f23056b.add(w.b(fVar));
            } else if (b2 == 3) {
                bVar.f23057c = y.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                bVar.f23058d = x.b(fVar);
            }
        }
    }
}
