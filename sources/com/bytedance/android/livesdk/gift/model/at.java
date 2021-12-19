package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;

public final class at implements b<x.b> {
    static {
        Covode.recordClassIndex(9953);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x.b a(f fVar) {
        return b(fVar);
    }

    public static x.b b(f fVar) {
        x.b bVar = new x.b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                bVar.f17972a = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
