package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.c;
import com.bytedance.apm.q.a;
import com.bytedance.apm.q.s;
import com.bytedance.covode.number.Covode;

public class ThreadMonitor {
    static {
        Covode.recordClassIndex(14337);
    }

    private static boolean isDebuggable() {
        return a.b(c.f24685a);
    }

    private static boolean isLocalChannel() {
        return c.f();
    }

    public static void sleepMonitor(long j2) {
        if (s.a() && j2 > 10 && !isDebuggable()) {
            isLocalChannel();
        }
        Thread.sleep(j2);
    }
}
