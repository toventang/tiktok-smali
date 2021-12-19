package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class o implements b<f> {
    static {
        Covode.recordClassIndex(8626);
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
            } else if (b2 == 1) {
                fVar2.f15602a = fVar.f();
            } else if (b2 == 2) {
                fVar2.f15603b = fVar.e();
            } else if (b2 == 5) {
                fVar2.f15605d = g.a(fVar);
            } else if (b2 == 6) {
                fVar2.f15604c = fVar.d();
            } else if (b2 == 7) {
                fVar2.f15607f = fVar.d();
            } else if (b2 != 8) {
                g.c(fVar);
            } else {
                fVar2.f15606e = g.a(fVar);
            }
        }
    }
}
