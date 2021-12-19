package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public abstract class CpuFeatures {
    static {
        Covode.recordClassIndex(103255);
    }

    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();
}
