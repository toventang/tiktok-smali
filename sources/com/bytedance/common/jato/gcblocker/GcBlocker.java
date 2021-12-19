package com.bytedance.common.jato.gcblocker;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

public final class GcBlocker {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26866a = true;

    /* renamed from: b  reason: collision with root package name */
    private static long f26867b = 209715200;

    public static native void nativeRequestBlockGc(long j2);

    private static native void nativeStartBlockGc();

    private static native void nativeStopBlockGc();

    static {
        Covode.recordClassIndex(15850);
    }

    public static void a() {
        MethodCollector.i(14543);
        if (c() && !d()) {
            nativeStartBlockGc();
        }
        MethodCollector.o(14543);
    }

    public static void b() {
        MethodCollector.i(14544);
        if (c()) {
            nativeStopBlockGc();
        }
        MethodCollector.o(14544);
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT > 23 && !new File("/data/local/tmp/disable-gcblocker").exists()) {
            return f26866a;
        }
        return false;
    }

    public static boolean d() {
        if (Runtime.getRuntime().totalMemory() >= f26867b) {
            return true;
        }
        return false;
    }
}
