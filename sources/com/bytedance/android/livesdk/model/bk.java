package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bk implements b<j> {
    static {
        Covode.recordClassIndex(11342);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ j a(f fVar) {
        return b(fVar);
    }

    public static j b(f fVar) {
        j jVar = new j();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return jVar;
            } else if (b2 == 1) {
                jVar.f19085a = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 2) {
                jVar.f19086b = fVar.f();
            } else if (b2 == 3) {
                jVar.f19087c = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                jVar.f19088d = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
