package com.bytedance.android.livesdkapi.h;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class f implements b<b> {
    static {
        Covode.recordClassIndex(13776);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(com.bytedance.android.e.a.a.f fVar) {
        return b(fVar);
    }

    public static b b(com.bytedance.android.e.a.a.f fVar) {
        b bVar = new b();
        bVar.f23221m = new ArrayList();
        bVar.f23216h = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 11) {
                bVar.f23220l = g.b(fVar);
            } else if (b2 != 17) {
                switch (b2) {
                    case 1:
                        bVar.f23213e = fVar.d();
                        continue;
                    case 2:
                        bVar.f23212d = g.b(fVar);
                        continue;
                    case 3:
                        bVar.f23211c = g.b(fVar);
                        continue;
                    case 4:
                        bVar.f23209a = g.b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bVar.f23217i = fVar.e();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f23215g = g.a(fVar);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f23214f = fVar.d();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        bVar.f23218j = r.b(fVar);
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f23219k = g.b(fVar);
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                bVar.f23221m.add(fVar.d());
            }
        }
    }
}
