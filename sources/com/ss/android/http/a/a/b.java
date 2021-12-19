package com.ss.android.http.a.a;

import com.bytedance.covode.number.Covode;

public final class b extends a {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    static {
        Covode.recordClassIndex(36755);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public b(int i2, String str) {
        super(str);
        this.statusCode = i2;
    }
}
