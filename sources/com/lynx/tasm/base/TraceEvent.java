package com.lynx.tasm.base;

import android.os.Trace;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.a;
import com.lynx.tasm.LynxEnv;

public class TraceEvent {
    static {
        Covode.recordClassIndex(34873);
    }

    private static native void nativeBeginSection(long j2, String str);

    private static native boolean nativeCategoryEnabled(long j2);

    private static native void nativeEndSection(long j2, String str);

    private static native void nativeFPSTrace(long j2, long j3);

    private static native void nativeFlush();

    private static native void nativeInstant(long j2, String str, long j3, String str2);

    private static native boolean nativeRegisterTraceBackend(long j2);

    private static native void nativeScreenshot(String str);

    public static boolean a() {
        if (a.f55043c.booleanValue() || LynxEnv.b().f55538h) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        a(0, str);
    }

    public static void b(String str) {
        b(0, str);
    }

    public static void a(String str, String str2) {
        a(str, System.nanoTime() / 1000, str2);
    }

    public static void a(long j2, String str) {
        MethodCollector.i(13041);
        if (a()) {
            if (!a.f55044d.booleanValue()) {
                nativeBeginSection(j2, str);
                MethodCollector.o(13041);
                return;
            }
            Trace.beginSection(str);
        }
        MethodCollector.o(13041);
    }

    public static void b(long j2, String str) {
        MethodCollector.i(13127);
        if (a()) {
            if (!a.f55044d.booleanValue()) {
                nativeEndSection(j2, str);
                MethodCollector.o(13127);
                return;
            }
            Trace.endSection();
        }
        MethodCollector.o(13127);
    }

    private static void a(String str, long j2, String str2) {
        MethodCollector.i(13210);
        if (a()) {
            if (!a.f55044d.booleanValue()) {
                nativeInstant(1, str, j2, str2);
                MethodCollector.o(13210);
                return;
            }
            Trace.beginSection(str);
            Trace.endSection();
        }
        MethodCollector.o(13210);
    }
}
