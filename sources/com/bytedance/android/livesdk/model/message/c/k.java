package com.bytedance.android.livesdk.model.message.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class k implements b<c> {
    static {
        Covode.recordClassIndex(11512);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        return b(fVar);
    }

    public static c b(f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        cVar.f19425a = fVar.d();
                        break;
                    case 2:
                        cVar.f19428d = Boolean.valueOf(g.a(fVar));
                        break;
                    case 3:
                        cVar.f19426b = g.a(fVar);
                        break;
                    case 4:
                        cVar.f19427c = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f19429e = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f19430f = Integer.valueOf(fVar.e());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f19431g = Boolean.valueOf(g.a(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f19432h = Boolean.valueOf(g.a(fVar));
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
