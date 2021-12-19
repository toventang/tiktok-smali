package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.e.d;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.runtime.c;
import com.bytedance.crash.runtime.l;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27737a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f27738b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f27739c;

    /* renamed from: d  reason: collision with root package name */
    static boolean f27740d;

    /* renamed from: e  reason: collision with root package name */
    static boolean f27741e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f27742f = new c();

    /* renamed from: g  reason: collision with root package name */
    static boolean f27743g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f27744h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f27745i;

    /* renamed from: j  reason: collision with root package name */
    public static b f27746j;

    /* renamed from: k  reason: collision with root package name */
    public static a f27747k;

    public static class a {
        static {
            Covode.recordClassIndex(16265);
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        }

        public void a(String str) {
        }
    }

    public static class b {
        static {
            Covode.recordClassIndex(16266);
        }

        public void a(int i2, int i3, int i4, boolean z) {
        }
    }

    static {
        Covode.recordClassIndex(16256);
    }

    public static boolean a() {
        if (com.bytedance.crash.e.a.f27522d || NativeImpl.b()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (com.bytedance.crash.e.a.b() || NativeImpl.b()) {
            return true;
        }
        return false;
    }

    public static synchronized void a(Context context) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (n.class) {
            MethodCollector.i(8425);
            if (m.f27725b != null) {
                application = m.f27725b;
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Please slardar oncall. Application not be attached, please init use the param from attachBaseContext, and invoke Npth.setApplication(Application) before init.");
                    MethodCollector.o(8425);
                    throw illegalArgumentException;
                }
            } else {
                try {
                    Context applicationContext = context2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    application = (Application) applicationContext;
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Please slardar oncall. Please invoke Npth.setApplication(Application) before init.");
                    MethodCollector.o(8425);
                }
            }
            a(application, context2, true, true, true, true);
            MethodCollector.o(8425);
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        a aVar = f27747k;
        if (aVar != null) {
            aVar.a(i2, i3, i4, i5, i6, i7);
        }
    }

    public static synchronized void a(Application application, Context context, boolean z, boolean z2, boolean z3, final boolean z4) {
        synchronized (n.class) {
            MethodCollector.i(8429);
            if (f27737a) {
                MethodCollector.o(8429);
                return;
            }
            f27737a = true;
            l.a("start");
            if (context == null || application == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context or Application must be not null.");
                MethodCollector.o(8429);
                throw illegalArgumentException;
            }
            m.a(application, context);
            l.a("NpthBus_initGlobal");
            if (z || z2) {
                com.bytedance.crash.e.a a2 = com.bytedance.crash.e.a.a();
                if (z2) {
                    a2.f27526a = new d(context, true);
                }
                if (z) {
                    a2.f27527b = new d(context, false);
                }
                f27738b = true;
            }
            l.a("javaCrashInit");
            NativeImpl.a();
            l.a("NativeImpl_loadLibrary");
            if (z3) {
                f27740d = NativeImpl.a(context);
                l.a("NativeImpl_startMonitorNativeCrash");
                if (!f27740d) {
                    f27741e = true;
                }
            }
            com.bytedance.crash.runtime.n.b().a(new Runnable() {
                /* class com.bytedance.crash.n.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(16258);
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0067 */
                /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x0138 A[Catch:{ all -> 0x016a }] */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0145 A[Catch:{ all -> 0x016a }] */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x017a  */
                /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x01bd  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 452
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.n.AnonymousClass2.run():void");
                }
            }, 0);
            l.a("startNpthDefaultThread");
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                l.f27929a.put("total", uptimeMillis - l.f27930b);
                v.a("npth init total cost : " + (uptimeMillis - l.f27930b) + " ms");
                MethodCollector.o(8429);
            } catch (JSONException unused) {
                MethodCollector.o(8429);
            }
        }
    }
}
