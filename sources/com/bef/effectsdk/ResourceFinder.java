package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;

public interface ResourceFinder {
    static {
        Covode.recordClassIndex(2861);
    }

    long createNativeResourceFinder(long j2);

    void release(long j2);
}
