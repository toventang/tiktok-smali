package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;

public enum a {
    PASS(0),
    PRIVACY_SETTING(1),
    BLOCK_RELATION(2),
    BLOCK_SELF_REMOVAL(3);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(44516);
    }

    private a(int i2) {
        this.type = i2;
    }
}
