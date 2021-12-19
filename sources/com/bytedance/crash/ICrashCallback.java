package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public interface ICrashCallback {
    static {
        Covode.recordClassIndex(16120);
    }

    void onCrash(CrashType crashType, String str, Thread thread);
}
