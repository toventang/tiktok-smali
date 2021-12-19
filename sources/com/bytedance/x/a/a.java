package com.bytedance.x.a;

import com.bytedance.covode.number.Covode;

public final class a extends Exception {
    public final String url;

    static {
        Covode.recordClassIndex(28201);
    }

    public a(String str, Throwable th) {
        super("fetch failed ".concat(String.valueOf(str)), th);
        this.url = str;
    }
}
