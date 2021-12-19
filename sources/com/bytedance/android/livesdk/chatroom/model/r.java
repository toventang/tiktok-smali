package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class r implements b<m> {
    static {
        Covode.recordClassIndex(8713);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        m mVar = new m();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return mVar;
            } else if (b2 == 5) {
                mVar.f15793b = fVar.f();
            } else if (b2 == 6) {
                mVar.f15792a = fVar.d();
            } else if (b2 != 7) {
                g.c(fVar);
            } else {
                mVar.f15794c = fVar.d();
            }
        }
    }
}
