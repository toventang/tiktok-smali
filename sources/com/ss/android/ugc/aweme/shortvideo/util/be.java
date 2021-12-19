package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class be {
    static {
        Covode.recordClassIndex(86618);
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        for (StackTraceElement stackTraceElement : currentThread.getStackTrace()) {
            sb.append(stackTraceElement.toString()).append("\n");
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
