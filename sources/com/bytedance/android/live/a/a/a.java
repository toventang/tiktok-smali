package com.bytedance.android.live.a.a;

import com.bytedance.covode.number.Covode;

public class a extends Exception {
    private final int mErrorCode;

    static {
        Covode.recordClassIndex(3514);
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        return " TYPE = ApiException, errorCode = " + this.mErrorCode + " " + super.getMessage();
    }

    public a(int i2) {
        this.mErrorCode = i2;
    }

    public a(int i2, Throwable th) {
        super(th);
        this.mErrorCode = i2;
    }
}
