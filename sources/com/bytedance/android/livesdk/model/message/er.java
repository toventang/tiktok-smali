package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class er implements b<bb> {
    static {
        Covode.recordClassIndex(11638);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bb a(f fVar) {
        return b(fVar);
    }

    public static bb b(f fVar) {
        bb bbVar = new bb();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bbVar;
            } else if (b2 == 1) {
                bbVar.f19302a = fVar.d();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                bbVar.f19303b = g.a(fVar);
            }
        }
    }
}
