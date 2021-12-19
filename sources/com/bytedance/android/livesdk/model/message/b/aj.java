package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class aj implements b<q> {
    static {
        Covode.recordClassIndex(11435);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ q a(f fVar) {
        return b(fVar);
    }

    public static q b(f fVar) {
        q qVar = new q();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return qVar;
            } else if (b2 == 1) {
                qVar.f19295a = g.a(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                qVar.f19296b = fVar.e();
            }
        }
    }
}
