package com.ss.android.ugc.aweme.s;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(78690);
    }

    public static void a(Runnable runnable) {
        SystemClock.uptimeMillis();
        runnable.run();
        Thread.currentThread();
        SystemClock.uptimeMillis();
    }
}
