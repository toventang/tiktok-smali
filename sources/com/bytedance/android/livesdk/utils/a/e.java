package com.bytedance.android.livesdk.utils.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static e f22211d;

    /* renamed from: e  reason: collision with root package name */
    private static Context f22212e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22213a;

    /* renamed from: b  reason: collision with root package name */
    public long f22214b;

    /* renamed from: c  reason: collision with root package name */
    public long f22215c;

    /* renamed from: f  reason: collision with root package name */
    private final String f22216f;

    /* renamed from: g  reason: collision with root package name */
    private final long f22217g = 500;

    /* renamed from: h  reason: collision with root package name */
    private ConnectivityManager f22218h;

    /* renamed from: i  reason: collision with root package name */
    private long f22219i;

    static {
        Covode.recordClassIndex(13115);
    }

    private long c() {
        if (this.f22213a) {
            return SystemClock.elapsedRealtime() - this.f22215c;
        }
        return Long.MAX_VALUE;
    }

    public final long b() {
        long j2;
        long c2;
        if (!this.f22213a) {
            j2 = System.currentTimeMillis();
            c2 = an.f22242a;
        } else {
            j2 = this.f22214b;
            c2 = c();
        }
        return j2 + c2;
    }

    public final boolean a() {
        NetworkInfo a2;
        MethodCollector.i(11146);
        if (TextUtils.isEmpty(this.f22216f)) {
            MethodCollector.o(11146);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f22218h == null) {
                    this.f22218h = (ConnectivityManager) b(f22212e, "connectivity");
                }
            } catch (Throwable th) {
                MethodCollector.o(11146);
                throw th;
            }
        }
        ConnectivityManager connectivityManager = this.f22218h;
        if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isConnected()) {
            MethodCollector.o(11146);
            return false;
        }
        f fVar = new f();
        if (fVar.a(this.f22216f, (int) this.f22217g)) {
            this.f22213a = true;
            this.f22214b = fVar.f22220a;
            this.f22215c = fVar.f22221b;
            this.f22219i = fVar.f22222c / 2;
            MethodCollector.o(11146);
            return true;
        }
        MethodCollector.o(11146);
        return false;
    }

    private e(String str) {
        this.f22216f = str;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static synchronized e a(Context context, String str) {
        e eVar;
        synchronized (e.class) {
            MethodCollector.i(10980);
            if (f22211d == null) {
                f22211d = new e(str);
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                f22212e = applicationContext;
            }
            eVar = f22211d;
            MethodCollector.o(10980);
        }
        return eVar;
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(11303);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11303);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
