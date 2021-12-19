package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;

public class c extends b {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    static {
        Covode.recordClassIndex(16982);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public c(int i2, String str) {
        super(str);
        this.statusCode = i2;
    }
}
