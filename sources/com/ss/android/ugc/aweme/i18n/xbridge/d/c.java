package com.ss.android.ugc.aweme.i18n.xbridge.d;

import com.bytedance.covode.number.Covode;

public enum c {
    CACHE("y+2T0brqfIqkZDbYHfFiN/8XI5fyqrwX5cSWeGVK0ys="),
    FILES("y+2T0brqfIqkZDbYHfFiN/8XI5L6pbEB5cSWeGVK0ys=");
    
    private final String token;

    public final String getToken() {
        return this.token;
    }

    static {
        Covode.recordClassIndex(63761);
    }

    private c(String str) {
        this.token = str;
    }
}
