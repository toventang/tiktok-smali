package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

public enum TopChatNoticeSourceType {
    DM_CHAT("dm_chat"),
    INBOX("inbox");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(64092);
    }

    private TopChatNoticeSourceType(String str) {
        this.type = str;
    }
}
