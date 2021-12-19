package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class au implements b<x.c> {
    static {
        Covode.recordClassIndex(9954);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ x.c a(f fVar) {
        return b(fVar);
    }

    public static x.c b(f fVar) {
        x.c cVar = new x.c();
        cVar.f17974b = new ArrayList();
        cVar.f17975c = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 1) {
                cVar.f17973a = fVar.e();
            } else if (b2 == 2) {
                cVar.f17974b.add(aw.b(fVar));
            } else if (b2 == 3) {
                cVar.f17975c.add(at.b(fVar));
            } else if (b2 == 4) {
                cVar.f17976d = fVar.e();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                cVar.f17977e = fVar.d();
            }
        }
    }
}
