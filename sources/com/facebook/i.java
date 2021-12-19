package com.facebook;

import com.bytedance.covode.number.Covode;

public final class i extends j {
    static final long serialVersionUID = 1;
    private int errorCode;
    private String failingUrl;

    static {
        Covode.recordClassIndex(28879);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    @Override // com.facebook.j
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + getErrorCode() + ", message: " + getMessage() + ", url: " + getFailingUrl() + "}";
    }

    public i(String str, int i2, String str2) {
        super(str);
        this.errorCode = i2;
        this.failingUrl = str2;
    }
}
