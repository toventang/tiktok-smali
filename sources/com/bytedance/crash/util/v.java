package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;

public final class v {
    static {
        Covode.recordClassIndex(16404);
    }

    public static void a(Object obj) {
        if (m.f27730g.isDebugMode()) {
            String.valueOf(obj);
        }
    }

    public static void b(Object obj) {
        if (m.f27730g.isDebugMode()) {
            String.valueOf(obj);
        }
    }

    public static void a(String str, Object obj) {
        if (m.f27730g.isDebugMode()) {
            new StringBuilder().append(str).append(" ").append(obj);
        }
    }
}
