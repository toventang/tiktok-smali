package com.ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

public class StatusCodeException extends Exception {
    private int mStatusCode;

    static {
        Covode.recordClassIndex(95293);
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i2) {
        this.mStatusCode = i2;
    }

    public StatusCodeException(int i2, String str) {
        super(str);
        this.mStatusCode = i2;
    }
}
