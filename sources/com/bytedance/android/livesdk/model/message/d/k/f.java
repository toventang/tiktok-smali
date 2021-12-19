package com.bytedance.android.livesdk.model.message.d.k;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class f implements b<c> {
    static {
        Covode.recordClassIndex(11588);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static c b(com.bytedance.android.e.a.a.f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        cVar.f19590a = fVar.d();
                        break;
                    case 2:
                        cVar.f19591b = fVar.f();
                        break;
                    case 3:
                        cVar.f19592c = g.a(fVar);
                        break;
                    case 4:
                        cVar.f19593d = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f19594e = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f19595f = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f19596g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f19597h = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        cVar.f19598i = (int) fVar.f();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return cVar;
            }
        }
    }
}
