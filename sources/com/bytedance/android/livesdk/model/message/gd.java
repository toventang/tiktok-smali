package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.android.livesdk.model.message.ch;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class gd implements b<ch.a> {
    static {
        Covode.recordClassIndex(11678);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ch.a a(f fVar) {
        return b(fVar);
    }

    public static ch.a b(f fVar) {
        ch.a aVar = new ch.a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.f19479a = r.b(fVar);
                        break;
                    case 2:
                        aVar.f19480b = fVar.e();
                        break;
                    case 3:
                        aVar.f19481c = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 4:
                        aVar.f19482d = (long) fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19483e = (long) fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19484f = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f19485g = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f19486h = fVar.e();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f19487i = fVar.e();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f19488j = fVar.e();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        aVar.f19489k = fVar.e();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        aVar.f19490l = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        aVar.f19491m = fVar.d();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        aVar.n = fVar.d();
                        break;
                    case 15:
                        aVar.o = fVar.e();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aVar;
            }
        }
    }
}
