package com.bytedance.android.livesdk.model.message.d.k;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class d implements b<a> {
    static {
        Covode.recordClassIndex(11586);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ a a(f fVar) {
        return b(fVar);
    }

    public static a b(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                Long l2 = null;
                switch (b2) {
                    case 1:
                        aVar.f19571a = fVar.f();
                        break;
                    case 2:
                        aVar.f19573c = fVar.f();
                        break;
                    case 3:
                        aVar.f19574d = f.b(fVar);
                        break;
                    case 4:
                        aVar.f19575e = fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f19577g = f.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f19578h = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        aVar.f19579i = (int) fVar.f();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        aVar.f19580j = e.b(fVar);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        aVar.f19572b = j.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        aVar.f19576f = j.b(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        long a3 = fVar.a();
                        String str = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str != null) {
                                    aVar.f19581k.put(l2, str);
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
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        aVar.f19582l = com.bytedance.android.livesdk.model.message.d.h.d.b(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        long a4 = fVar.a();
                        Long l3 = null;
                        while (true) {
                            int b4 = fVar.b();
                            if (b4 == -1) {
                                fVar.a(a4);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (l3 != null) {
                                    aVar.f19583m.put(l2, l3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b4 == 2) {
                                l3 = Long.valueOf(g.b(fVar));
                            }
                        }
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        aVar.n = fVar.e();
                        break;
                    case 15:
                        aVar.o = com.bytedance.android.livesdk.model.message.d.c.j.b(fVar);
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return aVar;
            }
        }
    }
}
