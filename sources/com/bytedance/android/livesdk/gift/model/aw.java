package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;

public final class aw implements b<x.a> {
    static {
        Covode.recordClassIndex(9956);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x.a a(f fVar) {
        return b(fVar);
    }

    public static x.a b(f fVar) {
        x.a aVar = new x.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f17964b = fVar.e();
            } else if (b2 == 2) {
                aVar.f17963a = fVar.f();
            } else if (b2 == 3) {
                aVar.f17965c = (int) fVar.f();
            } else if (b2 == 4) {
                aVar.f17966d = (int) fVar.f();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                aVar.f17967e = av.b(fVar);
            }
        }
    }
}
