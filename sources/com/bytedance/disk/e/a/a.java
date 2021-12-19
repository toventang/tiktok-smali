package com.bytedance.disk.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class a {
    static {
        Covode.recordClassIndex(16786);
    }

    public static boolean b(int i2) {
        return i2 > 0 && i2 <= 6;
    }

    public static String a(int i2) {
        switch (i2) {
            case 0:
                return "\"wait register\"";
            case 1:
                return "\"registered\"";
            case 2:
                return "\"migrating\"";
            case 3:
                return "\"canceled\"";
            case 4:
                return "\"suspend\"";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "\"success\"";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "\"failed\"";
            default:
                return "\"unknown event:" + i2 + "\"";
        }
    }
}
