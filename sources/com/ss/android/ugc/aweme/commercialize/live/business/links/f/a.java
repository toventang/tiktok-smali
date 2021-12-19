package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;

public enum a {
    CLOSE("close"),
    PIN("pin_card"),
    UNPIN("unpin_card"),
    COUNT("active_list_count"),
    LEARN_MORE("learn_more"),
    REMOVE_CARD("remove_card");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(46013);
    }

    private a(String str) {
        this.value = str;
    }
}
