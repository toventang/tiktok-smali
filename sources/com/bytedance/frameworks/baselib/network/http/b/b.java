package com.bytedance.frameworks.baselib.network.http.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class b extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    static {
        Covode.recordClassIndex(16981);
    }

    public b() {
    }

    public b(String str) {
        super(str);
    }

    public b(Throwable th) {
        initCause(th);
    }

    public b(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
