package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class ag implements b<n> {
    static {
        Covode.recordClassIndex(11432);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ n a(f fVar) {
        return b(fVar);
    }

    public static n b(f fVar) {
        n nVar = new n();
        nVar.f19285b = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return nVar;
            } else if (b2 == 1) {
                nVar.f19285b.add(ah.b(fVar));
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                nVar.f19284a = (int) g.b(fVar);
            }
        }
    }
}
