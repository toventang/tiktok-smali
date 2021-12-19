package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

public class LynxNativeMemoryTracer {

    /* renamed from: a  reason: collision with root package name */
    private static int f55758a = 1;

    private static native void nativeStartTracing(int i2);

    private static native void nativeStopTracing();

    private static native void nativeWriteRecordsToFile(String str);

    static {
        Covode.recordClassIndex(34868);
    }
}
