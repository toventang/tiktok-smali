package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.covode.number.Covode;

public final class da implements b<n.a> {
    static {
        Covode.recordClassIndex(11589);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ n.a a(f fVar) {
        return b(fVar);
    }

    public static n.a b(f fVar) {
        n.a aVar = new n.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19659a = fVar.d();
            } else if (b2 == 2) {
                aVar.f19660b = fVar.f();
            } else if (b2 == 3) {
                aVar.f19661c = r.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f19662d = r.b(fVar);
            }
        }
    }
}
