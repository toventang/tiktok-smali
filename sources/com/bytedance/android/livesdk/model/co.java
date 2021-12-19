package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;

public final class co implements b<bc> {
    static {
        Covode.recordClassIndex(11373);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ bc a(f fVar) {
        return b(fVar);
    }

    public static bc b(f fVar) {
        bc bcVar = new bc();
        bcVar.n = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bcVar;
            } else if (b2 != 1001) {
                switch (b2) {
                    case 1:
                        bcVar.f19039f = g.b(fVar);
                        continue;
                    case 2:
                        bcVar.f19034a = com.bytedance.android.live.base.model.f.b(fVar);
                        continue;
                    case 3:
                        bcVar.f19038e = fVar.d();
                        continue;
                    case 4:
                        bcVar.f19035b = com.bytedance.android.live.base.model.f.b(fVar);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        bcVar.f19037d = fVar.d();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bcVar.f19046m = (int) g.b(fVar);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bcVar.f19036c = com.bytedance.android.live.base.model.f.b(fVar);
                        continue;
                    default:
                        switch (b2) {
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                bcVar.f19040g = g.b(fVar);
                                continue;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                bcVar.q = g.b(fVar);
                                continue;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                bcVar.p = g.b(fVar);
                                continue;
                            default:
                                switch (b2) {
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                        bcVar.o = fVar.d();
                                        continue;
                                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                        bcVar.n.add(by.b(fVar));
                                        continue;
                                    case 15:
                                        bcVar.x = g.b(fVar);
                                        continue;
                                    case 16:
                                        bcVar.f19041h = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case 17:
                                        bcVar.f19042i = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                                        bcVar.f19044k = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case 19:
                                        bcVar.f19043j = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case v.U /*{ENCODED_INT: 20}*/:
                                        bcVar.f19045l = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case 21:
                                        bcVar.t = g.b(fVar);
                                        continue;
                                    case 22:
                                        bcVar.v = fVar.d();
                                        continue;
                                    case 23:
                                        bcVar.r = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case 24:
                                        bcVar.s = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case 25:
                                        bcVar.w = g.b(fVar);
                                        continue;
                                    default:
                                        g.c(fVar);
                                        continue;
                                        continue;
                                        continue;
                                }
                        }
                }
            } else {
                bcVar.u = fVar.d();
            }
        }
    }
}
