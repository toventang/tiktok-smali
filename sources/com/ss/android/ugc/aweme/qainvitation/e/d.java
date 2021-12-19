package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;

public enum d {
    UNDEFINED(0),
    VIDEO_CAPTION_MENTION(1),
    VIDEO_STICKER_MENTION(2),
    COMMENT_MENTION(3),
    VIDEO_TAG(4),
    QA_INVITE(5);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(77369);
    }

    private d(int i2) {
        this.type = i2;
    }
}
