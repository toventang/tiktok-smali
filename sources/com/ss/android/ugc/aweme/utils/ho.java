package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class ho {
    static {
        Covode.recordClassIndex(93636);
    }

    public static String a(int i2) {
        switch (i2) {
            case 0:
                return "output";
            case 1:
                return "like";
            case 2:
            case 4:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            default:
                return "";
            case 3:
                return "music";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "trends";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "effect";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "homepage";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "collection";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "brand_tab";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "content_aggregation";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "recommend";
            case ABRConfig.ABR_SELECT_SCENE:
                return "private";
            case 15:
                return UGCMonitor.TYPE_REPOST;
            case 16:
                return "shop";
        }
    }
}
