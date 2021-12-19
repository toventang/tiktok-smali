package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class cs implements b<f> {
    static {
        Covode.recordClassIndex(11540);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ f a(f fVar) {
        return b(fVar);
    }

    public static f b(f fVar) {
        f fVar2 = new f();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return fVar2;
            } else if (b2 == 1) {
                fVar2.f19618a = fVar.f();
            } else if (b2 == 2) {
                fVar2.f19619b = fVar.e();
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                fVar2.f19620c = fVar.f();
            }
        }
    }
}
