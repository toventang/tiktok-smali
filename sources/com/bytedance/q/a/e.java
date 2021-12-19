package com.bytedance.q.a;

import com.bytedance.covode.number.Covode;

public final class e extends RuntimeException {
    private int code;

    static {
        Covode.recordClassIndex(25889);
    }

    public final int getCode() {
        return this.code;
    }

    public e(String str, Throwable th) {
        super(str, th);
    }

    public e(int i2, String str, Throwable th) {
        super(str + ":[code:" + i2 + "]", th);
        this.code = i2;
    }
}
