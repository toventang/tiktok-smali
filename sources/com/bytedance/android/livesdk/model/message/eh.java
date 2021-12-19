package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.b.ab;
import com.bytedance.android.livesdk.model.message.b.ad;
import com.bytedance.android.livesdk.model.message.b.ae;
import com.bytedance.android.livesdk.model.message.b.af;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class eh implements b<aq> {
    static {
        Covode.recordClassIndex(11628);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ aq a(f fVar) {
        aq aqVar = new aq();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aqVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        aqVar.f19185a = fVar.e();
                        break;
                    case 3:
                        aqVar.f19186f = ae.b(fVar);
                        break;
                    case 4:
                        aqVar.f19187g = af.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aqVar.f19188h = ad.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aqVar.f19189i = ab.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aqVar;
            }
        }
    }
}
