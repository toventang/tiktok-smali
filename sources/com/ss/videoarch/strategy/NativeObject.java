package com.ss.videoarch.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeObject {
    protected long mNativeObj;

    static {
        Covode.recordClassIndex(102915);
    }

    private native void nativeRelease(long j2);

    private long getNativeObj() {
        return this.mNativeObj;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        MethodCollector.i(6418);
        long j2 = this.mNativeObj;
        if (j2 != 0) {
            nativeRelease(j2);
            this.mNativeObj = 0;
        }
        MethodCollector.o(6418);
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j2) {
        this.mNativeObj = j2;
    }
}
