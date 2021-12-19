package com.bytedance.geckox.c;

import com.bytedance.covode.number.Covode;

public final class c extends RuntimeException {
    static {
        Covode.recordClassIndex(17282);
    }

    public c(String str, Throwable th) {
        super(str, th);
    }
}
