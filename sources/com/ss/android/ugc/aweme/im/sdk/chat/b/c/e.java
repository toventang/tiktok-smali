package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import com.bytedance.covode.number.Covode;

public enum e {
    SENDING("sending"),
    SENT("sent"),
    FAILED("failed");
    
    private final String state;

    public final String getState() {
        return this.state;
    }

    static {
        Covode.recordClassIndex(63870);
    }

    private e(String str) {
        this.state = str;
    }
}
