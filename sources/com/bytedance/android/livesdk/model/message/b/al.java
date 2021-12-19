package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class al implements b<s> {
    static {
        Covode.recordClassIndex(11437);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ s a(f fVar) {
        return b(fVar);
    }

    public static s b(f fVar) {
        s sVar = new s((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return sVar;
            } else if (b2 == 1) {
                sVar.f19299a = Long.valueOf(fVar.f());
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                sVar.f19300b = ag.b(fVar);
            }
        }
    }
}
