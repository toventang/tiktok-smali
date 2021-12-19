package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdkapi.depend.model.live.a.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class ai implements b<p> {
    static {
        Covode.recordClassIndex(13702);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ p a(f fVar) {
        return b(fVar);
    }

    public static p b(f fVar) {
        p pVar = new p();
        pVar.f23167c = new ArrayList();
        pVar.f23168d = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return pVar;
            } else if (b2 == 1) {
                pVar.f23165a = g.b(fVar);
            } else if (b2 == 5) {
                pVar.f23166b = g.b(fVar);
            } else if (b2 != 6) {
                switch (b2) {
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        pVar.f23167c.add(j.b(fVar));
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        pVar.f23169e = r.b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        pVar.f23170f = g.b(fVar);
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                pVar.f23168d.add(Long.valueOf(g.b(fVar)));
            }
        }
    }
}
