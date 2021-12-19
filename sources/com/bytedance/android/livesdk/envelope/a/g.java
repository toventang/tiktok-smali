package com.bytedance.android.livesdk.envelope.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class g implements b<a> {
    static {
        Covode.recordClassIndex(9515);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.f17131a = fVar.d();
                        break;
                    case 2:
                        aVar.f17132b = Integer.valueOf(fVar.e());
                        break;
                    case 3:
                        aVar.f17133c = fVar.d();
                        break;
                    case 4:
                        aVar.f17134d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f17135e = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f17136f = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f17137g = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f17138h = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f17139i = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    default:
                        com.bytedance.android.e.a.a.g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aVar;
            }
        }
    }
}
