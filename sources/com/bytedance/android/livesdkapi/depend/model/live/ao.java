package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

public final class ao implements b<StreamUrl> {
    static {
        Covode.recordClassIndex(13708);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ StreamUrl a(f fVar) {
        return b(fVar);
    }

    public static StreamUrl b(f fVar) {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.f23041h = new HashMap();
        streamUrl.f23040g = new HashMap();
        streamUrl.f23042i = new HashMap();
        streamUrl.f23038e = new ArrayList();
        streamUrl.f23043j = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                String str = null;
                switch (b2) {
                    case 1:
                        streamUrl.f23036c = (int) g.b(fVar);
                        break;
                    case 2:
                        streamUrl.f23034a = g.b(fVar);
                        break;
                    case 3:
                        streamUrl.f23035b = fVar.d();
                        break;
                    case 4:
                        long a3 = fVar.a();
                        String str2 = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str2 != null) {
                                    streamUrl.f23041h.put(str, str2);
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
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        streamUrl.f23044k = fVar.d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        streamUrl.f23045l = am.b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        streamUrl.f23037d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        streamUrl.f23039f = fVar.d();
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        long a4 = fVar.a();
                        String str3 = null;
                        while (true) {
                            int b4 = fVar.b();
                            if (b4 == -1) {
                                fVar.a(a4);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str3 != null) {
                                    streamUrl.f23040g.put(str, str3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b4 == 1) {
                                str = fVar.d();
                            } else if (b4 == 2) {
                                str3 = fVar.d();
                            }
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        streamUrl.f23043j.add(fVar.d());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    default:
                        g.c(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        streamUrl.f23046m = fVar.d();
                        break;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        long a5 = fVar.a();
                        String str4 = null;
                        while (true) {
                            int b5 = fVar.b();
                            if (b5 == -1) {
                                fVar.a(a5);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str4 != null) {
                                    streamUrl.f23042i.put(str, str4);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b5 == 1) {
                                str = fVar.d();
                            } else if (b5 == 2) {
                                str4 = fVar.d();
                            }
                        }
                    case 15:
                        streamUrl.n = fVar.d();
                        break;
                    case 16:
                        streamUrl.f23038e.add(fVar.d());
                        break;
                    case 17:
                        streamUrl.o = ab.b(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                return streamUrl;
            }
        }
    }
}
