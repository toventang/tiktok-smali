package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.a.e;
import com.bytedance.android.livesdk.model.message.d.c.h;
import com.bytedance.android.livesdk.model.message.d.f.c;
import com.bytedance.android.livesdk.model.message.d.k.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public final class dx implements b<aj> {
    static {
        Covode.recordClassIndex(11612);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ aj a(f fVar) {
        aj ajVar = new aj();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        ajVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        ajVar.f19139a = (int) fVar.f();
                        break;
                    case 3:
                        ajVar.f19140f = fVar.f();
                        break;
                    case 4:
                        ajVar.f19141g = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ajVar.f19142h = h.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ajVar.f19143i = d.b(fVar);
                        break;
                    default:
                        switch (b2) {
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                ajVar.f19146l = com.bytedance.android.livesdk.model.message.d.b.b.b(fVar);
                                continue;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                ajVar.n = com.bytedance.android.livesdk.model.message.d.e.b.b(fVar);
                                continue;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                ajVar.f19144j = com.bytedance.android.livesdk.model.message.d.a.b.b(fVar);
                                continue;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                ajVar.f19147m = com.bytedance.android.livesdk.model.message.d.d.b.b(fVar);
                                continue;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                ajVar.f19145k = c.b(fVar);
                                continue;
                            default:
                                switch (b2) {
                                    case 16:
                                        ajVar.o = com.bytedance.android.livesdk.model.message.d.i.b.b(fVar);
                                        continue;
                                    case 17:
                                        ajVar.p = com.bytedance.android.livesdk.model.message.d.j.b.b(fVar);
                                        continue;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                                        ajVar.r = e.b(fVar);
                                        continue;
                                    case 19:
                                        ajVar.q = com.bytedance.android.livesdk.model.message.d.h.c.b(fVar);
                                        continue;
                                    case v.U /*{ENCODED_INT: 20}*/:
                                        ajVar.s = com.bytedance.android.livesdk.model.message.d.g.b.b(fVar);
                                        continue;
                                    default:
                                        switch (b2) {
                                            case 200:
                                                ajVar.t = fVar.d();
                                                continue;
                                            case 201:
                                                ajVar.u = fVar.f();
                                                continue;
                                            case 202:
                                                ajVar.v = fVar.d();
                                                continue;
                                            default:
                                                g.c(fVar);
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                }
            } else {
                fVar.a(a2);
                return ajVar;
            }
        }
    }
}
