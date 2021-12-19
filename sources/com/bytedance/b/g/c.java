package com.bytedance.b.g;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.b.k.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private long f26286a;

    /* renamed from: b  reason: collision with root package name */
    private long f26287b;

    /* renamed from: c  reason: collision with root package name */
    private long f26288c;

    /* renamed from: d  reason: collision with root package name */
    private long f26289d;

    static {
        Covode.recordClassIndex(15254);
    }

    c() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f26290a = new c();

        static {
            Covode.recordClassIndex(15255);
        }
    }

    public final long a() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j2 = parseLong - this.f26286a;
        this.f26286a = parseLong;
        return j2;
    }

    public final long b() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j2 = parseLong - this.f26287b;
        this.f26287b = parseLong;
        return j2;
    }

    public final long c() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j2 = parseLong - this.f26288c;
        this.f26288c = parseLong;
        return j2;
    }

    public final long d() {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j2 = parseLong - this.f26289d;
        this.f26289d = parseLong;
        return j2;
    }

    public static Debug.MemoryInfo e() {
        if (com.bytedance.b.k.a.f26313g == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) a(com.bytedance.b.k.a.f26313g, "activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    static long a(Debug.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT < 23) {
            return -1;
        }
        String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
        if (!TextUtils.isEmpty(memoryStat)) {
            try {
                return ((long) Integer.parseInt(memoryStat)) * 1024;
            } catch (Exception e2) {
                b.a("APM-Memory", "getGraphics", e2);
                e2.printStackTrace();
            }
        }
        return -1;
    }

    private static Object a(Application application, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return application.getSystemService(str);
        } else if (!i.f107219a) {
            return application.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = application.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
