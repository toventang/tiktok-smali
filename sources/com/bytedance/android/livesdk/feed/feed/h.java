package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class h implements b<f> {
    static {
        Covode.recordClassIndex(9685);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ f a(f fVar) {
        f fVar2 = new f();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return fVar2;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                fVar2.f17476a = fVar.d();
            }
        }
    }
}
