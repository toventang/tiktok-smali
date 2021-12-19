package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.c.e;

public final class gx extends e {
    static {
        Covode.recordClassIndex(93613);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "SecurityExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof SecurityException) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("com.google.android.gms.common.internal.BaseGmsClient".equals(stackTraceElement.getClassName()) && "a".equals(stackTraceElement.getMethodName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
