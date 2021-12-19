package com.ss.ttvideoengine.n.b;

import com.bytedance.covode.number.Covode;

public final class b extends Exception {
    private final int code;

    static {
        Covode.recordClassIndex(101724);
    }

    public final int getCode() {
        return this.code;
    }

    public b(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
