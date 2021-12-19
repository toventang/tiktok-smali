package com.ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.lighten.a.r;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarFile;

public final class id {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<URL, JarFile> f143094a;

    /* renamed from: b  reason: collision with root package name */
    private static String f143095b = "test-jar";

    static {
        Covode.recordClassIndex(93664);
    }

    private static void b() {
        if (Build.VERSION.SDK_INT <= 23) {
            i.b(ie.f143096a, i.f4824a);
        }
    }

    static final /* synthetic */ Object a() {
        MethodCollector.i(7538);
        try {
            Field declaredField = Class.forName("libcore.net.url.JarURLConnectionImpl").getDeclaredField("jarCache");
            declaredField.setAccessible(true);
            HashMap<URL, JarFile> hashMap = (HashMap) declaredField.get(null);
            f143094a = hashMap;
            synchronized (hashMap) {
                try {
                    HashMap<URL, JarFile> hashMap2 = f143094a;
                    if (hashMap2 != null) {
                        try {
                            Iterator<Map.Entry<URL, JarFile>> it = hashMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<URL, JarFile> next = it.next();
                                URL key = next.getKey();
                                if (key.toString().endsWith(".apk") || key.toString().endsWith(".jar")) {
                                    try {
                                        JarFile value = next.getValue();
                                        value.size();
                                        value.close();
                                        it.remove();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    MethodCollector.o(7538);
                }
            }
        } catch (Exception unused3) {
        }
        return null;
    }

    private static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) a(context, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    private static void b(int i2) {
        try {
            int a2 = (int) ((a(d.a()) / 1024) / 1024);
            a.a(f.j().getClass().getName() + "   freeMem :" + a2);
            o.a("TYPE_TRIM_MEMORY", new c().a("memoryLevel", Integer.valueOf(i2)).a("page", f.j().getClass().getName()).a("freeMemory", Integer.valueOf(a2)).a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(int i2) {
        b(i2);
        try {
            r.b(i2);
        } catch (Exception e2) {
            com.bytedance.crash.d.a(e2, "trimMemory : Lighten");
            e2.printStackTrace();
        }
        b();
        if (5 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
        } else if (10 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
        } else if (40 == i2) {
            a.a("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
        } else {
            a.a("trimMemory level:".concat(String.valueOf(i2)));
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7472);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7472);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
