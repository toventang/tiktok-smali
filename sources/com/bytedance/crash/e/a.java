package com.bytedance.crash.e;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.d;
import com.bytedance.crash.j.b;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f27522d;

    /* renamed from: e  reason: collision with root package name */
    private static a f27523e;

    /* renamed from: j  reason: collision with root package name */
    private static final ThreadLocal<Boolean> f27524j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private static final ArrayList<b> f27525k = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public c f27526a;

    /* renamed from: b  reason: collision with root package name */
    public c f27527b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f27528c = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f27529f;

    /* renamed from: g  reason: collision with root package name */
    private volatile int f27530g;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f27531h;

    /* renamed from: i  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f27532i = new ConcurrentHashMap<>();

    public static a a() {
        if (f27523e == null) {
            f27523e = new a();
        }
        return f27523e;
    }

    static {
        Covode.recordClassIndex(16172);
    }

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f27529f = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static boolean b() {
        Boolean bool = f27524j.get();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    private static int e() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList<b> arrayList = f27525k;
            if (i2 >= arrayList.size()) {
                break;
            }
            try {
                try {
                    i3 |= arrayList.get(i2).a();
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                }
                i2++;
            } catch (Throwable unused) {
            }
        }
        return i3;
    }

    private void c() {
        MethodCollector.i(9571);
        synchronized (this) {
            try {
                this.f27531h--;
            } finally {
                MethodCollector.o(9571);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f27531h != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    private static void d() {
        File a2 = r.a(m.f27724a);
        File a3 = r.a();
        if (!j.b(a2) || !j.b(a3)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!b.a().f27622c && com.bytedance.crash.util.b.b(m.f27724a) && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static Throwable f() {
        int i2 = 0;
        while (true) {
            ArrayList<b> arrayList = f27525k;
            if (i2 >= arrayList.size()) {
                break;
            }
            try {
                arrayList.get(i2);
                i2++;
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27529f;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private static boolean b(Thread thread, Throwable th) {
        ICrashFilter crashFilter = m.f27731h.getCrashFilter();
        if (crashFilter != null) {
            try {
                if (!crashFilter.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063 A[SYNTHETIC, Splitter:B:31:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6 A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7 A[Catch:{ all -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0187 A[Catch:{ all -> 0x01b5, all -> 0x01c8, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018e A[ADDED_TO_REGION, Catch:{ all -> 0x01b5, all -> 0x01c8, all -> 0x01e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable a(java.lang.Thread r26, java.lang.Throwable r27) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.e.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    private static void b(Thread thread, Throwable th, boolean z, long j2) {
        a(thread, th, z, j2, n.f27742f.f27898c);
    }

    public static void a(Thread thread, Throwable th, boolean z, long j2) {
        a(thread, th, z, j2, n.f27742f.f27899d);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013f A[Catch:{ all -> 0x0152, all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014c A[Catch:{ all -> 0x0152, all -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.io.File r12, java.lang.Throwable r13, java.lang.Thread r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.e.a.a(java.io.File, java.lang.Throwable, java.lang.Thread, boolean):java.lang.String");
    }

    private static void a(Thread thread, Throwable th, boolean z, long j2, List<IOOMCallback> list) {
        CrashType crashType;
        if (z) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        for (IOOMCallback iOOMCallback : list) {
            try {
                iOOMCallback.onCrash(crashType, th, thread, j2);
            } catch (Throwable unused) {
                m.f27730g.isDebugMode();
            }
        }
    }
}
