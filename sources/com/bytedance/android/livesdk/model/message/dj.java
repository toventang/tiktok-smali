package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class dj implements b<v> {
    static {
        Covode.recordClassIndex(11598);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ v a(f fVar) {
        v vVar = new v();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return vVar;
            } else if (b2 == 1) {
                vVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 2) {
                vVar.f19694a = fVar.f();
            } else if (b2 == 3) {
                vVar.f19695f = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                vVar.f19696g = fv.b(fVar);
            }
        }
    }
}
