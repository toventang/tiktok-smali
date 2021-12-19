package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.e;
import java.util.concurrent.TimeoutException;

public final class fm extends e {
    static {
        Covode.recordClassIndex(93528);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "PerformanceFinalizeFix";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof TimeoutException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getClassName().startsWith("java.lang.Daemons") && "doFinalize".equals(stackTraceElement.getMethodName())) {
                    g.a(g.a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
