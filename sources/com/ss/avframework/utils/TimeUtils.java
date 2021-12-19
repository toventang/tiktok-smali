package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.MediaEngineFactory;

public class TimeUtils {
    private static native long nativeNanoTime();

    private static native long nativeTimeUTCMicros();

    static {
        Covode.recordClassIndex(100622);
        MediaEngineFactory.getVersion();
    }

    public static long nanoTime() {
        MethodCollector.i(11888);
        long nativeNanoTime = nativeNanoTime();
        MethodCollector.o(11888);
        return nativeNanoTime;
    }

    public static long timeUTCMicros() {
        MethodCollector.i(12205);
        long nativeTimeUTCMicros = nativeTimeUTCMicros();
        MethodCollector.o(12205);
        return nativeTimeUTCMicros;
    }

    public static long currentTimeMs() {
        MethodCollector.i(12040);
        long nativeNanoTime = nativeNanoTime() / 1000000;
        MethodCollector.o(12040);
        return nativeNanoTime;
    }
}
