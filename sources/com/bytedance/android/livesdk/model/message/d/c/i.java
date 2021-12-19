package com.bytedance.android.livesdk.model.message.d.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class i implements b<d> {
    static {
        Covode.recordClassIndex(11562);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        d dVar = new d();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        dVar.f19535a = (int) fVar.f();
                        break;
                    case 2:
                        dVar.f19536b = (int) fVar.f();
                        break;
                    case 3:
                        dVar.f19537c = (int) fVar.f();
                        break;
                    case 4:
                        dVar.f19538d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        dVar.f19539e = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        dVar.f19540f = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        dVar.f19541g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        dVar.f19542h = g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return dVar;
            }
        }
    }
}
