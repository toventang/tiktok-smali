package com.bytedance.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.g.c.a;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static j f29645a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f29646b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Future f29647c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f29648d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Object f29649e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static Map<String, String> f29650f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static Set<String> f29651g = new ConcurrentSkipListSet();

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, Object> f29652h = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f29653i = false;

    /* renamed from: j  reason: collision with root package name */
    private static f f29654j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f29655k = false;

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, String> f29656l = new ConcurrentHashMap();

    public static void b() {
        c();
        f29646b.b();
    }

    static {
        Covode.recordClassIndex(17225);
    }

    public static boolean a() {
        c();
        b bVar = f29646b;
        if (bVar.f29622a == null || bVar.f29622a.length() <= 0) {
            return false;
        }
        return true;
    }

    private static void c() {
        MethodCollector.i(10424);
        if (!f29648d && f29653i) {
            synchronized (f29649e) {
                try {
                    if (!f29648d) {
                        try {
                            f29649e.wait(10000);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10424);
                    throw th;
                }
            }
        }
        if (f29647c != null) {
            try {
                f29647c.get();
                MethodCollector.o(10424);
            } catch (Exception e2) {
                RuntimeException runtimeException = new RuntimeException(e2);
                MethodCollector.o(10424);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("ExperimentManager has not been init");
            MethodCollector.o(10424);
            throw runtimeException2;
        }
    }

    private static String a(String str) {
        c();
        e eVar = f29646b.f29623b;
        if (!TextUtils.isEmpty(str)) {
            String str2 = eVar.f29678e.get(str);
            if (TextUtils.isEmpty(str2)) {
                for (Map<String, String> map : eVar.f29679f.values()) {
                    String str3 = map.get(str);
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
            } else if (eVar.f29675b.contains(str2)) {
                return str2;
            } else {
                return null;
            }
        }
        return null;
    }

    public static <T> T a(String str, Type type, T t, boolean z) {
        return (T) b(str, type, t, false, z, null);
    }

    private static <T> T a(String str, T t, boolean z, String str2) {
        if (z && t != null) {
            f29652h.put(str, t);
        }
        f29656l.put(str, str2);
        if (f29654j != null) {
            a(str);
        }
        return t;
    }

    public static <T> T a(String str, Type type, T t, boolean z, boolean z2, a<T> aVar) {
        return (T) b(str, type, t, z, z2, aVar);
    }

    private static <T> T b(String str, Type type, T t, boolean z, boolean z2, a<T> aVar) {
        Object a2;
        Object a3;
        Object a4;
        Object a5;
        c();
        if (z) {
            Map<String, Object> map = f29652h;
            if (map.containsKey(str) && map.get(str).getClass() == type) {
                if (z2) {
                    try {
                        b bVar = f29646b;
                        Runnable runnable = bVar.f29624c.get(str);
                        if (runnable != null) {
                            bVar.f29624c.remove(str);
                            runnable.run();
                        }
                    } catch (Exception unused) {
                    }
                }
                return (T) a(str, map.get(str), z, "sticky");
            }
        }
        if (d.f29673a == null) {
            a2 = null;
        } else {
            a2 = d.f29673a.a();
        }
        if (a2 != null) {
            return (T) a(str, a2, z, "panel");
        }
        if (f29655k && (a5 = f29646b.a(str, type, z2)) != null) {
            return (T) a(str, a5, z, "libra");
        }
        j jVar = f29645a;
        if (jVar != null && (a4 = jVar.a(str, type)) != null) {
            return (T) a(str, a4, z, "setting");
        }
        if (!f29655k && (a3 = f29646b.a(str, type, z2)) != null) {
            return (T) a(str, a3, z, "libra");
        }
        Object a6 = f29646b.a(str, aVar, z2);
        return a6 != null ? (T) a(str, a6, z, "client") : (T) a(str, t, z, "default");
    }
}
