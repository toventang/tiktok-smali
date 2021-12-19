package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class bf implements b<e> {
    static {
        Covode.recordClassIndex(11337);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        return b(fVar);
    }

    public static e b(f fVar) {
        e eVar = new e();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        eVar.f19050a = (int) fVar.f();
                        break;
                    case 2:
                        eVar.f19051b = fVar.f();
                        break;
                    case 3:
                        eVar.f19052c = fVar.f();
                        break;
                    case 4:
                        eVar.f19053d = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f19054e = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f19055f = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f19056g = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f19057h = fVar.f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f19058i = fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f19059j = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f19060k = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f19061l = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        eVar.f19062m = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return eVar;
            }
        }
    }
}
