package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.b.aa;
import com.bytedance.android.livesdk.model.message.b.ac;
import com.bytedance.android.livesdk.model.message.b.ag;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.android.livesdk.model.message.b.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

public final class r implements b<e> {
    static {
        Covode.recordClassIndex(13686);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ e a(f fVar) {
        return b(fVar);
    }

    public static e b(f fVar) {
        e eVar = new e((char) 0);
        eVar.f23075d = new HashMap();
        eVar.f23077f = new HashMap();
        eVar.f23081j = new HashMap();
        eVar.f23076e = new HashMap();
        eVar.f23079h = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                Long l2 = null;
                switch (b2) {
                    case 1:
                        eVar.f23072a = Long.valueOf(g.b(fVar));
                        break;
                    case 2:
                        eVar.f23073b = Long.valueOf(g.b(fVar));
                        break;
                    case 3:
                        eVar.f23074c = ac.b(fVar);
                        break;
                    case 4:
                        long a3 = fVar.a();
                        n nVar = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (nVar != null) {
                                    eVar.f23075d.put(l2, nVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b3 == 2) {
                                nVar = ag.b(fVar);
                            }
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        long a4 = fVar.a();
                        h hVar = null;
                        while (true) {
                            int b4 = fVar.b();
                            if (b4 == -1) {
                                fVar.a(a4);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (hVar != null) {
                                    eVar.f23076e.put(l2, hVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b4 == 2) {
                                hVar = aa.b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        long a5 = fVar.a();
                        i iVar = null;
                        while (true) {
                            int b5 = fVar.b();
                            if (b5 == -1) {
                                fVar.a(a5);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (iVar != null) {
                                    eVar.f23077f.put(l2, iVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b5 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b5 == 2) {
                                iVar = v.b(fVar);
                            }
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f23078g = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        long a6 = fVar.a();
                        Boolean bool = null;
                        while (true) {
                            int b6 = fVar.b();
                            if (b6 == -1) {
                                fVar.a(a6);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (bool != null) {
                                    eVar.f23079h.put(l2, bool);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b6 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b6 == 2) {
                                bool = Boolean.valueOf(g.a(fVar));
                            }
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f23080i = t.b(fVar);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        long a7 = fVar.a();
                        d dVar = null;
                        while (true) {
                            int b7 = fVar.b();
                            if (b7 == -1) {
                                fVar.a(a7);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (dVar != null) {
                                    eVar.f23081j.put(l2, dVar);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b7 == 1) {
                                l2 = Long.valueOf(g.b(fVar));
                            } else if (b7 == 2) {
                                dVar = q.b(fVar);
                            }
                        }
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f23082k = u.b(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return eVar;
            }
        }
    }
}
