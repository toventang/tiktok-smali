package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class af implements b<m> {
    static {
        Covode.recordClassIndex(11431);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        return b(fVar);
    }

    public static m b(f fVar) {
        m mVar = new m((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return mVar;
            } else if (b2 == 1) {
                mVar.f19281a = fVar.f();
            } else if (b2 == 2) {
                mVar.f19282b = fVar.f();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                mVar.f19283c = fVar.d();
            }
        }
    }
}
