package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class p implements b<c> {
    static {
        Covode.recordClassIndex(13684);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        return b(fVar);
    }

    public static c b(f fVar) {
        c cVar = new c((char) 0);
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return cVar;
            } else if (b2 == 1) {
                cVar.f23060a = fVar.e();
            } else if (b2 != 2) {
                switch (b2) {
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        cVar.f23061b = fVar.f();
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        cVar.f23062c = g.a(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        cVar.f23063d = t.b(fVar);
                        continue;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        cVar.f23064e = fVar.f();
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                cVar.f23065f = t.b(fVar);
            }
        }
    }
}
