package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class q implements b<d> {
    static {
        Covode.recordClassIndex(13685);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ d a(f fVar) {
        return b(fVar);
    }

    public static d b(f fVar) {
        d dVar = new d((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        dVar.f23066a = fVar.f();
                        break;
                    case 2:
                        dVar.f23067b = fVar.f();
                        break;
                    case 3:
                        dVar.f23068c = fVar.f();
                        break;
                    case 4:
                        dVar.f23069d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        dVar.f23070e = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        dVar.f23071f = fVar.d();
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
