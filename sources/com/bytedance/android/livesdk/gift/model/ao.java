package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class ao implements b<q> {
    static {
        Covode.recordClassIndex(9948);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ q a(f fVar) {
        return b(fVar);
    }

    public static q b(f fVar) {
        q qVar = new q();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        qVar.f17932f = r.b(fVar);
                        break;
                    case 2:
                        qVar.f17933g = fVar.d();
                        break;
                    case 3:
                        qVar.f17934h = Long.valueOf(fVar.f());
                        break;
                    case 4:
                        qVar.f17935i = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        qVar.f17936j = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        qVar.f17937k = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        qVar.f17938l = Long.valueOf(fVar.f());
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return qVar;
            }
        }
    }
}
