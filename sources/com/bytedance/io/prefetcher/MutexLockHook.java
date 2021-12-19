package com.bytedance.io.prefetcher;

import com.bytedance.covode.number.Covode;

public class MutexLockHook {
    static {
        Covode.recordClassIndex(23850);
    }

    public static native int mutexHook(String str);
}
