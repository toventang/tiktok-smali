package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.c;
import java.util.List;
import java.util.Map;

public class EarlyTraceEvent {

    /* renamed from: a  reason: collision with root package name */
    static final Object f155132a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static volatile int f155133b = 0;

    /* renamed from: c  reason: collision with root package name */
    static List<b> f155134c;

    /* renamed from: d  reason: collision with root package name */
    static Map<String, b> f155135d;

    /* renamed from: e  reason: collision with root package name */
    static List<a> f155136e;

    /* renamed from: f  reason: collision with root package name */
    static List<String> f155137f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f155138g;

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final boolean f155139a;

        /* renamed from: b  reason: collision with root package name */
        final String f155140b;

        /* renamed from: c  reason: collision with root package name */
        final long f155141c;

        /* renamed from: d  reason: collision with root package name */
        final long f155142d;

        static {
            Covode.recordClassIndex(103257);
        }
    }

    private static native void nativeRecordEarlyEvent(String str, long j2, long j3, int i2, long j4);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j2, long j3);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j2, long j3);

    public static boolean getBackgroundStartupTracingFlag() {
        return f155138g;
    }

    public static boolean b() {
        if (f155133b == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ boolean f155143g = true;

        /* renamed from: a  reason: collision with root package name */
        final String f155144a;

        /* renamed from: b  reason: collision with root package name */
        final int f155145b = Process.myTid();

        /* renamed from: c  reason: collision with root package name */
        final long f155146c = a();

        /* renamed from: d  reason: collision with root package name */
        final long f155147d = SystemClock.currentThreadTimeMillis();

        /* renamed from: e  reason: collision with root package name */
        long f155148e;

        /* renamed from: f  reason: collision with root package name */
        long f155149f;

        static {
            Covode.recordClassIndex(103258);
        }

        static long a() {
            int i2 = Build.VERSION.SDK_INT;
            return SystemClock.elapsedRealtimeNanos();
        }

        b(String str) {
            this.f155144a = str;
        }
    }

    static boolean a() {
        int i2 = f155133b;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103256);
    }

    private static long d() {
        MethodCollector.i(12239);
        long nativeGetTimeTicksNowUs = (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - b.a();
        MethodCollector.o(12239);
        return nativeGetTimeTicksNowUs;
    }

    static void c() {
        if (!f155134c.isEmpty()) {
            a(f155134c);
            f155134c.clear();
        }
        if (!f155136e.isEmpty()) {
            b(f155136e);
            f155136e.clear();
        }
        if (f155135d.isEmpty() && f155137f.isEmpty()) {
            f155133b = 3;
            f155135d = null;
            f155134c = null;
            f155137f = null;
            f155136e = null;
        }
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        c.a.f155225a.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    private static String c(String str) {
        return str + "@" + Process.myTid();
    }

    private static void a(List<b> list) {
        MethodCollector.i(12237);
        long d2 = d();
        for (b bVar : list) {
            nativeRecordEarlyEvent(bVar.f155144a, bVar.f155146c + d2, bVar.f155148e + d2, bVar.f155145b, bVar.f155149f - bVar.f155147d);
        }
        MethodCollector.o(12237);
    }

    private static void b(List<a> list) {
        MethodCollector.i(12238);
        long d2 = d();
        for (a aVar : list) {
            if (aVar.f155139a) {
                nativeRecordEarlyStartAsyncEvent(aVar.f155140b, aVar.f155141c, aVar.f155142d + d2);
            } else {
                nativeRecordEarlyFinishAsyncEvent(aVar.f155140b, aVar.f155141c, aVar.f155142d + d2);
            }
        }
        MethodCollector.o(12238);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11936);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r2 = new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name: ".concat(java.lang.String.valueOf(r5)));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11936);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5) {
        /*
            r4 = 11936(0x2ea0, float:1.6726E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            boolean r0 = b()
            if (r0 != 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x000f:
            com.ttnet.org.chromium.base.EarlyTraceEvent$b r3 = new com.ttnet.org.chromium.base.EarlyTraceEvent$b
            r3.<init>(r5)
            java.lang.Object r2 = com.ttnet.org.chromium.base.EarlyTraceEvent.f155132a
            monitor-enter(r2)
            boolean r0 = b()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0022:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base.EarlyTraceEvent$b> r1 = com.ttnet.org.chromium.base.EarlyTraceEvent.f155135d
            java.lang.String r0 = c(r5)
            java.lang.Object r0 = r1.put(r0, r3)
            com.ttnet.org.chromium.base.EarlyTraceEvent$b r0 = (com.ttnet.org.chromium.base.EarlyTraceEvent.b) r0
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0035
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0035:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiple pending trace events can't have the same name: "
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r2
        L_0x0048:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    public static void b(String str) {
        MethodCollector.i(12082);
        if (!a()) {
            MethodCollector.o(12082);
            return;
        }
        synchronized (f155132a) {
            try {
                if (a()) {
                    b remove = f155135d.remove(c(str));
                    if (remove == null) {
                        MethodCollector.o(12082);
                    } else if (!b.f155143g && remove.f155148e != 0) {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.o(12082);
                        throw assertionError;
                    } else if (b.f155143g || remove.f155149f == 0) {
                        remove.f155148e = b.a();
                        remove.f155149f = SystemClock.currentThreadTimeMillis();
                        f155134c.add(remove);
                        if (f155133b == 2) {
                            c();
                        }
                        MethodCollector.o(12082);
                    } else {
                        AssertionError assertionError2 = new AssertionError();
                        MethodCollector.o(12082);
                        throw assertionError2;
                    }
                }
            } finally {
                MethodCollector.o(12082);
            }
        }
    }
}
