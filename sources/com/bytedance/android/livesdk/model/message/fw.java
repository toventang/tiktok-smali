package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class fw implements b<bz> {
    static {
        Covode.recordClassIndex(11670);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bz a(f fVar) {
        bz bzVar = new bz();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bzVar;
            } else if (b2 == 1) {
                bzVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
            } else if (b2 == 3) {
                bzVar.f19396f = fVar.d();
            } else if (b2 == 6) {
                bzVar.f19399i = fVar.d();
            } else if (b2 == 7) {
                bzVar.f19400j = String.valueOf(fVar.f());
            } else if (b2 != 8) {
                switch (b2) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bzVar.n = com.bytedance.android.live.base.model.f.b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        bzVar.f19403m = dg.b(fVar);
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        bzVar.o = fVar.d();
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                bzVar.f19401k = fVar.f();
            }
        }
    }
}
