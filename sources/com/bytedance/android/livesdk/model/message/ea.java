package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.al;
import com.bytedance.covode.number.Covode;

public final class ea implements b<al.b> {
    static {
        Covode.recordClassIndex(11621);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ al.b a(f fVar) {
        return b(fVar);
    }

    public static al.b b(f fVar) {
        al.b bVar = new al.b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                bVar.f19158a = fVar.d();
            }
        }
    }
}
