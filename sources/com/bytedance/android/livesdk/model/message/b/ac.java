package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class ac implements b<j> {
    static {
        Covode.recordClassIndex(11428);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ j a(f fVar) {
        return b(fVar);
    }

    public static j b(f fVar) {
        j jVar = new j();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        jVar.f19272b = fVar.f();
                        break;
                    case 2:
                        jVar.f19273c = fVar.f();
                        break;
                    case 3:
                        jVar.f19274d = (int) fVar.f();
                        break;
                    case 4:
                        jVar.f19271a = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        jVar.f19275e = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        jVar.f19276f = fVar.e();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return jVar;
            }
        }
    }
}
