package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class Metrics {
    public final Map<String, HistogramInfo> map = new HashMap();

    static {
        Covode.recordClassIndex(106626);
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    Metrics() {
    }

    public static void enable() {
        MethodCollector.i(13016);
        nativeEnable();
        MethodCollector.o(13016);
    }

    public static Metrics getAndReset() {
        MethodCollector.i(13110);
        Metrics nativeGetAndReset = nativeGetAndReset();
        MethodCollector.o(13110);
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
            Covode.recordClassIndex(106627);
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
