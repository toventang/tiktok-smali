package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.h;

public enum j implements h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private int minVersion;

    @Override // com.facebook.internal.h
    public final String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    @Override // com.facebook.internal.h
    public final int getMinVersion() {
        return this.minVersion;
    }

    static {
        Covode.recordClassIndex(30677);
    }

    private j(int i2) {
        this.minVersion = i2;
    }
}
