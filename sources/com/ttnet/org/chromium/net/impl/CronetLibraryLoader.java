package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.c;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import com.ttnet.org.chromium.net.r;

public class CronetLibraryLoader {

    /* renamed from: a  reason: collision with root package name */
    public static long f155519a;

    /* renamed from: b  reason: collision with root package name */
    public static long f155520b;

    /* renamed from: c  reason: collision with root package name */
    public static long f155521c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f155522d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f155523e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final String f155524f = CronetLibraryLoader.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private static final HandlerThread f155525g = new HandlerThread("CronetInit");

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f155526h = false;

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f155527i;

    /* renamed from: j  reason: collision with root package name */
    private static final ConditionVariable f155528j = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    private static String getDefaultUserAgent() {
        return s.a(c.f155223a);
    }

    private static boolean b() {
        if (f155525g.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103440);
    }

    private static void ensureInitializedFromNative() {
        MethodCollector.i(13615);
        synchronized (f155523e) {
            try {
                f155526h = true;
                f155528j.open();
            } catch (Throwable th) {
                MethodCollector.o(13615);
                throw th;
            }
        }
        Context context = c.f155223a;
        if (f155522d || context != null) {
            a(context, null);
            MethodCollector.o(13615);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(13615);
        throw assertionError;
    }

    static void a() {
        MethodCollector.i(13540);
        boolean z = f155522d;
        if (!z && !b()) {
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(13540);
            throw assertionError;
        } else if (f155527i) {
            MethodCollector.o(13540);
        } else {
            f155519a = System.currentTimeMillis();
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.a().a(true, (NetworkChangeNotifierAutoDetect.f) new r());
            f155528j.block();
            if (z || f155526h) {
                nativeCronetInitOnInitThread();
                f155527i = true;
                f155520b = System.currentTimeMillis();
                MethodCollector.o(13540);
                return;
            }
            AssertionError assertionError2 = new AssertionError();
            MethodCollector.o(13540);
            throw assertionError2;
        }
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i2) {
        Process.setThreadPriority(i2);
    }

    public static void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            new Handler(f155525g.getLooper()).post(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r10, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl r11) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetLibraryLoader.a(android.content.Context, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl):void");
    }
}
