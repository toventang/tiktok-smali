package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

final class ja {
    static {
        Covode.recordClassIndex(31894);
    }

    static String a(fe feVar) {
        iz izVar = new iz(feVar);
        StringBuilder sb = new StringBuilder(izVar.a());
        for (int i2 = 0; i2 < izVar.a(); i2++) {
            byte a2 = izVar.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        sb.append("\\a");
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        sb.append("\\b");
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        sb.append("\\t");
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        sb.append("\\n");
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        sb.append("\\v");
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        sb.append("\\f");
                        continue;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
