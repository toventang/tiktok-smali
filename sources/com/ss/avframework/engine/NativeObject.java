package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeObject {
    public long mNativeObj;

    static {
        Covode.recordClassIndex(99822);
    }

    private native void nativeRelease(long j2);

    private long getNativeObj() {
        return this.mNativeObj;
    }

    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        MethodCollector.i(14418);
        long j2 = this.mNativeObj;
        if (j2 != 0) {
            nativeRelease(j2);
            this.mNativeObj = 0;
        }
        MethodCollector.o(14418);
    }

    public void setNativeObj(long j2) {
        this.mNativeObj = j2;
    }
}
