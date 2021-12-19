package com.facebook.common.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends Exception {
    static {
        Covode.recordClassIndex(28675);
    }

    public final synchronized Throwable fillInStackTrace() {
        MethodCollector.i(4495);
        MethodCollector.o(4495);
        return this;
    }

    public a(String str) {
        super(str);
    }
}
