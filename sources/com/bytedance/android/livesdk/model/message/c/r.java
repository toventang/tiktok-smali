package com.bytedance.android.livesdk.model.message.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class r implements b<b> {
    static {
        Covode.recordClassIndex(11519);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        return b(fVar);
    }

    public static b b(f fVar) {
        b bVar = new b();
        bVar.f19424d = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 1) {
                bVar.f19421a = fVar.d();
            } else if (b2 == 2) {
                bVar.f19422b = fVar.d();
            } else if (b2 == 3) {
                bVar.f19423c = k.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                bVar.f19424d.add(q.b(fVar));
            }
        }
    }
}
