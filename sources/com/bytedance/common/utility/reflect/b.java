package com.bytedance.common.utility.reflect;

import com.bytedance.covode.number.Covode;

public final class b extends RuntimeException {
    private static final long serialVersionUID = -2243843843843438438L;

    static {
        Covode.recordClassIndex(15927);
    }

    public b() {
    }

    public b(String str) {
        super(str);
    }

    public b(Throwable th) {
        super(th);
    }

    public b(String str, Throwable th) {
        super(str, th);
    }
}
