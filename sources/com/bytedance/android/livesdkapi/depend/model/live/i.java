package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public enum i {
    VIDEO("video_live", false, true),
    AUDIO(DataType.AUDIO, false, false),
    THIRD_PARTY("third_party", true, false),
    SCREEN_RECORD("screen_share", true, false),
    LIVE_STUDIO("live_studio", false, false),
    OFFICIAL_ACTIVITY("official_activity", false, false);
    
    @c(a = "isStreamingBackground")
    public final boolean isStreamingBackground;
    @c(a = "isUsingCamera")
    public final boolean isUsingCamera;
    @c(a = "logStreamingType")
    public final String logStreamingType;

    public final String getModeFromServer() {
        if (this == VIDEO) {
            return "live";
        }
        if (this == SCREEN_RECORD) {
            return "live_by_record";
        }
        if (this == THIRD_PARTY) {
            return "computer";
        }
        return "";
    }

    static {
        Covode.recordClassIndex(13719);
    }

    public static i valueOf(int i2) {
        if (i2 < 0 || i2 >= values().length) {
            return VIDEO;
        }
        return values()[i2];
    }

    private i(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
