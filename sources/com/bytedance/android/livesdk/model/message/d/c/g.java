package com.bytedance.android.livesdk.model.message.d.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.livesdk.model.bz;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class g implements b<b> {
    static {
        Covode.recordClassIndex(11560);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        return b(fVar);
    }

    public static b b(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        bVar.f19513a = (int) fVar.f();
                        break;
                    case 2:
                        bVar.f19514b = fVar.d();
                        break;
                    case 3:
                        bVar.f19515c = fVar.d();
                        break;
                    case 4:
                        bVar.f19516d = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f19517e = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f19518f = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f19519g = f.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bVar.f19520h = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f19521i = fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bVar.f19522j = bz.b(fVar);
                        break;
                    default:
                        com.bytedance.android.e.a.a.g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return bVar;
            }
        }
    }
}
