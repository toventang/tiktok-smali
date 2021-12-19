package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

public enum s {
    START("start"),
    SUCCESS("success"),
    FAILED("failed"),
    CANCEL_EXTERNAL("cancel_external"),
    CANCEL_INTERNAL("cancel_internal"),
    PAUSED("paused");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(85248);
    }

    private s(String str) {
        this.desc = str;
    }
}
