package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends Exception {
    private final int errorCode;
    private final String errorMsg;

    static {
        Covode.recordClassIndex(15660);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, String str) {
        super(str);
        l.c(str, "");
        this.errorCode = i2;
        this.errorMsg = str;
    }
}
