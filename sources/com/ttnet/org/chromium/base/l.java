package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public final class l extends RuntimeException {
    private static final long serialVersionUID = -2243843843843438438L;

    static {
        Covode.recordClassIndex(103316);
    }

    public l() {
    }

    public l(String str) {
        super(str);
    }

    public l(Throwable th) {
        super(th);
    }

    public l(String str, Throwable th) {
        super(str, th);
    }
}
