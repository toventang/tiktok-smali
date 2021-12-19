package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public class AbsResult {
    protected int mCode = -1;
    protected int mDetailCode = -1;
    protected String mMessage = "";

    static {
        Covode.recordClassIndex(17662);
    }

    public int getCode() {
        return this.mCode;
    }

    public int getDetailCode() {
        return this.mDetailCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public boolean isSuccess() {
        if (this.mCode == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AbsResult{mCode=" + this.mCode + ", mDetailCode=" + this.mDetailCode + ", mMessage='" + this.mMessage + '\'' + '}';
    }

    public AbsResult withDetailCode(int i2) {
        this.mDetailCode = i2;
        return this;
    }

    public AbsResult withErrorCode(int i2) {
        this.mCode = i2;
        return this;
    }

    public AbsResult withMessage(String str) {
        this.mMessage = str;
        return this;
    }
}
