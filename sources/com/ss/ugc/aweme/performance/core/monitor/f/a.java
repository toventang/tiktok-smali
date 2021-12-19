package com.ss.ugc.aweme.performance.core.monitor.f;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(101823);
    }

    public static boolean a(StackTraceElement stackTraceElement) {
        if (stackTraceElement.getClassName().startsWith("com.bytedance.ss.handler") || stackTraceElement.getClassName().startsWith("android")) {
            return false;
        }
        return true;
    }
}
