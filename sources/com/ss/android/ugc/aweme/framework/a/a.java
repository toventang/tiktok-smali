package com.ss.android.ugc.aweme.framework.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.performance.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f96671a;

    /* renamed from: b  reason: collision with root package name */
    private static CopyOnWriteArrayList<b> f96672b;

    /* renamed from: c  reason: collision with root package name */
    private static Context f96673c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f96674d;

    static {
        Covode.recordClassIndex(61337);
    }

    public static void b(int i2, String str, String str2) {
        a(i2, str, str2);
    }

    public static void a() {
        CopyOnWriteArrayList<b> copyOnWriteArrayList;
        if (f96671a && (copyOnWriteArrayList = f96672b) != null) {
            Iterator<b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next != null && next.a()) {
                    next.b();
                }
            }
        }
    }

    public static void a(Exception exc) {
        a("", exc);
    }

    public static void a(String str) {
        a(3, null, str);
    }

    public static void a(Throwable th) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList;
        if (f96671a && (copyOnWriteArrayList = f96672b) != null) {
            Iterator<b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next != null && next.a()) {
                    next.a(next.b(), th);
                }
            }
        }
    }

    public static void b(String str, String str2) {
        a(2, str, str2);
    }

    public static void a(String str, String str2) {
        c(2, str, str2);
    }

    public static synchronized void a(Context context, List<b> list) {
        synchronized (a.class) {
            MethodCollector.i(567);
            if (f96671a) {
                IllegalStateException illegalStateException = new IllegalStateException("CrashlyticsWrapper already inited!");
                MethodCollector.o(567);
                throw illegalStateException;
            } else if (context != null) {
                f96674d = true;
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                f96673c = applicationContext;
                if (!list.isEmpty()) {
                    f96672b = new CopyOnWriteArrayList<>(list);
                }
                CopyOnWriteArrayList<b> copyOnWriteArrayList = f96672b;
                if (copyOnWriteArrayList != null) {
                    Iterator<b> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        b next = it.next();
                        if (next != null && next.a()) {
                            next.a(f96673c);
                        }
                    }
                }
                f96671a = true;
                MethodCollector.o(567);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Context can't be null!");
                MethodCollector.o(567);
                throw illegalArgumentException;
            }
        }
    }

    public static void a(String str, Exception exc) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList;
        if (f96671a && (copyOnWriteArrayList = f96672b) != null) {
            Iterator<b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next != null && next.a()) {
                    next.a(next.b(), str, exc);
                }
            }
        }
    }

    public static void c(int i2, String str, String str2) {
        if (!i.a()) {
            a(i2, str, str2);
        }
    }

    public static void a(int i2, String str, String str2) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList;
        String str3;
        if (f96671a && (copyOnWriteArrayList = f96672b) != null) {
            Iterator<b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next != null && next.a()) {
                    if (str == null) {
                        str3 = next.b();
                    } else {
                        str3 = str;
                    }
                    next.a(i2, str3, str2);
                }
            }
        }
    }
}
