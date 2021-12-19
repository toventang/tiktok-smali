package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.e;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class bl implements b<m> {
    static {
        Covode.recordClassIndex(11343);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ m a(f fVar) {
        return b(fVar);
    }

    public static m b(f fVar) {
        m mVar = new m();
        ArrayList arrayList = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        mVar.f19099h = g.b(fVar);
                        break;
                    case 2:
                        mVar.f19092a = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 3:
                        mVar.f19098g = (int) g.b(fVar);
                        break;
                    case 4:
                        arrayList.add(Integer.valueOf((int) g.b(fVar)));
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        mVar.f19094c = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        mVar.f19093b = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        mVar.f19095d = ce.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        mVar.f19096e = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        mVar.f19104m = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        mVar.f19103l = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        mVar.f19100i = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        mVar.f19102k = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        mVar.f19101j = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        mVar.n = (int) g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                mVar.f19097f = e.a(arrayList);
                return mVar;
            }
        }
    }
}
