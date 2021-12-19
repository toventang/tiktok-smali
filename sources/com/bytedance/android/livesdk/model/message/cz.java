package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class cz implements b<m> {
    static {
        Covode.recordClassIndex(11547);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        return b(fVar);
    }

    public static m b(f fVar) {
        m mVar = new m();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return mVar;
            } else if (b2 == 1) {
                mVar.f19653b = fVar.f();
            } else if (b2 == 2) {
                mVar.f19652a = j.b(fVar);
            } else if (b2 == 3) {
                mVar.f19654c = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                mVar.f19655d = fVar.f();
            }
        }
    }
}
