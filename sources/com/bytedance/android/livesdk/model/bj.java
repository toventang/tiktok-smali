package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public final class bj implements b<i> {
    static {
        Covode.recordClassIndex(11341);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ i a(f fVar) {
        return b(fVar);
    }

    public static i b(f fVar) {
        i iVar = new i();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        iVar.f19071a = fVar.f();
                        break;
                    case 2:
                        iVar.f19072b = fVar.d();
                        break;
                    case 3:
                        iVar.f19073c = com.bytedance.android.live.base.model.f.b(fVar);
                        break;
                    case 4:
                        iVar.f19074d = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        iVar.f19075e = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        iVar.f19076f = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        iVar.f19078h = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        iVar.f19080j = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        iVar.f19079i = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        iVar.f19077g = fVar.d();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        iVar.f19081k = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        iVar.f19082l = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        iVar.f19083m = Long.valueOf(fVar.f());
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        iVar.n = Long.valueOf(fVar.f());
                        break;
                    case 15:
                        iVar.o = Long.valueOf(fVar.f());
                        break;
                    case 16:
                        iVar.p = Long.valueOf(fVar.f());
                        break;
                    case 17:
                        iVar.q = Long.valueOf(fVar.f());
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        iVar.r = Long.valueOf(fVar.f());
                        break;
                    case 19:
                        iVar.s = Long.valueOf(fVar.f());
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        iVar.t = bi.b(fVar);
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
