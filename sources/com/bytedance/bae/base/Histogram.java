package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

class Histogram {
    private final long handle;

    static {
        Covode.recordClassIndex(15330);
    }

    private static native void nativeAddSample(long j2, int i2);

    private static native long nativeCreateCounts(String str, int i2, int i3, int i4);

    private static native long nativeCreateEnumeration(String str, int i2);

    private Histogram(long j2) {
        this.handle = j2;
    }

    public void addSample(int i2) {
        MethodCollector.i(2923);
        nativeAddSample(this.handle, i2);
        MethodCollector.o(2923);
    }

    public static Histogram createEnumeration(String str, int i2) {
        MethodCollector.i(2922);
        Histogram histogram = new Histogram(nativeCreateEnumeration(str, i2));
        MethodCollector.o(2922);
        return histogram;
    }

    public static Histogram createCounts(String str, int i2, int i3, int i4) {
        MethodCollector.i(2918);
        Histogram histogram = new Histogram(nativeCreateCounts(str, i2, i3, i4));
        MethodCollector.o(2918);
        return histogram;
    }
}
