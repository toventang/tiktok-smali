package com.google.android.gms.common.api;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class g {
    static {
        Covode.recordClassIndex(31204);
    }

    public static String a(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            default:
                return new StringBuilder(32).append("unknown status code: ").append(i2).toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "INVALID_ACCOUNT";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "RESOLUTION_REQUIRED";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "NETWORK_ERROR";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "INTERNAL_ERROR";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "DEVELOPER_ERROR";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "ERROR";
            case ABRConfig.ABR_SELECT_SCENE:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return "DEAD_CLIENT";
        }
    }
}
