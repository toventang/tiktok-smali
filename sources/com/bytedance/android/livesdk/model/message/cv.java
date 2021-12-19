package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class cv implements b<i> {
    static {
        Covode.recordClassIndex(11543);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i a(f fVar) {
        i iVar = new i();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        iVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        iVar.f19630g = j.b(fVar);
                        break;
                    case 3:
                        iVar.f19629f = fVar.d();
                        break;
                    case 4:
                        iVar.f19631h = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        iVar.f19632i = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        iVar.f19633j = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return iVar;
            }
        }
    }
}
