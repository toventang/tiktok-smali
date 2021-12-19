package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public final class b extends Throwable {
    private String errorMsg;

    static {
        Covode.recordClassIndex(37386);
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public b(String str) {
        super(str);
        this.errorMsg = str;
    }
}
