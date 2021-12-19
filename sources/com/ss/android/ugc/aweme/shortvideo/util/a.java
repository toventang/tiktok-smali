package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.p;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static HashMap<String, a> f132184f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static final C3430a f132185g = new C3430a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f132186a;

    /* renamed from: b  reason: collision with root package name */
    int f132187b;

    /* renamed from: c  reason: collision with root package name */
    boolean f132188c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f132189d;

    /* renamed from: e  reason: collision with root package name */
    public final String f132190e;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public long f132191a;

        /* renamed from: b  reason: collision with root package name */
        public long f132192b;

        /* renamed from: c  reason: collision with root package name */
        public long f132193c;

        static {
            Covode.recordClassIndex(86567);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$a  reason: collision with other inner class name */
    public static final class C3430a {
        static {
            Covode.recordClassIndex(86566);
        }

        private C3430a() {
        }

        public /* synthetic */ C3430a(byte b2) {
            this();
        }

        public static p<Integer, Integer> a(String str) {
            b bVar;
            l.d(str, "");
            a aVar = a.f132184f.get(str);
            if (aVar == null || (bVar = aVar.f132186a) == null) {
                return new p<>(-1, -1);
            }
            return new p<>(Integer.valueOf((int) bVar.f132191a), Integer.valueOf((int) bVar.f132193c));
        }
    }

    static {
        Covode.recordClassIndex(86565);
    }

    private a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        this.f132189d = context;
        this.f132190e = str;
    }

    public static final a b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        if (f132184f.get(str) == null) {
            f132184f.put(str, new a(context, str));
        }
        a aVar = f132184f.get(str);
        if (aVar == null) {
            l.b();
        }
        return aVar;
    }

    private static Object c(Context context, String str) {
        Object obj;
        MethodCollector.i(2848);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2848);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final b a(Context context, String str) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) c(context, "activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        b bVar = new b();
        ar arVar = ar.f132216a;
        l.b(arVar, "");
        bVar.f132191a = arVar.f132220e / 1024;
        bVar.f132192b = com.ss.android.ugc.tools.utils.l.a(memoryInfo.totalMem - memoryInfo.availMem);
        bVar.f132193c = com.ss.android.ugc.tools.utils.l.a(memoryInfo.availMem);
        bj.d("\n".concat(String.valueOf("av-performance\nmonitor instant value => \nscene = " + this.f132190e + ", action = " + str + "\ncurrent memory snapshot: app memory usage = " + bVar.f132191a + " Mb, system memory usage = " + bVar.f132192b + " Mb, available memory = " + bVar.f132193c + " Mb. ")));
        return bVar;
    }
}
