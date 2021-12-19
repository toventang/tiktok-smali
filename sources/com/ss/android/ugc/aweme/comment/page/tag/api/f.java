package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;

public enum f {
    UNDEFINED(0),
    COMMENT_MENTION(3),
    VIDEO_TAG(4),
    QA_INVITE(5),
    VIDEO_MENTION(6);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(44521);
    }

    private f(int i2) {
        this.type = i2;
    }
}
