package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.util.aa;
import com.bytedance.crash.util.r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

public class NativeImpl {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f27758a;

    /* renamed from: b  reason: collision with root package name */
    public static long f27759b = 100;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27760c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f27761d;

    /* renamed from: e  reason: collision with root package name */
    private static String f27762e;

    private static native boolean doCheckNativeCrash();

    public static native int doCreateCallbackThread();

    static native void doDelayCheck();

    static native String doGetCrashHeader(String str);

    public static native long doGetNpthCatchAddr();

    static native void doRebuildTombstone(String str, String str2, String str3);

    public static native void doSetAlogFlushAddr(long j2);

    public static native void doSetLocalCoreInfo(int i2);

    private static native void doSetMallocInfoFunctionAddress(long j2);

    private static native void doSetNativeCallbackAddr(long j2);

    public static native void doSetOnlineCoreInfo(int i2);

    private static native void doSetUploadEnd();

    private static native int doStartNativeCrashMonitor(int i2, String str, String str2, String str3);

    static {
        Covode.recordClassIndex(16270);
    }

    public static boolean b() {
        MethodCollector.i(9471);
        if (!f27758a) {
            MethodCollector.o(9471);
            return false;
        }
        try {
            boolean doCheckNativeCrash = doCheckNativeCrash();
            MethodCollector.o(9471);
            return doCheckNativeCrash;
        } catch (Throwable unused) {
            MethodCollector.o(9471);
            return false;
        }
    }

    public static void c() {
        MethodCollector.i(9622);
        if (!f27758a) {
            MethodCollector.o(9622);
            return;
        }
        doSetUploadEnd();
        MethodCollector.o(9622);
    }

    public static boolean a() {
        if (f27761d) {
            return f27758a;
        }
        f27761d = true;
        if (!f27758a) {
            boolean a2 = aa.a("npth");
            f27758a = a2;
            if (a2) {
                f27758a = aa.a("npth_tools");
            }
        }
        return f27758a;
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    public static String b(Context context) {
        String str = f27762e;
        if (str != null) {
            return str;
        }
        if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
            f27762e = context.getApplicationInfo().nativeLibraryDir;
        } else {
            f27762e = f.a();
            f27760c = true;
            f.a("npth_dumper", "3.1.6-rc.13-ttp");
        }
        return f27762e;
    }

    public static boolean a(Context context) {
        MethodCollector.i(9289);
        if (a()) {
            try {
                doStartNativeCrashMonitor(Build.VERSION.SDK_INT, b(context), r.j(context) + "/npth", m.e());
            } catch (Throwable unused) {
                MethodCollector.o(9289);
                return false;
            }
        }
        MethodCollector.o(9289);
        return true;
    }
}
