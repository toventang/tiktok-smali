package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class FileResourceFinder implements ResourceFinder {
    private final String mDir;

    static {
        Covode.recordClassIndex(2834);
    }

    private static native long nativeCreateFileResourceFinder(long j2, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j2) {
    }

    public FileResourceFinder(String str) {
        this.mDir = str;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j2) {
        MethodCollector.i(613);
        long nativeCreateFileResourceFinder = nativeCreateFileResourceFinder(j2, this.mDir);
        MethodCollector.o(613);
        return nativeCreateFileResourceFinder;
    }
}
