package com.bytedance.android.livesdk.model.message.d.c;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class h implements b<c> {
    static {
        Covode.recordClassIndex(11561);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ c a(f fVar) {
        return b(fVar);
    }

    public static c b(f fVar) {
        c cVar = new c();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        cVar.f19523a = fVar.f();
                        break;
                    case 2:
                        cVar.f19524b = fVar.f();
                        break;
                    case 3:
                        cVar.f19525c = fVar.d();
                        break;
                    case 4:
                        cVar.f19526d = g.a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.f19527e = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        cVar.f19528f = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        cVar.f19529g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        cVar.f19531i = j.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        long a3 = fVar.a();
                        Long l2 = null;
                        String str = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str != null) {
                                    cVar.f19532j.put(l2, str);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l2 = Long.valueOf(fVar.f());
                            } else if (b3 == 2) {
                                str = fVar.d();
                            }
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        cVar.f19533k = fVar.e();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        cVar.f19534l = j.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        cVar.f19530h = fVar.d();
                        break;
                }
            } else {
                fVar.a(a2);
                return cVar;
            }
        }
    }
}
