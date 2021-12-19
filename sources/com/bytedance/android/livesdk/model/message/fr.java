package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class fr implements b<bw> {
    static {
        Covode.recordClassIndex(11665);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bw a(f fVar) {
        bw bwVar = new bw();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        bwVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        bwVar.f19376a = fVar.d();
                        break;
                    case 3:
                        bwVar.f19377f = fVar.d();
                        break;
                    case 4:
                        bwVar.f19378g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bwVar.f19379h = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bwVar.f19380i = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bwVar.f19381j = String.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bwVar.f19382k = fVar.f();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return bwVar;
            }
        }
    }
}
