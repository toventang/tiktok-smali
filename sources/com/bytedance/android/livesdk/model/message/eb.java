package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.al;
import com.bytedance.covode.number.Covode;

public final class eb implements b<al.c> {
    static {
        Covode.recordClassIndex(11622);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ al.c a(f fVar) {
        return b(fVar);
    }

    public static al.c b(f fVar) {
        al.c cVar = new al.c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 1) {
                cVar.f19159a = ea.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                cVar.f19160b = ea.b(fVar);
            }
        }
    }
}
