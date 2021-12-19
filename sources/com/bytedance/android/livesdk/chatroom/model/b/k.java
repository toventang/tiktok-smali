package com.bytedance.android.livesdk.chatroom.model.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class k implements b<f> {
    static {
        Covode.recordClassIndex(8687);
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
            } else if (b2 == 3) {
                fVar2.f15732b = g.a(fVar);
            } else if (b2 == 4) {
                fVar2.f15733c = fVar.e();
            } else if (b2 == 5) {
                fVar2.f15735e = fVar.d();
            } else if (b2 == 15) {
                fVar2.f15731a = fVar.d();
            } else if (b2 != 17) {
                g.c(fVar);
            } else {
                fVar2.f15734d = fVar.d();
            }
        }
    }
}
