package com.ss.texturerender.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class e {
    static {
        Covode.recordClassIndex(101230);
    }

    public static a a(int i2) {
        switch (i2) {
            case 1:
                return new b();
            case 2:
                return new m();
            case 3:
                return new o();
            case 4:
                return new l();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new p();
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            default:
                return null;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return new j();
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new n();
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return new k();
        }
    }
}
