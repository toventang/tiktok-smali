package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a;

import com.bytedance.covode.number.Covode;

public enum a {
    COLDUP_FULL("coldup_full"),
    COLDUP_DIFF("coldup"),
    WS_DIFF("frontier"),
    FONT_DIFF("font"),
    LOADER_DIFF("loader_diff"),
    MISSING_PAGE("missing_page");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(66122);
    }

    private a(String str) {
        this.value = str;
    }
}
