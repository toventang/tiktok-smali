package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class aj implements b<q> {
    static {
        Covode.recordClassIndex(13703);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ q a(f fVar) {
        q qVar = new q();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return qVar;
            } else if (b2 == 1) {
                qVar.f23171a = fVar.e();
            } else if (b2 == 2) {
                qVar.f23172b = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                qVar.f23173c = fVar.d();
            }
        }
    }
}
