package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cu implements b<h> {
    static {
        Covode.recordClassIndex(11542);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ h a(f fVar) {
        return b(fVar);
    }

    public static h b(f fVar) {
        h hVar = new h();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return hVar;
            } else if (b2 == 1) {
                hVar.f19626a = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                hVar.f19627b = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
