package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ce implements b<ar> {
    static {
        Covode.recordClassIndex(11363);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ar a(f fVar) {
        return b(fVar);
    }

    public static ar b(f fVar) {
        ar arVar = new ar();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return arVar;
            } else if (b2 == 1) {
                arVar.f18987a = fVar.d();
            } else if (b2 == 2) {
                arVar.f18988b = fVar.d();
            } else if (b2 == 3) {
                arVar.f18990d = fVar.d();
            } else if (b2 == 4) {
                arVar.f18991e = fVar.d();
            } else if (b2 != 5) {
                g.c(fVar);
            } else {
                arVar.f18989c = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
