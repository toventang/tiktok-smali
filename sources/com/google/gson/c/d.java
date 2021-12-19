package com.google.gson.c;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class d extends IOException {
    private static final long serialVersionUID = 1;

    static {
        Covode.recordClassIndex(33920);
    }

    public d(String str) {
        super(str);
    }

    public d(Throwable th) {
        initCause(th);
    }

    public d(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
