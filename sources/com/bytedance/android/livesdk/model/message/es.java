package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class es implements b<bc> {
    static {
        Covode.recordClassIndex(11639);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bc a(f fVar) {
        return b(fVar);
    }

    public static bc b(f fVar) {
        bc bcVar = new bc();
        bcVar.f19305b = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bcVar;
            } else if (b2 == 1) {
                bcVar.f19305b.add(er.b(fVar));
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                bcVar.f19304a = fVar.d();
            }
        }
    }
}
