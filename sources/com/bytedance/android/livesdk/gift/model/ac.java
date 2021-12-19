package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ac implements b<d> {
    static {
        Covode.recordClassIndex(9936);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        return b(fVar);
    }

    public static d b(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return dVar;
            } else if (b2 == 1) {
                dVar.f17874d = Integer.valueOf(fVar.e());
            } else if (b2 == 2) {
                dVar.f17875e = Integer.valueOf(fVar.e());
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                dVar.f17876f = Long.valueOf(fVar.f());
            }
        }
    }
}
