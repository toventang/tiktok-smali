package com.bytedance.android.livesdk.model.message.e;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class c implements b<a> {
    static {
        Covode.recordClassIndex(11619);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.f19605a = fVar.d();
                        break;
                    case 2:
                        aVar.f19606b = Integer.valueOf(fVar.e());
                        break;
                    case 3:
                        aVar.f19607c = fVar.d();
                        break;
                    case 4:
                        aVar.f19608d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19609e = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19610f = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f19611g = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f19612h = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f19613i = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f19614j = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aVar;
            }
        }
    }
}
