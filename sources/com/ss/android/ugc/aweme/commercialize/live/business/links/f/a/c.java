package com.ss.android.ugc.aweme.commercialize.live.business.links.f.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class c implements b<a> {
    static {
        Covode.recordClassIndex(46016);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        aVar.f74625f = fVar.e();
                        break;
                    case 3:
                        aVar.f74626g = fVar.f();
                        break;
                    case 4:
                        aVar.f74627h = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        aVar.f74628i = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        aVar.f74629j = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        aVar.f74630k = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        aVar.f74631l = fVar.f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        aVar.f74632m = fVar.e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        aVar.n = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aVar;
            }
        }
    }
}
