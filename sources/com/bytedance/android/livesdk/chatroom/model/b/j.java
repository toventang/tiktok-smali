package com.bytedance.android.livesdk.chatroom.model.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class j implements b<e> {
    static {
        Covode.recordClassIndex(8686);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        return b(fVar);
    }

    public static e b(f fVar) {
        e eVar = new e();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        eVar.f15722c = com.bytedance.android.live.base.model.user.j.b(fVar);
                        break;
                    case 2:
                        eVar.f15721b = (int) fVar.f();
                        break;
                    case 3:
                        eVar.f15723d = fVar.f();
                        break;
                    case 4:
                        eVar.f15724e = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f15725f = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f15726g = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f15720a = fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f15727h = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f15728i = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f15729j = fVar.d();
                        break;
                }
            } else {
                fVar.a(a2);
                return eVar;
            }
        }
    }
}
