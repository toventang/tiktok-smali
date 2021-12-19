package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class Segmentation {
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33040);
    }

    private native long nativeAcquirePersonMask(long j2, long j3);

    private native void nativeReleaseSegmentation(long j2, long j3);

    public ArImage acquirePersonMask() {
        MethodCollector.i(12924);
        ArImage arImage = new ArImage(this.session, nativeAcquirePersonMask(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12924);
        return arImage;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(12819);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseSegmentation(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(12819);
    }

    Segmentation(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
