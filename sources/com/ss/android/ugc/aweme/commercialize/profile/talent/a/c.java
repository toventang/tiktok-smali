package com.ss.android.ugc.aweme.commercialize.profile.talent.a;

import com.bytedance.covode.number.Covode;

public enum c {
    PROFILE_AD_REQUEST_SOURCE_ENTER_DRAW(1),
    PROFILE_AD_REQUEST_SOURCE_LOAD_MORE(2);
    
    private final int SOURCE;

    public final int getSOURCE() {
        return this.SOURCE;
    }

    static {
        Covode.recordClassIndex(46442);
    }

    private c(int i2) {
        this.SOURCE = i2;
    }
}
