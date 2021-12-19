package com.ss.android.agilelogger.a;

import com.bytedance.covode.number.Covode;

public final class a extends RuntimeException {
    private static final long serialVersionUID = -5365630128856068164L;

    static {
        Covode.recordClassIndex(36531);
    }

    public a() {
    }

    public a(String str) {
        super(str);
    }

    public a(Throwable th) {
        super(th);
    }

    public a(String str, Throwable th) {
        super(str, th);
    }
}
