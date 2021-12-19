package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.b.u;
import com.bytedance.android.livesdk.model.message.b.v;
import com.bytedance.android.livesdk.model.message.b.w;
import com.bytedance.android.livesdk.model.message.b.x;
import com.bytedance.android.livesdk.model.message.b.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class ef implements b<ao> {
    static {
        Covode.recordClassIndex(11626);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ao a(f fVar) {
        ao aoVar = new ao();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aoVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        aoVar.f19174a = fVar.e();
                        break;
                    case 3:
                        aoVar.f19175f = v.b(fVar);
                        break;
                    case 4:
                        aoVar.f19176g = z.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aoVar.f19177h = w.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aoVar.f19178i = u.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aoVar.f19179j = x.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aoVar;
            }
        }
    }
}
