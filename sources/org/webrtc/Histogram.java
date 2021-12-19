package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public class Histogram {
    private final long handle;

    static {
        Covode.recordClassIndex(106607);
    }

    private static native void nativeAddSample(long j2, int i2);

    private static native long nativeCreateCounts(String str, int i2, int i3, int i4);

    private static native long nativeCreateEnumeration(String str, int i2);

    private Histogram(long j2) {
        this.handle = j2;
    }

    public void addSample(int i2) {
        MethodCollector.i(7768);
        nativeAddSample(this.handle, i2);
        MethodCollector.o(7768);
    }

    public static Histogram createEnumeration(String str, int i2) {
        MethodCollector.i(7766);
        Histogram histogram = new Histogram(nativeCreateEnumeration(str, i2));
        MethodCollector.o(7766);
        return histogram;
    }

    public static Histogram createCounts(String str, int i2, int i3, int i4) {
        MethodCollector.i(7763);
        Histogram histogram = new Histogram(nativeCreateCounts(str, i2, i3, i4));
        MethodCollector.o(7763);
        return histogram;
    }
}
