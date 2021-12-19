package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class h implements b<c> {
    static {
        Covode.recordClassIndex(13233);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        return b(fVar);
    }

    public static c b(f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 1) {
                cVar.f22405a = (int) fVar.f();
            } else if (b2 == 2) {
                cVar.f22406b = fVar.d();
            } else if (b2 == 3) {
                cVar.f22407c = String.valueOf(fVar.e());
            } else if (b2 == 5) {
                cVar.f22408d = fVar.e();
            } else if (b2 != 6) {
                g.c(fVar);
            } else {
                cVar.f22409e = fVar.e();
            }
        }
    }
}
