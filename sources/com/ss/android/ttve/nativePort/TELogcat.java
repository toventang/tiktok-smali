package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TELogcat {
    private static native void nativeLog(byte b2, String str, String str2);

    private static native void nativeSetLogLevel(byte b2);

    static {
        Covode.recordClassIndex(37727);
        d.b();
    }

    public static void setLogLevel(byte b2) {
        MethodCollector.i(2315);
        nativeSetLogLevel(b2);
        MethodCollector.o(2315);
    }

    public static void Log(byte b2, String str, String str2) {
        MethodCollector.i(2314);
        nativeLog(b2, str, str2);
        MethodCollector.o(2314);
    }
}
