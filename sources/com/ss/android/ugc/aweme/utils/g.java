package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.c.e;

public final class g extends e {
    static {
        Covode.recordClassIndex(93559);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "ActivityTopPositionAlreadySetPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof IllegalStateException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
