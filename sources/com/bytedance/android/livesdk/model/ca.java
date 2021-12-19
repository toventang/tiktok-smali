package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ca implements b<ai> {
    static {
        Covode.recordClassIndex(11359);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ai a(f fVar) {
        return b(fVar);
    }

    public static ai b(f fVar) {
        ai aiVar = new ai();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return aiVar;
            } else if (b2 == 1) {
                aiVar.f18941a = Integer.valueOf(fVar.e());
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                aiVar.f18942b = Integer.valueOf(fVar.e());
            }
        }
    }
}
