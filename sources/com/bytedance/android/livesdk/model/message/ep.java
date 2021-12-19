package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public final class ep implements b<az> {
    static {
        Covode.recordClassIndex(11636);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ az a(f fVar) {
        az azVar = new az();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        azVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        azVar.f19234f = j.b(fVar);
                        break;
                    case 3:
                        azVar.f19233a = (int) fVar.f();
                        break;
                    case 4:
                        azVar.f19238j = j.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        azVar.f19239k = g.a(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        azVar.f19235g = g.a(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        azVar.f19240l = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        azVar.f19237i = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        azVar.f19241m = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        azVar.f19236h = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        azVar.n = fVar.d();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        azVar.p = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case 16:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        azVar.q = fVar.d();
                        break;
                    case 15:
                        azVar.o = eo.b(fVar);
                        break;
                    case 17:
                        azVar.r = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        azVar.s = r.b(fVar);
                        break;
                    case 19:
                        azVar.t = fVar.d();
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        azVar.u = fVar.d();
                        break;
                    case 21:
                        azVar.v = fVar.d();
                        break;
                    case 22:
                        azVar.w = Long.valueOf(fVar.f());
                        break;
                }
            } else {
                fVar.a(a2);
                return azVar;
            }
        }
    }
}
