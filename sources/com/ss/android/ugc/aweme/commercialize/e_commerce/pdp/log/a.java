package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log;

import com.bytedance.covode.number.Covode;

public enum a {
    COLLAPSED("collapsed"),
    EXPANDED("expanded"),
    HIDDEN("hidden");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(45463);
    }

    private a(String str) {
        this.value = str;
    }
}
