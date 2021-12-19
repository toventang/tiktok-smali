package com.ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;

public enum l {
    VIDEO_DOWNLOAD_TYPE,
    VIDEO_WATER_TYPE;
    
    private final int weight = 50;

    public final int getWeight() {
        return this.weight;
    }

    static {
        Covode.recordClassIndex(84258);
    }

    private l() {
    }
}
