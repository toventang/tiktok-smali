package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;

public final class b extends Exception {
    private int mResponseCode;

    static {
        Covode.recordClassIndex(15872);
    }

    public final int getResponseCode() {
        return this.mResponseCode;
    }

    public b(int i2, String str) {
        super(str);
        this.mResponseCode = i2;
    }
}
