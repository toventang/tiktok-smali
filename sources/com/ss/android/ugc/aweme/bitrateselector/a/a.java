package com.ss.android.ugc.aweme.bitrateselector.a;

import com.bytedance.covode.number.Covode;

public final class a extends Exception {
    private final int code;

    static {
        Covode.recordClassIndex(42271);
    }

    public final int getCode() {
        return this.code;
    }

    public a(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
