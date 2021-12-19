package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cn implements b<ba> {
    static {
        Covode.recordClassIndex(11372);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ba a(f fVar) {
        return b(fVar);
    }

    public static ba b(f fVar) {
        ba baVar = new ba();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return baVar;
            } else if (b2 == 1) {
                baVar.f19029a = g.a(fVar);
            } else if (b2 == 2) {
                baVar.f19030b = g.a(fVar);
            } else if (b2 == 3) {
                baVar.f19031c = g.a(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                baVar.f19032d = fVar.f();
            }
        }
    }
}
