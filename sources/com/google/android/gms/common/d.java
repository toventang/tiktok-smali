package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;

public final class d extends Exception {
    public final int errorCode;

    static {
        Covode.recordClassIndex(31354);
    }

    public d(int i2) {
        this.errorCode = i2;
    }
}
