package com.bytedance.android.livesdkapi.h;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

public final class h implements b<e> {
    static {
        Covode.recordClassIndex(13778);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        e eVar = new e();
        eVar.f23231g = new HashMap();
        eVar.f23225a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        eVar.f23225a.add(g.b(fVar));
                        break;
                    case 2:
                        eVar.f23226b = fVar.d();
                        break;
                    case 3:
                        eVar.f23227c = g.b(fVar);
                        break;
                    case 4:
                        eVar.f23228d = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f23229e = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f23230f = fVar.e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        long a3 = fVar.a();
                        String str = null;
                        String str2 = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str2 != null) {
                                    eVar.f23231g.put(str, str2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                str = fVar.d();
                            } else if (b3 == 2) {
                                str2 = fVar.d();
                            }
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f23232h = g.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f23233i = g.a(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f23234j = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return eVar;
            }
        }
    }
}
