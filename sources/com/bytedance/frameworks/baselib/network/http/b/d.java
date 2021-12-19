package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class d extends IOException {
    private static final long serialVersionUID = -7281385706782665299L;

    static {
        Covode.recordClassIndex(16983);
    }

    public d() {
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
