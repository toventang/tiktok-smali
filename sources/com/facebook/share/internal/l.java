package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.h;

public enum l implements h {
    SHARE_STORY_ASSET;
    
    private int minVersion = 20170417;

    @Override // com.facebook.internal.h
    public final String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // com.facebook.internal.h
    public final int getMinVersion() {
        return this.minVersion;
    }

    static {
        Covode.recordClassIndex(30689);
    }

    private l(String str) {
    }
}
