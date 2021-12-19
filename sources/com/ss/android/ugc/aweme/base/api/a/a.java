package com.ss.android.ugc.aweme.base.api.a;

import com.bytedance.covode.number.Covode;

public class a extends RuntimeException {
    private final int mErrorCode;

    static {
        Covode.recordClassIndex(41855);
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public a(int i2) {
        super("error_code = ".concat(String.valueOf(i2)));
        this.mErrorCode = i2;
    }

    public a(int i2, Throwable th) {
        super("error_code = ".concat(String.valueOf(i2)), th);
        this.mErrorCode = i2;
    }
}
