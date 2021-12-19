package com.ss.ugc.effectplatform.f;

import com.bytedance.covode.number.Covode;

public final class e extends Exception {
    private int statusCode;

    static {
        Covode.recordClassIndex(102401);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public e(int i2, String str) {
        super(str);
        this.statusCode = i2;
    }
}
