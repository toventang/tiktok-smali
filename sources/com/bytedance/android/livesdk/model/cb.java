package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class cb implements b<al> {
    static {
        Covode.recordClassIndex(11360);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ al a(f fVar) {
        return b(fVar);
    }

    public static al b(f fVar) {
        al alVar = new al();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        alVar.f18959a = Long.valueOf(fVar.f());
                        break;
                    case 2:
                        alVar.f18960b = Long.valueOf(fVar.f());
                        break;
                    case 3:
                        alVar.f18961c = Long.valueOf(fVar.f());
                        break;
                    case 4:
                        alVar.f18962d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        alVar.f18963e = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        alVar.f18964f = Boolean.valueOf(g.a(fVar));
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        alVar.f18965g = Boolean.valueOf(g.a(fVar));
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return alVar;
            }
        }
    }
}
