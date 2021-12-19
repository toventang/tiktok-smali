package com.google.android.gms.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.o;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static ScheduledExecutorService f49876j;
    private static volatile AbstractC1205a o = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f49877a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f49878b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49879c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49880d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f49881e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f49882f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Integer[]> f49883g;

    /* renamed from: h  reason: collision with root package name */
    public int f49884h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicInteger f49885i;

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f49886k;

    /* renamed from: l  reason: collision with root package name */
    private final String f49887l;

    /* renamed from: m  reason: collision with root package name */
    private final String f49888m;
    private final Set<Future<?>> n;

    /* renamed from: com.google.android.gms.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1205a {
        static {
            Covode.recordClassIndex(31139);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r1.<init>(r2, r3, r0)
            return
        L_0x0007:
            java.lang.String r0 = r2.getPackageName()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.a.<init>(android.content.Context, java.lang.String):void");
    }

    private a(Context context, String str, String str2) {
        this(context, 1, str, str2);
    }

    private a(Context context, int i2, String str, String str2) {
        this.f49877a = this;
        this.f49882f = true;
        this.f49883g = new HashMap();
        this.n = Collections.synchronizedSet(new HashSet());
        this.f49885i = new AtomicInteger(0);
        r.a(context, "WakeLock: context must not be null");
        r.a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f49879c = 1;
        this.f49887l = null;
        this.f49888m = null;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f49881e = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f49880d = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f49880d = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) a(context, "power")).newWakeLock(1, str);
        this.f49878b = newWakeLock;
        if (o.a(context)) {
            WorkSource a2 = o.a(context, m.a(str2) ? context.getPackageName() : str2);
            this.f49886k = a2;
            if (a2 != null && o.a(applicationContext)) {
                WorkSource workSource = this.f49886k;
                if (workSource != null) {
                    workSource.add(a2);
                } else {
                    this.f49886k = a2;
                }
                try {
                    newWakeLock.setWorkSource(this.f49886k);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (f49876j == null) {
            f49876j = com.google.android.gms.common.b.a.a().a();
        }
    }

    public final List<String> a() {
        int a2;
        WorkSource workSource = this.f49886k;
        if (workSource == null || (a2 = o.a(workSource)) == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < a2; i2++) {
            String a3 = o.a(workSource, i2);
            if (!m.a(a3)) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public final void b() {
        if (this.f49878b.isHeld()) {
            try {
                this.f49878b.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.f49880d).concat(" was already released!");
                } else {
                    throw e2;
                }
            }
            this.f49878b.isHeld();
        }
    }

    public final String c() {
        if (!this.f49882f) {
            return this.f49887l;
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return this.f49887l;
    }

    static {
        Covode.recordClassIndex(31138);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9408);
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
                    MethodCollector.o(9408);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
