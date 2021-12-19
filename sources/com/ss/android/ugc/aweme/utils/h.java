package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.c.e;

public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f143050b;

    static {
        Covode.recordClassIndex(93616);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "ActivityTrimMemoryExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof ArrayIndexOutOfBoundsException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTrimMemory".equals(stackTraceElement.getMethodName())) {
                    f143050b = true;
                    return true;
                }
            }
        }
        return false;
    }
}
