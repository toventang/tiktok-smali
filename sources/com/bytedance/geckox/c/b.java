package com.bytedance.geckox.c;

import com.bytedance.covode.number.Covode;

public final class b extends RuntimeException {
    private int code;

    static {
        Covode.recordClassIndex(17281);
    }

    public final int getCode() {
        return this.code;
    }

    public b(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
