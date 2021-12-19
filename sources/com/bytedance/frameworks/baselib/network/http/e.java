package com.bytedance.frameworks.baselib.network.http;

import android.os.Looper;
import android.webkit.CookieManager;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.s;
import com.ss.android.ugc.aweme.logger.a;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static g f29329a;

    /* renamed from: b  reason: collision with root package name */
    public static AbstractC0626e f29330b;

    /* renamed from: c  reason: collision with root package name */
    public static j f29331c;

    /* renamed from: d  reason: collision with root package name */
    public static String f29332d;

    /* renamed from: e  reason: collision with root package name */
    public static f f29333e;

    /* renamed from: f  reason: collision with root package name */
    public static b f29334f;

    /* renamed from: g  reason: collision with root package name */
    public static i f29335g;

    /* renamed from: h  reason: collision with root package name */
    public static c f29336h;

    /* renamed from: i  reason: collision with root package name */
    public static h f29337i;

    /* renamed from: j  reason: collision with root package name */
    public static d f29338j;

    /* renamed from: k  reason: collision with root package name */
    public static a f29339k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile boolean f29340l = false;

    /* renamed from: m  reason: collision with root package name */
    private static volatile AtomicBoolean f29341m = new AtomicBoolean(false);
    private static final Object n = new Object();
    private static CountDownLatch o = new CountDownLatch(1);
    private static volatile int p = -1;
    private static volatile k q;

    public interface a {
        static {
            Covode.recordClassIndex(17100);
        }

        Map<String, String> a(String str, Map<String, List<String>> map);
    }

    public interface b<T extends a> {
        static {
            Covode.recordClassIndex(17101);
        }

        String a(String str);

        String b(String str);
    }

    public interface c<T extends b> {
        static {
            Covode.recordClassIndex(17102);
        }

        String a(String str);

        void a(String str, String str2, boolean z);
    }

    public interface d {
        static {
            Covode.recordClassIndex(17103);
        }

        Map<String, List<String>> a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$e  reason: collision with other inner class name */
    public interface AbstractC0626e {
        static {
            Covode.recordClassIndex(17104);
        }

        boolean b(String str);
    }

    public interface f {
        static {
            Covode.recordClassIndex(17105);
        }

        String a();
    }

    public interface g {
        static {
            Covode.recordClassIndex(17106);
        }

        boolean c(String str);
    }

    public interface h {
        static {
            Covode.recordClassIndex(17107);
        }

        List<String> a(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.c.a aVar, URI uri);

        List<String> d(String str);
    }

    public interface i<T extends a> {
        static {
            Covode.recordClassIndex(17108);
        }

        void a(long j2, long j3, String str, String str2, T t);

        void a(long j2, long j3, String str, String str2, T t, Throwable th);
    }

    public interface j {
        static {
            Covode.recordClassIndex(17109);
        }

        InputStream a(InputStream inputStream, Map<String, List<String>> map, s sVar);
    }

    public interface k {
        static {
            Covode.recordClassIndex(17110);
        }

        boolean a(Map<String, List<String>> map);
    }

    public static boolean a(Object obj) {
        return obj != null && (obj instanceof b) && ((b) obj).q;
    }

    static {
        Covode.recordClassIndex(17099);
    }

    public static void a() {
        if (!f29341m.get()) {
            f29341m.getAndSet(true);
            CountDownLatch countDownLatch = o;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                o.countDown();
            }
        }
        a.b.f109011a.b("feed_network_init_cookie_duration", false);
    }

    public static CookieManager b() {
        MethodCollector.i(4786);
        synchronized (n) {
            try {
                if (!f29341m.get()) {
                    try {
                        CountDownLatch countDownLatch = o;
                        if (countDownLatch != null) {
                            countDownLatch.await(5000, TimeUnit.MILLISECONDS);
                            if (o.getCount() == 1) {
                                o.countDown();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    f29341m.getAndSet(true);
                }
            } finally {
                MethodCollector.o(4786);
            }
        }
        CookieManager cookieManager = null;
        try {
            cookieManager = CookieManager.getInstance();
            if (!cookieManager.acceptCookie()) {
                cookieManager.setAcceptCookie(true);
            }
        } catch (Throwable unused2) {
        }
        return cookieManager;
    }

    public static String a(String str) {
        c cVar;
        if (!m.a(str) && (cVar = f29336h) != null) {
            return cVar.a(str);
        }
        return str;
    }

    public static String b(String str) {
        b bVar = f29334f;
        if (bVar != null) {
            return bVar.a(str);
        }
        return str;
    }

    public static synchronized void a(k kVar) {
        synchronized (e.class) {
            MethodCollector.i(1570);
            q = kVar;
            MethodCollector.o(1570);
        }
    }

    public static void a(String str, Throwable th) {
        m.a(str);
    }

    public static Map<String, String> a(String str, Map<String, List<String>> map) {
        a aVar = f29339k;
        if (aVar != null) {
            return aVar.a(str, map);
        }
        return null;
    }

    public static boolean a(int i2, Map<String, List<String>> map) {
        if (i2 != 200 || Looper.getMainLooper() == Looper.myLooper() || q == null) {
            return false;
        }
        boolean a2 = q.a(map);
        map.remove("bdturing-verify");
        return a2;
    }

    public static void a(String str, String str2, boolean z) {
        c cVar;
        if (!m.a(str) && !m.a(str2) && (cVar = f29336h) != null) {
            cVar.a(str, str2, z);
        }
    }

    public static void a(long j2, long j3, String str, String str2, a aVar) {
        i iVar = f29335g;
        if (!m.a(str) && j2 > 0 && iVar != null) {
            if (!aVar.A || !aVar.J.get()) {
                if (aVar.A) {
                    aVar.J.set(true);
                }
                iVar.a(j2, j3, str, str2, aVar);
            }
        }
    }

    public static void a(long j2, long j3, String str, String str2, a aVar, Throwable th) {
        i iVar;
        if (!m.a(str) && th != null && (iVar = f29335g) != null) {
            if (aVar.A) {
                aVar.J.set(true);
            }
            iVar.a(j2, j3, str, str2, aVar, th);
        }
    }
}
