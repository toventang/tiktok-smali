package com.ss.android.ugc.musicprovider;

import com.bytedance.covode.number.Covode;

public final class a extends Exception {
    private int errorCode;
    private String errorMsg;
    private String errorUrl;

    static {
        Covode.recordClassIndex(97910);
    }

    public a() {
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getErrorUrl() {
        return this.errorUrl;
    }

    public final void setErrorCode(int i2) {
        this.errorCode = i2;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setErrorUrl(String str) {
        this.errorUrl = str;
    }

    public a(int i2, String str) {
        super(str);
        this.errorCode = i2;
        this.errorMsg = str;
    }

    public a(int i2, String str, String str2) {
        super(str);
        this.errorCode = i2;
        this.errorMsg = str;
        this.errorUrl = str2;
    }
}
