package com.ss.android.medialib.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;

public class FrameThumb {
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int[] nativeGetOldFrameThumbnail(long j2, int i2, int i3);

    private native int[] nativeInitVideoToGraph(long j2, String str, int i2, int i3, boolean z);

    private native int nativeStart(long j2);

    private native void nativeStop(long j2);

    private native void nativeStopGetFrameThumbnail(long j2);

    private native int nativeUninitVideoToGraph(long j2);

    static {
        Covode.recordClassIndex(36888);
        d.c();
    }

    public void stopGetFrameThumbnail() {
        MethodCollector.i(3961);
        nativeStopGetFrameThumbnail(this.handle);
        MethodCollector.o(3961);
    }

    public FrameThumb() {
        MethodCollector.i(5589);
        MethodCollector.o(5589);
    }

    public synchronized int start() {
        MethodCollector.i(3963);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(3963);
            return -1;
        }
        int nativeStart = nativeStart(j2);
        MethodCollector.o(3963);
        return nativeStart;
    }

    public synchronized void stop() {
        MethodCollector.i(3966);
        long j2 = this.handle;
        if (j2 != 0) {
            nativeStop(j2);
        }
        MethodCollector.o(3966);
    }

    public int unInitVideoToGraph() {
        int nativeUninitVideoToGraph;
        MethodCollector.i(3704);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(3704);
            return -1;
        }
        nativeStopGetFrameThumbnail(j2);
        synchronized (this) {
            try {
                nativeUninitVideoToGraph = nativeUninitVideoToGraph(this.handle);
                this.handle = 0;
            } finally {
                MethodCollector.o(3704);
            }
        }
        return nativeUninitVideoToGraph;
    }

    public int[] getFrameThumbnail(int i2) {
        return getFrameThumbnail(i2, 1);
    }

    public int[] initVideoToGraph(String str) {
        return initVideoToGraph(str, -1, -1);
    }

    public synchronized int[] getFrameThumbnail(int i2, int i3) {
        MethodCollector.i(3959);
        long j2 = this.handle;
        if (j2 == 0) {
            MethodCollector.o(3959);
            return null;
        }
        int[] nativeGetOldFrameThumbnail = nativeGetOldFrameThumbnail(j2, i2, i3);
        MethodCollector.o(3959);
        return nativeGetOldFrameThumbnail;
    }

    public synchronized int[] initVideoToGraph(String str, int i2, int i3) {
        int[] initVideoToGraph;
        MethodCollector.i(5591);
        initVideoToGraph = initVideoToGraph(str, i2, i3, false);
        MethodCollector.o(5591);
        return initVideoToGraph;
    }

    public synchronized int[] initVideoToGraph(String str, int i2, int i3, boolean z) {
        MethodCollector.i(5593);
        long j2 = this.handle;
        if (j2 == 0) {
            int[] iArr = new int[9];
            iArr[0] = -10000;
            MethodCollector.o(5593);
            return iArr;
        }
        int[] nativeInitVideoToGraph = nativeInitVideoToGraph(j2, str, i2, i3, z);
        MethodCollector.o(5593);
        return nativeInitVideoToGraph;
    }
}
