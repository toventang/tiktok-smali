package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class h implements b<a> {
    static {
        Covode.recordClassIndex(9856);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f17725a = g.a(fVar);
            } else if (b2 == 2) {
                aVar.f17727c = i.b(fVar);
            } else if (b2 == 3) {
                aVar.f17726b = com.bytedance.android.livesdk.wallet.h.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f17728d = fVar.e();
            }
        }
    }
}
