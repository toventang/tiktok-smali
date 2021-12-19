package com.bytedance.android.livesdk.model.message.d.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class f implements b<a> {
    static {
        Covode.recordClassIndex(11559);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static a b(com.bytedance.android.e.a.a.f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f19510a = fVar.d();
            } else if (b2 == 2) {
                aVar.f19511b = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                aVar.f19512c = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
