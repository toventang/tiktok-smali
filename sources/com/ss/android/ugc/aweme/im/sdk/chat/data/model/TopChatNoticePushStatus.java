package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

public enum TopChatNoticePushStatus {
    PUSH_STATUS_UNKNOWN(0),
    PUSH_STATUS_ON(1),
    PUSH_STATUS_OFF(2);
    
    private final int status;

    public final int getStatus() {
        return this.status;
    }

    static {
        Covode.recordClassIndex(64091);
    }

    private TopChatNoticePushStatus(int i2) {
        this.status = i2;
    }
}
