package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class j implements b<h> {
    static {
        Covode.recordClassIndex(12180);
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
                        hVar.f20607a = com.bytedance.android.live.base.model.user.j.b(fVar);
                        break;
                    case 2:
                        hVar.f20608b = fVar.f();
                        break;
                    case 3:
                        hVar.f20609c = (int) fVar.f();
                        break;
                    case 4:
                        hVar.f20610d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        hVar.f20611e = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        hVar.f20612f = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        hVar.f20613g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        hVar.f20614h = fVar.d();
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
