package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public final class am implements b<s> {
    static {
        Covode.recordClassIndex(13706);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ s a(f fVar) {
        return b(fVar);
    }

    public static s b(f fVar) {
        s sVar = new s();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        sVar.f23181c = (int) fVar.f();
                        break;
                    case 2:
                        sVar.f23182d = (int) fVar.f();
                        break;
                    case 3:
                        sVar.f23189k = (int) fVar.f();
                        break;
                    case 4:
                        sVar.f23185g = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        sVar.f23183e = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        sVar.f23184f = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        sVar.f23188j = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        sVar.f23190l = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        sVar.f23191m = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        sVar.f23187i = g.a(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case 15:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        sVar.f23186h = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        sVar.n = an.b(fVar);
                        break;
                    case 16:
                        sVar.p = (float) fVar.f();
                        break;
                    case 17:
                        sVar.q = g.a(fVar);
                        break;
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        sVar.r = g.a(fVar);
                        break;
                    case 19:
                        sVar.s = g.a(fVar);
                        break;
                    case v.U /*{ENCODED_INT: 20}*/:
                        sVar.o = g.a(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return sVar;
            }
        }
    }
}
