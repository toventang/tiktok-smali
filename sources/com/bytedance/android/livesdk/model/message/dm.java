package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.model.bw;
import com.bytedance.android.livesdk.model.bx;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class dm implements b<y> {
    static {
        Covode.recordClassIndex(11601);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ y a(f fVar) {
        y yVar = new y();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return yVar;
            } else if (b2 == 13) {
                yVar.f19710l = fVar.f();
            } else if (b2 == 15) {
                yVar.t = bx.b(fVar);
            } else if (b2 == 21) {
                yVar.u = bw.b(fVar);
            } else if (b2 != 23) {
                switch (b2) {
                    case 1:
                        yVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        continue;
                    case 2:
                        yVar.f19707i = fVar.f();
                        continue;
                    case 3:
                        yVar.f19709k = (int) fVar.f();
                        continue;
                    case 4:
                        yVar.o = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        yVar.f19708j = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        yVar.n = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        yVar.f19705g = j.b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        yVar.f19706h = j.b(fVar);
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        yVar.f19711m = fVar.e();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        yVar.q = ge.b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        yVar.p = fVar.f();
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                yVar.w = dn.b(fVar);
            }
        }
    }
}
