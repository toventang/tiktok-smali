package com.ss.android.ugc.aweme.ecommercelive.business.common.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class h implements b<d> {
    static {
        Covode.recordClassIndex(55307);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        return b(fVar);
    }

    public static d b(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        dVar.f87963a = fVar.d();
                        break;
                    case 2:
                        dVar.f87964f = fVar.d();
                        break;
                    case 3:
                        dVar.f87965g = fVar.d();
                        break;
                    case 4:
                        dVar.f87966h = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        dVar.f87967i = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        dVar.f87968j = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        dVar.f87969k = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        dVar.f87970l = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        dVar.f87971m = fVar.d();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        dVar.n = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        dVar.o = (int) fVar.f();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return dVar;
            }
        }
    }
}
