package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.ck;
import com.bytedance.covode.number.Covode;

public final class gh implements b<ck.a> {
    static {
        Covode.recordClassIndex(11682);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ck.a a(f fVar) {
        return b(fVar);
    }

    public static ck.a b(f fVar) {
        ck.a aVar = new ck.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19499a = fVar.f();
            } else if (b2 == 2) {
                aVar.f19500b = fVar.f();
            } else if (b2 == 3) {
                aVar.f19501c = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f19502d = fVar.d();
            }
        }
    }
}
