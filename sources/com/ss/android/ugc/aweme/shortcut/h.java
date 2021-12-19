package com.ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;

public enum h {
    NOTIFICATION("notification"),
    SHOOTING("shooting"),
    DISCOVER("discover"),
    WILL_GET_MOST("will_get_most"),
    WITHDRAWAL("withdrawal"),
    NONE("");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(81945);
    }

    private h(String str) {
        this.value = str;
    }
}
