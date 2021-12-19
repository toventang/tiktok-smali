package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class gf implements b<ci> {
    static {
        Covode.recordClassIndex(11680);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ci a(f fVar) {
        ci ciVar = new ci();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ciVar;
            } else if (b2 == 1) {
                ciVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                ciVar.f19492a = fVar.d();
            } else if (b2 == 3) {
                ciVar.f19493f = fVar.f();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                ciVar.f19494g = fVar.f();
            }
        }
    }
}
