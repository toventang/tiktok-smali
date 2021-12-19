package com.facebook;

import com.bytedance.covode.number.Covode;

public enum c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    
    public final boolean canExtendToken;

    static {
        Covode.recordClassIndex(28566);
    }

    private c(boolean z) {
        this.canExtendToken = z;
    }
}
