package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.e;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class ch implements b<av> {
    static {
        Covode.recordClassIndex(11366);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ av a(f fVar) {
        return b(fVar);
    }

    public static av b(f fVar) {
        av avVar = new av();
        ArrayList arrayList = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        avVar.f19006h = g.b(fVar);
                        break;
                    case 2:
                        avVar.f18999a = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 3:
                        avVar.f19005g = (int) g.b(fVar);
                        break;
                    case 4:
                        arrayList.add(Integer.valueOf((int) g.b(fVar)));
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        avVar.f19001c = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        avVar.f19000b = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        avVar.f19002d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        avVar.f19003e = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        avVar.f19011m = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        avVar.f19010l = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        avVar.f19007i = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        avVar.f19009k = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        avVar.f19008j = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        avVar.n = (int) g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                avVar.f19004f = e.a(arrayList);
                return avVar;
            }
        }
    }
}
