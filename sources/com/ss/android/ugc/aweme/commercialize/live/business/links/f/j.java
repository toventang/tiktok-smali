package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;

public enum j {
    BEFORE_LIVE("before_live"),
    DURING_LIVE("during_live");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(46025);
    }

    private j(String str) {
        this.value = str;
    }
}
