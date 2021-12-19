package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class bp implements b<o> {
    static {
        Covode.recordClassIndex(11347);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ o a(f fVar) {
        return b(fVar);
    }

    public static o b(f fVar) {
        o oVar = new o();
        oVar.f19731a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        oVar.f19731a.add(bq.b(fVar));
                        break;
                    case 2:
                        oVar.f19732b = (int) g.b(fVar);
                        break;
                    case 3:
                        oVar.f19733c = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 4:
                        oVar.f19734d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        oVar.f19735e = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        oVar.f19736f = (int) g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return oVar;
            }
        }
    }
}
