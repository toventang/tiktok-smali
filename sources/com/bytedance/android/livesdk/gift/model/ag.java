package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class ag implements b<h> {
    static {
        Covode.recordClassIndex(9940);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ h a(f fVar) {
        return b(fVar);
    }

    public static h b(f fVar) {
        h hVar = new h();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        hVar.f17884a = fVar.f();
                        break;
                    case 2:
                        hVar.f17885b = fVar.d();
                        break;
                    case 3:
                        hVar.f17886c = fVar.f();
                        break;
                    case 4:
                        hVar.f17887d = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        hVar.f17888e = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        hVar.f17889f = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        hVar.f17890g = Boolean.valueOf(g.a(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        hVar.f17891h = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        hVar.f17892i = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return hVar;
            }
        }
    }
}
