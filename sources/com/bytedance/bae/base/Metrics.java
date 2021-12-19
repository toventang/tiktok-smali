package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class Metrics {
    public final Map<String, HistogramInfo> map = new HashMap();

    static {
        Covode.recordClassIndex(15338);
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    Metrics() {
    }

    public static void enable() {
        MethodCollector.i(63);
        nativeEnable();
        MethodCollector.o(63);
    }

    public static Metrics getAndReset() {
        MethodCollector.i(65);
        Metrics nativeGetAndReset = nativeGetAndReset();
        MethodCollector.o(65);
        return nativeGetAndReset;
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        static {
            Covode.recordClassIndex(15339);
        }

        public void addSample(int i2, int i3) {
            this.samples.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public HistogramInfo(int i2, int i3, int i4) {
            this.min = i2;
            this.max = i3;
            this.bucketCount = i4;
        }
    }
}
