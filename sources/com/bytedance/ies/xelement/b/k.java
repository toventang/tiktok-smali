package com.bytedance.ies.xelement.b;

import com.bytedance.covode.number.Covode;

public enum k {
    PLAYBACK_STATE_START("start"),
    PLAYBACK_STATE_PLAYING("play"),
    PLAYBACK_STATE_PAUSED("pause"),
    PLAYBACK_STATE_STOPPED("stop"),
    PLAYBACK_STATE_ENDED("ended"),
    PLAYBACK_STATE_ERROR("error");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(22041);
    }

    private k(String str) {
        this.desc = str;
    }
}
