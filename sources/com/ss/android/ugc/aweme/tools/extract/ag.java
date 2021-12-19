package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;

public enum ag {
    PHOTO_MOVIE(1),
    MV_THEME(2),
    STATUS_UPLOAD(4),
    RECORD_PROP(8),
    EDIT_EFFECT(16),
    EDIT_STICKER(32);
    
    private final int tag;

    public final int getTag() {
        return this.tag;
    }

    static {
        Covode.recordClassIndex(91511);
    }

    private ag(int i2) {
        this.tag = i2;
    }
}
