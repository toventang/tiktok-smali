package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

public enum ak {
    INSTANCE;
    
    private String videoId;

    public final String getVideoId() {
        String str = this.videoId;
        if (str == null) {
            return "";
        }
        return str;
    }

    static {
        Covode.recordClassIndex(82087);
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
