package com.ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

public class NetException extends Exception {
    private int status_code;

    static {
        Covode.recordClassIndex(95292);
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public NetException(int i2, String str) {
        super(str);
        this.status_code = i2;
    }
}
