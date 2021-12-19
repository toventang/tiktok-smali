package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class f extends IOException {
    private static final long serialVersionUID = -5588326043064908201L;

    static {
        Covode.recordClassIndex(16985);
    }

    public f() {
    }

    public f(String str) {
        super(str);
    }

    public f(Throwable th) {
        initCause(th);
    }

    public f(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
