package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.bt;
import com.bytedance.covode.number.Covode;

public final class fo implements b<bt.a> {
    static {
        Covode.recordClassIndex(11662);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bt.a a(f fVar) {
        return b(fVar);
    }

    public static bt.a b(f fVar) {
        bt.a aVar = new bt.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19364a = fVar.f();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                aVar.f19365b = g.a(fVar);
            }
        }
    }
}
