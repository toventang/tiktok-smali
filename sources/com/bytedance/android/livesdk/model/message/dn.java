package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class dn implements b<z> {
    static {
        Covode.recordClassIndex(11602);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ z a(f fVar) {
        return b(fVar);
    }

    public static z b(f fVar) {
        z zVar = new z();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        zVar.f19712a = fVar.f();
                        break;
                    case 2:
                        zVar.f19713b = fVar.f();
                        break;
                    case 3:
                        zVar.f19714c = fVar.f();
                        break;
                    case 4:
                        zVar.f19715d = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        zVar.f19716e = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        zVar.f19717f = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        zVar.f19718g = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        zVar.f19719h = fVar.f();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return zVar;
            }
        }
    }
}
