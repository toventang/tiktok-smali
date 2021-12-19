package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TimestampAligner {
    private volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    static {
        Covode.recordClassIndex(106690);
    }

    private static native long nativeCreateTimestampAligner();

    private static native void nativeReleaseTimestampAligner(long j2);

    private static native long nativeRtcTimeNanos();

    private static native long nativeTranslateTimestamp(long j2, long j3);

    public static long getRtcTimeNanos() {
        MethodCollector.i(11190);
        long nativeRtcTimeNanos = nativeRtcTimeNanos();
        MethodCollector.o(11190);
        return nativeRtcTimeNanos;
    }

    public TimestampAligner() {
        MethodCollector.i(11189);
        MethodCollector.o(11189);
    }

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner == 0) {
            throw new IllegalStateException("TimestampAligner has been disposed.");
        }
    }

    public void dispose() {
        MethodCollector.i(11192);
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0;
        MethodCollector.o(11192);
    }

    public long translateTimestamp(long j2) {
        MethodCollector.i(11191);
        checkNativeAlignerExists();
        long nativeTranslateTimestamp = nativeTranslateTimestamp(this.nativeTimestampAligner, j2);
        MethodCollector.o(11191);
        return nativeTranslateTimestamp;
    }
}
