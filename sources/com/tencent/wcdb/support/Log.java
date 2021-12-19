package com.tencent.wcdb.support;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class Log {

    /* renamed from: a  reason: collision with root package name */
    private static LogCallback f154701a;

    public interface LogCallback {
        static {
            Covode.recordClassIndex(103082);
        }

        void println(int i2, String str, String str2);
    }

    static {
        Covode.recordClassIndex(103081);
    }

    private static native void nativePrintLn(int i2, String str, String str2);

    private static native void nativeSetLogger(int i2, LogCallback logCallback);

    private Log() {
    }

    public static void a(String str, String str2, Object... objArr) {
        a(6, str, a.a(str2, objArr));
    }

    public static void b(String str, String str2, Object... objArr) {
        a(4, str, a.a(str2, objArr));
    }

    public static void a(int i2, String str, String str2) {
        MethodCollector.i(53);
        LogCallback logCallback = f154701a;
        if (logCallback != null) {
            logCallback.println(i2, str, str2);
            MethodCollector.o(53);
            return;
        }
        nativePrintLn(i2, str, str2);
        MethodCollector.o(53);
    }
}
