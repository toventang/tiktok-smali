package com.bytedance.c.a.a.a;

import com.bytedance.covode.number.Covode;

public final class e extends Exception {
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(15741);
    }

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public e(int i2, String str) {
        this.statusCode = i2;
        this.message = str;
    }
}
