package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;

public final class fz implements b<cc> {
    static {
        Covode.recordClassIndex(11673);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ cc a(f fVar) {
        cc ccVar = new cc();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return ccVar;
            } else if (b2 == 1) {
                ccVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                ccVar.f19464g = j.b(fVar);
            } else if (b2 == 3) {
                ccVar.f19465h = (int) fVar.f();
            } else if (b2 == 4) {
                ccVar.f19463f = fVar.d();
            } else if (b2 == 5) {
                ccVar.f19466i = (int) fVar.f();
            } else if (b2 == 8) {
                ccVar.f19467j = cu.b(fVar);
            } else if (b2 != 9) {
                g.c(fVar);
            } else {
                ccVar.f19468k = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
