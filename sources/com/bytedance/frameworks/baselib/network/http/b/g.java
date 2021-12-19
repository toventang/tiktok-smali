package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class g extends IOException {
    private static final long serialVersionUID = -210264743726619965L;

    static {
        Covode.recordClassIndex(16986);
    }

    public g() {
    }

    public g(String str) {
        super(str);
    }

    public g(Throwable th) {
        initCause(th);
    }

    public g(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
