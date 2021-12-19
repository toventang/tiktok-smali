package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;

public final class d extends Exception {
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(17189);
    }

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public d(int i2, String str) {
        this.statusCode = i2;
        this.message = str;
    }
}
