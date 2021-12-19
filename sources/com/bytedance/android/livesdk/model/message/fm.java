package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class fm implements b<bs> {
    static {
        Covode.recordClassIndex(11660);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bs a(f fVar) {
        return b(fVar);
    }

    public static bs b(f fVar) {
        bs bsVar = new bs();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        bsVar.f19357a = fVar.f();
                        break;
                    case 2:
                        bsVar.f19358b = fVar.f();
                        break;
                    case 3:
                        bsVar.f19359c = r.b(fVar);
                        break;
                    case 4:
                        bsVar.f19360d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bsVar.f19361e = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bsVar.f19362f = (int) fVar.f();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return bsVar;
            }
        }
    }
}
