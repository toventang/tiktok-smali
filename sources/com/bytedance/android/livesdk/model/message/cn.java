package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.bj;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class cn implements b<c.a> {
    static {
        Covode.recordClassIndex(11535);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c.a a(f fVar) {
        return b(fVar);
    }

    public static c.a b(f fVar) {
        c.a aVar = new c.a();
        aVar.f19412b = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.f19411a = fVar.d();
                        break;
                    case 2:
                        aVar.f19412b.add(bj.b(fVar));
                        break;
                    case 3:
                        aVar.f19413c = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 4:
                        aVar.f19414d = cm.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19415e = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19416f = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f19417g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f19418h = Long.valueOf(g.b(fVar));
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
