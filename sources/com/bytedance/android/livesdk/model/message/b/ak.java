package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class ak implements b<r> {
    static {
        Covode.recordClassIndex(11436);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ r a(f fVar) {
        return b(fVar);
    }

    public static r b(f fVar) {
        r rVar = new r((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return rVar;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                rVar.f19297a = Long.valueOf(fVar.f());
            }
        }
    }
}
