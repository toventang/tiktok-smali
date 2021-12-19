package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;

public final class ei implements b<ar> {
    static {
        Covode.recordClassIndex(11629);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ar a(f fVar) {
        ar arVar = new ar();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return arVar;
            } else if (b2 == 16) {
                arVar.v = (int) fVar.f();
            } else if (b2 == 32) {
                arVar.J = fVar.d();
            } else if (b2 == 51) {
                arVar.K = g.a(fVar);
            } else if (b2 == 34) {
                arVar.f19191f = fVar.d();
            } else if (b2 != 35) {
                switch (b2) {
                    case 1:
                        arVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        continue;
                    case 2:
                        arVar.f19190a = (int) fVar.f();
                        continue;
                    case 3:
                        arVar.f19193h = fVar.d();
                        continue;
                    case 4:
                        arVar.f19194i = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        arVar.f19196k = fVar.f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        arVar.f19197l = fVar.f();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        arVar.f19198m = fVar.f();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        arVar.n = fVar.f();
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        arVar.o = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        arVar.p = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        arVar.q = (int) fVar.f();
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        arVar.r = fVar.d();
                        continue;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        arVar.s = fVar.f();
                        continue;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        arVar.t = (int) fVar.f();
                        continue;
                    default:
                        switch (b2) {
                            case LiveRechargeAgeThresholdSetting.DEFAULT:
                                arVar.w = (int) fVar.f();
                                continue;
                            case 19:
                                arVar.x = g.a(fVar);
                                continue;
                            case v.U /*{ENCODED_INT: 20}*/:
                                arVar.y = fVar.d();
                                continue;
                            case 21:
                                arVar.z = fVar.f();
                                continue;
                            default:
                                switch (b2) {
                                    case 25:
                                        arVar.B = fVar.d();
                                        continue;
                                    case 26:
                                        arVar.u = fVar.f();
                                        continue;
                                    case 27:
                                        arVar.E = fVar.e();
                                        continue;
                                    case 28:
                                        arVar.A = fVar.f();
                                        continue;
                                    case 29:
                                        arVar.C = (int) fVar.f();
                                        continue;
                                    case 30:
                                        arVar.D = fVar.f();
                                        continue;
                                    default:
                                        switch (b2) {
                                            case 37:
                                                arVar.f19195j = fVar.d();
                                                continue;
                                            case 38:
                                                arVar.F = fVar.f();
                                                continue;
                                            case 39:
                                                arVar.G = (int) fVar.f();
                                                continue;
                                            case 40:
                                                arVar.H = fVar.d();
                                                continue;
                                            case 41:
                                                arVar.I = g.a(fVar);
                                                continue;
                                            default:
                                                g.c(fVar);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                }
            } else {
                arVar.f19192g = fVar.d();
            }
        }
    }
}
