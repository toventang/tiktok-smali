package com.bytedance.q.a;

import com.bytedance.covode.number.Covode;

public final class d extends Exception {
    public int code;

    static {
        Covode.recordClassIndex(25888);
    }

    public d(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
