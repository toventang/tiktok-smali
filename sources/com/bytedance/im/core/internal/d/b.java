package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;

public final class b extends Exception {
    private final int mErrorCode;

    static {
        Covode.recordClassIndex(23080);
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public b(int i2) {
        this.mErrorCode = i2;
    }
}
