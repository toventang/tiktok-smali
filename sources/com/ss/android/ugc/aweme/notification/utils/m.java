package com.ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;

public enum m {
    Show("show"),
    Click("click");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(73238);
    }

    private m(String str) {
        this.value = str;
    }
}
