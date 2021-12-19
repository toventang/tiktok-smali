package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bg implements b<g> {
    static {
        Covode.recordClassIndex(11338);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ g a(f fVar) {
        return b(fVar);
    }

    public static g b(f fVar) {
        g gVar = new g();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return gVar;
            } else if (b2 == 1) {
                gVar.f19065a = fVar.d();
            } else if (b2 == 2) {
                gVar.f19066b = fVar.d();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                gVar.f19067c = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
