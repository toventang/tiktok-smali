package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

public final class cd implements b<aq> {
    static {
        Covode.recordClassIndex(11362);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ aq a(f fVar) {
        return b(fVar);
    }

    public static aq b(f fVar) {
        aq aqVar = new aq();
        aqVar.f18984g = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aqVar.f18978a = j.b(fVar);
                        break;
                    case 2:
                        aqVar.f18979b = fVar.d();
                        break;
                    case 3:
                        aqVar.f18981d = g.b(fVar);
                        break;
                    case 4:
                        aqVar.f18982e = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aqVar.f18983f = g.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        long a3 = fVar.a();
                        Long l2 = null;
                        Long l3 = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (l3 != null) {
                                    aqVar.f18984g.put(l2, l3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b3 == 2) {
                                l3 = Long.valueOf(g.b(fVar));
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aqVar.f18985h = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aqVar.f18986i = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aqVar.f18980c = g.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aqVar;
            }
        }
    }
}
