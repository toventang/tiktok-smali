package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;
import java.util.HashMap;

public final class bx implements b<u> {
    static {
        Covode.recordClassIndex(11355);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ u a(f fVar) {
        return b(fVar);
    }

    public static u b(f fVar) {
        u uVar = new u();
        uVar.u = new HashMap();
        uVar.K = new HashMap();
        uVar.H = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return uVar;
            } else if (b2 == 1) {
                uVar.f19759b = com.bytedance.android.live.base.model.f.b(fVar);
            } else if (b2 == 2) {
                uVar.f19760c = fVar.d();
            } else if (b2 == 3) {
                uVar.q = Boolean.valueOf(g.a(fVar));
            } else if (b2 == 4) {
                uVar.f19765h = (int) g.b(fVar);
            } else if (b2 == 5) {
                uVar.f19761d = g.b(fVar);
            } else if (b2 == 7) {
                uVar.f19766i = g.a(fVar);
            } else if (b2 == 24) {
                uVar.o = fVar.d();
            } else if (b2 == 33) {
                uVar.B = fVar.d();
            } else if (b2 == 36) {
                uVar.C = fVar.d();
            } else if (b2 == 38) {
                uVar.D = Long.valueOf(g.b(fVar));
            } else if (b2 != 44) {
                String str = null;
                if (b2 == 100) {
                    long a3 = fVar.a();
                    String str2 = null;
                    while (true) {
                        int b3 = fVar.b();
                        if (b3 == -1) {
                            fVar.a(a3);
                            if (str == null) {
                                throw new IllegalStateException("Map key must not be null!");
                            } else if (str2 != null) {
                                uVar.K.put(str, str2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else if (b3 == 1) {
                            str = fVar.d();
                        } else if (b3 == 2) {
                            str2 = fVar.d();
                        }
                    }
                } else if (b2 != 101) {
                    switch (b2) {
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            uVar.f19764g = g.a(fVar);
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            uVar.f19762e = fVar.e();
                            continue;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            uVar.f19763f = fVar.e();
                            continue;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            uVar.f19770m = g.a(fVar);
                            continue;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            uVar.n = g.b(fVar);
                            continue;
                        case 15:
                            uVar.f19769l = com.bytedance.android.live.base.model.f.b(fVar);
                            continue;
                        case 16:
                            uVar.f19758a = fVar.d();
                            continue;
                        case 17:
                            uVar.r = fVar.d();
                            continue;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            uVar.s = fVar.d();
                            continue;
                        case 19:
                            uVar.t = Boolean.valueOf(g.a(fVar));
                            continue;
                        case v.U /*{ENCODED_INT: 20}*/:
                            long a4 = fVar.a();
                            Long l2 = null;
                            while (true) {
                                int b4 = fVar.b();
                                if (b4 == -1) {
                                    fVar.a(a4);
                                    if (str == null) {
                                        throw new IllegalStateException("Map key must not be null!");
                                    } else if (l2 != null) {
                                        uVar.u.put(str, l2);
                                        continue;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else if (b4 == 1) {
                                    str = fVar.d();
                                } else if (b4 == 2) {
                                    l2 = Long.valueOf(g.b(fVar));
                                }
                            }
                        case 21:
                            uVar.v = com.bytedance.android.live.base.model.f.b(fVar);
                            continue;
                        case 22:
                            uVar.w = Integer.valueOf(fVar.e());
                            continue;
                        default:
                            switch (b2) {
                                case 28:
                                    uVar.x = Integer.valueOf(fVar.e());
                                    continue;
                                case 29:
                                    uVar.y = fVar.d();
                                    continue;
                                case 30:
                                    uVar.z = bu.b(fVar);
                                    continue;
                                case 31:
                                    uVar.A = fVar.d();
                                    continue;
                                default:
                                    switch (b2) {
                                        case 40:
                                            uVar.E = Boolean.valueOf(g.a(fVar));
                                            continue;
                                        case 41:
                                            uVar.F = fVar.d();
                                            continue;
                                        case 42:
                                            uVar.G = Long.valueOf(g.b(fVar));
                                            continue;
                                        default:
                                            switch (b2) {
                                                case 47:
                                                    uVar.p = com.bytedance.android.live.base.model.f.b(fVar);
                                                    continue;
                                                case 48:
                                                    uVar.I = bv.b(fVar);
                                                    continue;
                                                case 49:
                                                    uVar.J = g.a(fVar);
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
                    uVar.L = bt.b(fVar);
                }
            } else {
                uVar.H.add(fVar.d());
            }
        }
    }
}
