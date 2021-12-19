package com.twitter.sdk.android.core.identity;

import com.bytedance.covode.number.Covode;

final class i extends Exception {
    private static final long serialVersionUID = -7397331487240298819L;
    private final int errorCode;
    private final String failingUrl;

    static {
        Covode.recordClassIndex(103612);
    }

    i(int i2, String str, String str2) {
        super(str);
        this.errorCode = i2;
        this.failingUrl = str2;
    }
}
