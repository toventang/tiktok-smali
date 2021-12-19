package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;

public enum i {
    LIVE_LINK_PIN("live-link-pin"),
    LIVE_LINK_CARD("live-link-card");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(46024);
    }

    private i(String str) {
        this.value = str;
    }
}
