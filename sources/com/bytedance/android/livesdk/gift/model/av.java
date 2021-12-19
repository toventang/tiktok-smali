package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;

public final class av implements b<x.a.C0373a> {
    static {
        Covode.recordClassIndex(9955);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x.a.C0373a a(f fVar) {
        return b(fVar);
    }

    public static x.a.C0373a b(f fVar) {
        x.a.C0373a aVar = new x.a.C0373a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aVar;
            } else if (b2 == 1) {
                aVar.f17968a = fVar.d();
            } else if (b2 == 2) {
                aVar.f17969b = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 3) {
                aVar.f17970c = (int) fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                aVar.f17971d = fVar.e();
            }
        }
    }
}
