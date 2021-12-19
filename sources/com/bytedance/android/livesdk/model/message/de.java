package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class de implements b<q> {
    static {
        Covode.recordClassIndex(11593);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ q a(f fVar) {
        q qVar = new q();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return qVar;
            } else if (b2 == 1) {
                qVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                qVar.f19670a = fVar.d();
            } else if (b2 == 3) {
                qVar.f19672g = fVar.d();
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                qVar.f19671f = fVar.f();
            }
        }
    }
}
