package com.ss.android.ugc.asve.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import h.n;

public enum a {
    AS_CAMERA_NULL,
    AS_CAMERA_1,
    AS_CAMERA_2,
    AS_CAMERA_MI,
    AS_CAMERA_OPPO,
    AS_CAMERA_CHRY_CAMKIT,
    AS_CAMERA_VIVO,
    AS_CAMERA_OPPO_CAMERA_UNIT,
    AS_CAMERA_MI_V2,
    AS_CAMERA_OPPO_CAMERA_MEDIA;
    
    public static final C1350a Companion = new C1350a((byte) 0);

    static {
        Covode.recordClassIndex(38070);
    }

    /* renamed from: com.ss.android.ugc.asve.b.a$a  reason: collision with other inner class name */
    public static final class C1350a {
        static {
            Covode.recordClassIndex(38071);
        }

        private C1350a() {
        }

        public /* synthetic */ C1350a(byte b2) {
            this();
        }
    }

    public static final a fromOrdinal(int i2) {
        switch (i2) {
            case 1:
                return AS_CAMERA_1;
            case 2:
                return AS_CAMERA_2;
            case 3:
                return AS_CAMERA_MI;
            case 4:
                return AS_CAMERA_OPPO;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return AS_CAMERA_CHRY_CAMKIT;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return AS_CAMERA_VIVO;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return AS_CAMERA_OPPO_CAMERA_UNIT;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return AS_CAMERA_MI_V2;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return AS_CAMERA_OPPO_CAMERA_MEDIA;
            default:
                return AS_CAMERA_NULL;
        }
    }

    public static final int toIntValue(a aVar) {
        l.d(aVar, "");
        switch (b.f61929a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 5;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 6;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 7;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 8;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return 9;
            default:
                throw new n();
        }
    }
}
