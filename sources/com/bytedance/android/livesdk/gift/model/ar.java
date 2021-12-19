package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;

public final class ar implements b<w> {
    static {
        Covode.recordClassIndex(9951);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ w a(f fVar) {
        return b(fVar);
    }

    public static w b(f fVar) {
        w wVar = new w();
        wVar.p = new ArrayList();
        wVar.n = new ArrayList();
        wVar.o = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        wVar.f17950b = r.b(fVar);
                        break;
                    case 2:
                        wVar.f17951c = (int) g.b(fVar);
                        break;
                    case 3:
                        wVar.f17953e = fVar.d();
                        break;
                    case 4:
                        wVar.f17954f = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        wVar.f17955g = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        wVar.f17952d = g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        wVar.f17957i = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        wVar.f17958j = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        wVar.f17960l = g.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        wVar.f17961m = (int) g.b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        wVar.n.add(aq.b(fVar));
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        wVar.f17959k = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    default:
                        g.c(fVar);
                        break;
                    case 15:
                        wVar.o.add(al.b(fVar));
                        break;
                    case 16:
                        wVar.t = Long.valueOf(g.b(fVar));
                        break;
                    case 17:
                        wVar.f17956h = g.b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        wVar.s = fVar.d();
                        break;
                    case 19:
                        wVar.f17949a = z.b(fVar);
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        wVar.p.add(ad.b(fVar));
                        break;
                    case 21:
                        wVar.u = fVar.d();
                        break;
                }
            } else {
                fVar.a(a2);
                return wVar;
            }
        }
    }
}
