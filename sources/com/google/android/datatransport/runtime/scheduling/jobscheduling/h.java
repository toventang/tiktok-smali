package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.d.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.c;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final Context f49574a;

    /* renamed from: b  reason: collision with root package name */
    final e f49575b;

    /* renamed from: c  reason: collision with root package name */
    final c f49576c;

    /* renamed from: d  reason: collision with root package name */
    final s f49577d;

    /* renamed from: e  reason: collision with root package name */
    final b f49578e;

    /* renamed from: f  reason: collision with root package name */
    final a f49579f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f49580g;

    static {
        Covode.recordClassIndex(31016);
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4822);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(4822);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(k kVar, int i2, Runnable runnable) {
        this.f49580g.execute(i.a(this, kVar, i2, runnable));
    }

    public h(Context context, e eVar, c cVar, s sVar, Executor executor, b bVar, a aVar) {
        this.f49574a = context;
        this.f49575b = eVar;
        this.f49576c = cVar;
        this.f49577d = sVar;
        this.f49580g = executor;
        this.f49578e = bVar;
        this.f49579f = aVar;
    }
}
