package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public interface IOOMCallback {
    static {
        Covode.recordClassIndex(16122);
    }

    void onCrash(CrashType crashType, Throwable th, Thread thread, long j2);
}
