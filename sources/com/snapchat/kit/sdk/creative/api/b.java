package com.snapchat.kit.sdk.creative.api;

import com.bytedance.covode.number.Covode;

public enum b {
    GENERIC_ERROR(1),
    SNAPCHAT_NOT_INSTALLED(2),
    SNAPCHAT_CANNOT_SHARE_CONTENT(3);
    
    private int mCode;

    static {
        Covode.recordClassIndex(35824);
    }

    private b(int i2) {
        this.mCode = i2;
    }
}
