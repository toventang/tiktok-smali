package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class cl implements b<a> {
    static {
        Covode.recordClassIndex(11533);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        aVar.f19109a = fVar.f();
                        break;
                    case 3:
                        aVar.f19110f = r.b(fVar);
                        break;
                    case 4:
                        aVar.f19111g = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19112h = g.a(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19113i = j.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f19114j = j.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f19115k = dl.b(fVar);
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
