package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class hf {
    static {
        Covode.recordClassIndex(93627);
    }

    public static final String a(int i2) {
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        StringBuilder sb = new StringBuilder();
        l.b(stackTrace, "");
        int length = stackTrace.length;
        for (int i3 = 0; i3 < length; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (i3 >= i2) {
                return sb.toString();
            }
            sb.append("at " + stackTraceElement + '\n');
        }
        return sb.toString();
    }
}
