package com.ss.android.ugc.aweme.commercialize.profile.talent.a;

import com.bytedance.covode.number.Covode;

public enum a {
    PROFILE_RIT;
    
    private final int TYPE = 1;

    public final int getTYPE() {
        return this.TYPE;
    }

    static {
        Covode.recordClassIndex(46440);
    }

    private a(String str) {
    }
}
