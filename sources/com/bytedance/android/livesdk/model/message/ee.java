package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.b.aa;
import com.bytedance.android.livesdk.model.message.b.ac;
import com.bytedance.android.livesdk.model.message.b.ai;
import com.bytedance.android.livesdk.model.message.b.ak;
import com.bytedance.android.livesdk.model.message.b.al;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.t;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.a.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

public final class ee implements b<an> {
    static {
        Covode.recordClassIndex(11625);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ an a(f fVar) {
        an anVar = new an();
        anVar.f19171k = new ArrayList();
        anVar.f19170j = new HashMap();
        anVar.f19172l = new ArrayList();
        anVar.f19168h = new HashMap();
        anVar.n = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                Long l2 = null;
                switch (b2) {
                    case 1:
                        anVar.O = com.bytedance.android.livesdkapi.h.f.b(fVar);
                        break;
                    case 2:
                        anVar.f19165a = g.b(fVar);
                        break;
                    case 3:
                        anVar.f19167g = ac.b(fVar);
                        break;
                    case 4:
                        anVar.f19166f = fVar.e();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        long a3 = fVar.a();
                        h hVar = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (hVar != null) {
                                    anVar.f19168h.put(l2, hVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b3 == 2) {
                                hVar = aa.b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        anVar.f19169i = t.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        anVar.o = fVar.e();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        anVar.f19171k.add(al.b(fVar));
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        anVar.f19172l.add(ai.b(fVar));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        anVar.f19173m = fVar.d();
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        anVar.n.add(ak.b(fVar));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        long a4 = fVar.a();
                        d dVar = null;
                        while (true) {
                            int b4 = fVar.b();
                            if (b4 == -1) {
                                fVar.a(a4);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (dVar != null) {
                                    anVar.f19170j.put(l2, dVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b4 == 2) {
                                dVar = q.b(fVar);
                            }
                        }
                }
            } else {
                fVar.a(a2);
                return anVar;
            }
        }
    }
}
