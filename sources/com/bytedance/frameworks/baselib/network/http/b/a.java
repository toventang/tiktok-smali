package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class a extends IOException {
    static {
        Covode.recordClassIndex(16980);
    }

    public a() {
    }

    public a(String str) {
        super(str);
    }

    public a(Throwable th) {
        initCause(th);
    }

    public a(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
