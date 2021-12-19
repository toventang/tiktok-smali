package com.benchmark.port.nativePort;

import com.benchmark.tools.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LogcatInvoker {
    private static native void nativeSetLogLevel(byte b2);

    static {
        Covode.recordClassIndex(3032);
        a.a();
        if (!a.f6364a) {
            a.a();
        }
    }

    public static void a(byte b2) {
        MethodCollector.i(6091);
        if (a.f6364a) {
            nativeSetLogLevel(b2);
        }
        MethodCollector.o(6091);
    }
}
