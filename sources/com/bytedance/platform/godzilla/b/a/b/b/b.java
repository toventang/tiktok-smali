package com.bytedance.platform.godzilla.b.a.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.a.a.b.a;

public final class b implements a {
    static {
        Covode.recordClassIndex(25638);
    }

    @Override // com.bytedance.platform.godzilla.b.a.a.b.a
    public final boolean a(Object obj, Throwable th) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (th instanceof ClassNotFoundException) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getMethodName().contains("installProvider")) {
                    return true;
                }
            }
        }
        return false;
    }
}
