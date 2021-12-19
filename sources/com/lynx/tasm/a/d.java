package com.lynx.tasm.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class d {
    static {
        Covode.recordClassIndex(34853);
    }

    public static final String a(int i2) {
        if (i2 == 1) {
            return "opacity";
        }
        if (i2 == 2) {
            return "scaleX";
        }
        switch (i2) {
            case 4:
                return "scaleY";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "scaleXY";
            case 16:
                return "width";
            case 32:
                return "height";
            case 64:
                return "background-color";
            case 128:
                return "visibility";
            case 256:
                return "left";
            case 512:
                return "top";
            case 1024:
                return "right";
            case 2048:
                return "bottom";
            case 4096:
                return "transform";
            default:
                new IllegalArgumentException("Unsupported animated property: ".concat(String.valueOf(i2)));
                return "none";
        }
    }
}
