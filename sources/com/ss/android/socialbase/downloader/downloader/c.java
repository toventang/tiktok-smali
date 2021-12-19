package com.ss.android.socialbase.downloader.downloader;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.w;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.f.b;
import com.ss.android.socialbase.downloader.g.f;
import com.ss.android.socialbase.downloader.g.h;
import com.ss.android.socialbase.downloader.g.j;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.d;
import com.ss.android.socialbase.downloader.impls.e;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.json.JSONObject;

public class c {
    private static volatile ExecutorService A;
    private static volatile ExecutorService B;
    private static volatile ExecutorService C;
    private static volatile ExecutorService D;
    private static volatile ExecutorService E;
    private static volatile i F;
    private static volatile e G;
    private static volatile u H;
    private static volatile s I;
    private static volatile z J;
    private static volatile boolean K = false;
    private static volatile OkHttpClient L = null;
    private static volatile f M;
    private static volatile w N;
    private static final List<k> O = new ArrayList();
    private static boolean P = false;
    private static int Q;
    private static final int R;
    private static final int S = ((Runtime.getRuntime().availableProcessors() * 2) + 1);
    private static final int T;
    private static final int U;
    private static int V = 8192;
    private static boolean W;
    private static boolean X = false;
    private static com.ss.android.socialbase.downloader.f.c Y;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ac f60426a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f60427b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f60428c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile List<ag> f60429d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static volatile f f60430e;

    /* renamed from: f  reason: collision with root package name */
    static final List<i> f60431f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public static final List<Object> f60432g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public static int f60433h;

    /* renamed from: i  reason: collision with root package name */
    static boolean f60434i = true;

    /* renamed from: j  reason: collision with root package name */
    static t f60435j;

    /* renamed from: k  reason: collision with root package name */
    static volatile boolean f60436k = false;

    /* renamed from: l  reason: collision with root package name */
    private static volatile Context f60437l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile l f60438m;
    private static volatile m n;
    private static volatile j o;
    private static volatile com.ss.android.socialbase.downloader.impls.a p;
    private static volatile q q;
    private static volatile q r;
    private static volatile j s;
    private static volatile h t;
    private static volatile j u;
    private static volatile h v;
    private static volatile n w;
    private static volatile ExecutorService x;
    private static volatile ExecutorService y;
    private static volatile ExecutorService z;

    public interface a {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.c$a$a  reason: collision with other inner class name */
        public interface AbstractC1328a {
            static {
                Covode.recordClassIndex(37344);
            }

            void a();
        }

        static {
            Covode.recordClassIndex(37343);
        }

        q a();

        v a(AbstractC1328a aVar);

        o b();
    }

    private c() {
    }

    static synchronized void a(h hVar) {
        synchronized (c.class) {
            MethodCollector.i(11056);
            if (f60436k) {
                com.ss.android.socialbase.downloader.e.a.e("DownloadComponentManager", "component has init");
                MethodCollector.o(11056);
                return;
            }
            boolean z2 = K;
            c(hVar);
            if (f60438m == null) {
                f60438m = new d();
            }
            if (q == null) {
                q = new com.ss.android.socialbase.downloader.impls.h();
            }
            if (r == null && f60427b != null) {
                r = f60427b.a();
            }
            if (n == null) {
                n = new com.ss.android.socialbase.downloader.impls.i();
            }
            if (p == null) {
                p = new e();
            }
            if (o == null) {
                o = new com.ss.android.socialbase.downloader.impls.c();
            }
            if (F == null) {
                F = new com.ss.android.socialbase.downloader.impls.b();
            }
            if (H == null) {
                H = new com.ss.android.socialbase.downloader.impls.j();
            }
            int i2 = Q;
            if (i2 <= 0 || i2 > R) {
                Q = R;
            }
            if (G == null) {
                G = new e();
            }
            if (!P) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    b(f60437l, G, intentFilter);
                    P = true;
                } catch (Throwable unused) {
                }
            }
            if (K && !z2 && !g.c()) {
                l.a(true).e();
            } else if (g.d()) {
                ExecutorService g2 = y != null ? y : g();
                if (g2 != null) {
                    g2.execute(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.downloader.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37340);
                        }

                        public final void run() {
                            Context B = c.B();
                            if (B != null) {
                                g.c(B);
                            }
                        }
                    });
                }
            } else {
                Context B2 = B();
                if (B2 != null) {
                    g.c(B2);
                }
            }
            if (TextUtils.isEmpty(com.ss.android.socialbase.downloader.b.e.f60285c)) {
                com.ss.android.socialbase.downloader.b.e.f60285c = "oppo";
                com.ss.android.socialbase.downloader.b.e.f60284b = "oppo".toUpperCase();
            }
            f60436k = true;
            MethodCollector.o(11056);
        }
    }

    public static void a(com.ss.android.socialbase.downloader.b.d dVar) {
        MethodCollector.i(11395);
        List<i> list = f60431f;
        synchronized (list) {
            try {
                Iterator<i> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (dVar == com.ss.android.socialbase.downloader.b.d.SYNC_SUCCESS) {
                    f60431f.clear();
                }
            } finally {
                MethodCollector.o(11395);
            }
        }
    }

    private static int[] a(int i2) {
        if (i2 == 1) {
            return new int[]{0};
        } else if (i2 != 2) {
            return i2 != 3 ? new int[]{1, 0} : new int[]{0, 1};
        } else {
            return new int[]{1};
        }
    }

    private static synchronized void a(n nVar) {
        synchronized (c.class) {
            MethodCollector.i(12056);
            if (nVar != null) {
                w = nVar;
                if (f60438m instanceof d) {
                    ((d) f60438m).a();
                }
            }
            MethodCollector.o(12056);
        }
    }

    private static void a(ExecutorService executorService) {
        if (executorService != null) {
            x = executorService;
        }
    }

    private static void a(List<k> list) {
        MethodCollector.i(12223);
        List<k> list2 = O;
        if (list2.isEmpty()) {
            synchronized (list2) {
                try {
                    list2.addAll(list);
                } finally {
                    MethodCollector.o(12223);
                }
            }
            return;
        }
        MethodCollector.o(12223);
    }

    public static void a(Runnable runnable) {
        g().execute(runnable);
    }

    private static void a(j jVar) {
        if (jVar != null) {
            s = jVar;
        }
        W = s != null;
    }

    private static void a(h hVar) {
        if (hVar != null) {
            t = hVar;
        }
    }

    private static void a(l lVar) {
        if (lVar != null) {
            f60438m = lVar;
        }
    }

    private static void a(m mVar) {
        if (mVar != null) {
            n = mVar;
        }
    }

    private static void a(b bVar) {
        if (bVar != null) {
            f60428c = bVar;
        }
    }

    private static void a(j jVar) {
        if (jVar != null) {
            o = jVar;
        }
    }

    private static void a(i iVar) {
        if (iVar != null) {
            F = iVar;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (c.class) {
            MethodCollector.i(13679);
            if (context != null && f60437l == null) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                f60437l = applicationContext;
                com.ss.android.socialbase.downloader.a.a aVar = a.b.f60273a;
                Context context2 = f60437l;
                if (aVar.f60265a == null && (context2 instanceof Application)) {
                    synchronized (aVar) {
                        try {
                            if (aVar.f60265a == null) {
                                aVar.f60265a = (Application) context2;
                                aVar.f60265a.registerActivityLifecycleCallbacks(aVar.f60271g);
                            }
                        } finally {
                            MethodCollector.o(13679);
                        }
                    }
                    return;
                }
            }
            MethodCollector.o(13679);
        }
    }

    public static void a(a aVar) {
        com.ss.android.socialbase.downloader.e.a.a("wjd", "setIndependentServiceCreator::creator=".concat(String.valueOf(aVar)));
        f60427b = aVar;
    }

    public static com.ss.android.socialbase.downloader.f.c D() {
        if (Y == null) {
            Y = new com.ss.android.socialbase.downloader.f.c() {
                /* class com.ss.android.socialbase.downloader.downloader.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(37342);
                }
            };
        }
        return Y;
    }

    public static boolean e() {
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("switch_not_auto_boot_service", X ? 1 : 0) > 0) {
            return true;
        }
        return false;
    }

    public static ExecutorService h() {
        if (A != null) {
            return A;
        }
        return j();
    }

    public static ExecutorService i() {
        if (B != null) {
            return B;
        }
        return j();
    }

    public static synchronized Context B() {
        Context context;
        synchronized (c.class) {
            MethodCollector.i(13604);
            context = f60437l;
            MethodCollector.o(13604);
        }
        return context;
    }

    public static synchronized boolean C() {
        boolean z2;
        synchronized (c.class) {
            MethodCollector.i(13743);
            z2 = W;
            MethodCollector.o(13743);
        }
        return z2;
    }

    public static synchronized boolean c() {
        boolean z2;
        synchronized (c.class) {
            MethodCollector.i(11394);
            z2 = K;
            MethodCollector.o(11394);
        }
        return z2;
    }

    public static synchronized s f() {
        s sVar;
        synchronized (c.class) {
            MethodCollector.i(12369);
            sVar = I;
            MethodCollector.o(12369);
        }
        return sVar;
    }

    public static synchronized n p() {
        n nVar;
        synchronized (c.class) {
            MethodCollector.i(12962);
            nVar = w;
            MethodCollector.o(12962);
        }
        return nVar;
    }

    public static JSONObject v() {
        if (J == null || J.a() == null) {
            return com.ss.android.socialbase.downloader.b.e.f60291i;
        }
        return J.a();
    }

    public static synchronized int w() {
        int i2;
        synchronized (c.class) {
            MethodCollector.i(13303);
            i2 = V;
            MethodCollector.o(13303);
        }
        return i2;
    }

    public static w A() {
        MethodCollector.i(13536);
        if (N == null) {
            synchronized (c.class) {
                try {
                    if (N == null) {
                        N = new w.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13536);
                    throw th;
                }
            }
        }
        w wVar = N;
        MethodCollector.o(13536);
        return wVar;
    }

    public static boolean E() {
        boolean z2;
        StringBuilder sb = new StringBuilder("supportMultiProc::=");
        if (f60427b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.android.socialbase.downloader.e.a.a("wjd", sb.append(z2).toString());
        if (f60427b != null) {
            return true;
        }
        return false;
    }

    private static j F() {
        MethodCollector.i(11742);
        if (u == null) {
            synchronized (c.class) {
                try {
                    if (u == null) {
                        u = new com.ss.android.socialbase.downloader.impls.g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11742);
                    throw th;
                }
            }
        }
        j jVar = u;
        MethodCollector.o(11742);
        return jVar;
    }

    private static h G() {
        MethodCollector.i(11905);
        if (v == null) {
            synchronized (c.class) {
                try {
                    if (v == null) {
                        v = new com.ss.android.socialbase.downloader.impls.f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11905);
                    throw th;
                }
            }
        }
        h hVar = v;
        MethodCollector.o(11905);
        return hVar;
    }

    public static void d() {
        MethodCollector.i(11396);
        List<Object> list = f60432g;
        synchronized (list) {
            try {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.o(11396);
            }
        }
    }

    public static ExecutorService g() {
        MethodCollector.i(12371);
        if (x == null) {
            synchronized (c.class) {
                try {
                    if (x == null) {
                        int i2 = R;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.j.a("DownloadThreadPool-cpu-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        x = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12371);
                    throw th;
                }
            }
        }
        ExecutorService executorService = x;
        MethodCollector.o(12371);
        return executorService;
    }

    public static ExecutorService j() {
        MethodCollector.i(12510);
        if (z == null) {
            synchronized (c.class) {
                try {
                    if (z == null) {
                        int i2 = T;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.j.a("DownloadThreadPool-mix-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        z = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12510);
                    throw th;
                }
            }
        }
        ExecutorService executorService = z;
        MethodCollector.o(12510);
        return executorService;
    }

    public static ExecutorService k() {
        MethodCollector.i(12512);
        if (D == null) {
            synchronized (c.class) {
                try {
                    if (D == null) {
                        int i2 = S;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.j.a("DownloadThreadPool-chunk-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        D = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12512);
                    throw th;
                }
            }
        }
        ExecutorService executorService = D;
        MethodCollector.o(12512);
        return executorService;
    }

    public static ExecutorService l() {
        MethodCollector.i(12740);
        if (C == null) {
            synchronized (c.class) {
                try {
                    if (C == null) {
                        int i2 = U;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.j.a("DownloadThreadPool-db-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        C = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12740);
                    throw th;
                }
            }
        }
        ExecutorService executorService = C;
        MethodCollector.o(12740);
        return executorService;
    }

    public static OkHttpClient m() {
        MethodCollector.i(12862);
        if (L == null) {
            synchronized (c.class) {
                try {
                    if (L == null) {
                        L = n().build();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12862);
                    throw th;
                }
            }
        }
        OkHttpClient okHttpClient = L;
        MethodCollector.o(12862);
        return okHttpClient;
    }

    public static OkHttpClient.Builder n() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(30000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
        if (E != null) {
            builder.dispatcher(new Dispatcher(E));
        }
        return builder;
    }

    public static f o() {
        MethodCollector.i(12865);
        if (M == null) {
            synchronized (c.class) {
                try {
                    if (M == null) {
                        M = new f() {
                            /* class com.ss.android.socialbase.downloader.downloader.c.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(37341);
                            }

                            @Override // com.ss.android.socialbase.downloader.g.f
                            public final List<InetAddress> a(String str) {
                                return Dns.SYSTEM.lookup(str);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12865);
                    throw th;
                }
            }
        }
        f fVar = M;
        MethodCollector.o(12865);
        return fVar;
    }

    public static l q() {
        MethodCollector.i(12963);
        if (f60438m == null) {
            synchronized (c.class) {
                try {
                    if (f60438m == null) {
                        f60438m = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12963);
                    throw th;
                }
            }
        }
        l lVar = f60438m;
        MethodCollector.o(12963);
        return lVar;
    }

    public static q r() {
        MethodCollector.i(13152);
        if (q == null) {
            synchronized (c.class) {
                try {
                    if (q == null) {
                        q = new com.ss.android.socialbase.downloader.impls.h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13152);
                    throw th;
                }
            }
        }
        q qVar = q;
        MethodCollector.o(13152);
        return qVar;
    }

    public static q s() {
        MethodCollector.i(13153);
        if (r == null) {
            synchronized (c.class) {
                try {
                    if (r == null) {
                        r = f60427b.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13153);
                    throw th;
                }
            }
        }
        q qVar = r;
        MethodCollector.o(13153);
        return qVar;
    }

    public static m t() {
        MethodCollector.i(13155);
        if (n == null) {
            synchronized (c.class) {
                try {
                    if (n == null) {
                        n = new com.ss.android.socialbase.downloader.impls.i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13155);
                    throw th;
                }
            }
        }
        m mVar = n;
        MethodCollector.o(13155);
        return mVar;
    }

    public static com.ss.android.socialbase.downloader.impls.a u() {
        MethodCollector.i(13229);
        if (p == null) {
            synchronized (c.class) {
                try {
                    if (p == null) {
                        p = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13229);
                    throw th;
                }
            }
        }
        com.ss.android.socialbase.downloader.impls.a aVar = p;
        MethodCollector.o(13229);
        return aVar;
    }

    public static j x() {
        MethodCollector.i(13377);
        if (o == null) {
            synchronized (c.class) {
                try {
                    if (o == null) {
                        o = new com.ss.android.socialbase.downloader.impls.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13377);
                    throw th;
                }
            }
        }
        j jVar = o;
        MethodCollector.o(13377);
        return jVar;
    }

    public static i y() {
        MethodCollector.i(13381);
        if (F == null) {
            synchronized (c.class) {
                try {
                    if (F == null) {
                        F = new com.ss.android.socialbase.downloader.impls.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13381);
                    throw th;
                }
            }
        }
        i iVar = F;
        MethodCollector.o(13381);
        return iVar;
    }

    public static u z() {
        MethodCollector.i(13467);
        if (H == null) {
            synchronized (c.class) {
                try {
                    if (H == null) {
                        H = new com.ss.android.socialbase.downloader.impls.j();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13467);
                    throw th;
                }
            }
        }
        u uVar = H;
        MethodCollector.o(13467);
        return uVar;
    }

    static {
        Covode.recordClassIndex(37339);
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        R = availableProcessors;
        T = availableProcessors;
        U = availableProcessors;
    }

    public static synchronized void b() {
        synchronized (c.class) {
            MethodCollector.i(11235);
            if (K) {
                MethodCollector.o(11235);
                return;
            }
            K = true;
            try {
                Intent intent = new Intent(B(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                a(B(), intent);
                if (!g.c()) {
                    l.a(true).e();
                }
                MethodCollector.o(11235);
            } catch (Throwable unused) {
                K = false;
                MethodCollector.o(11235);
            }
        }
    }

    static synchronized void a() {
        synchronized (c.class) {
            MethodCollector.i(11076);
            try {
                if (!(!P || G == null || f60437l == null)) {
                    f60437l.unregisterReceiver(G);
                    P = false;
                }
                MethodCollector.o(11076);
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(11076);
            }
        }
    }

    private static void a(ac acVar) {
        if (acVar != null) {
            f60426a = acVar;
        }
    }

    private static void b(int i2) {
        if (i2 > 0) {
            Q = i2;
        }
    }

    private static void c(ExecutorService executorService) {
        if (executorService != null) {
            z = executorService;
        }
    }

    private static void d(ExecutorService executorService) {
        if (executorService != null) {
            A = executorService;
        }
    }

    private static void e(ExecutorService executorService) {
        if (executorService != null) {
            B = executorService;
        }
    }

    private static void f(ExecutorService executorService) {
        if (executorService != null) {
            C = executorService;
        }
    }

    private static void g(ExecutorService executorService) {
        if (executorService != null) {
            D = executorService;
        }
    }

    private static void h(ExecutorService executorService) {
        if (executorService != null) {
            E = executorService;
        }
    }

    private static void b(ExecutorService executorService) {
        if (executorService != null) {
            y = executorService;
        }
    }

    public static int a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return a(taskKey, downloadInfo.getSavePath());
    }

    static synchronized void b(h hVar) {
        synchronized (c.class) {
            MethodCollector.i(11072);
            c(hVar);
            MethodCollector.o(11072);
        }
    }

    public static void b(Runnable runnable) {
        if (!g.d()) {
            runnable.run();
        } else {
            l().execute(runnable);
        }
    }

    private static void c(h hVar) {
        if (hVar != null) {
            if (hVar.f60479a != null) {
                a(hVar.f60479a);
            }
            if (hVar.f60480b != null) {
                a(hVar.f60480b);
            }
            if (hVar.f60481c != null) {
                a(hVar.f60481c);
            }
            if (hVar.f60482d != null) {
                a(hVar.f60482d);
            }
            if (hVar.f60483e != null) {
                a(hVar.f60483e);
            }
            if (hVar.x != 0) {
                b(hVar.x);
            }
            if (hVar.f60484f != null) {
                a(hVar.f60484f);
            }
            if (hVar.f60485g != null) {
                a(hVar.f60485g);
            }
            if (hVar.f60487i != null) {
                a(hVar.f60487i);
            }
            if (hVar.o != null) {
                a(hVar.o);
            }
            if (hVar.p != null) {
                b(hVar.p);
            }
            if (hVar.q != null) {
                c(hVar.q);
            }
            if (hVar.r != null) {
                d(hVar.r);
            }
            if (hVar.s != null) {
                e(hVar.s);
            }
            if (hVar.t != null) {
                f(hVar.t);
            }
            if (hVar.u != null) {
                g(hVar.u);
            }
            if (hVar.v != null) {
                h(hVar.v);
            }
            if (!hVar.f60491m.isEmpty()) {
                a(hVar.f60491m);
            }
            if (hVar.f60489k != null) {
                I = hVar.f60489k;
            }
            if (hVar.y > 1024) {
                V = hVar.y;
            }
            if (hVar.f60488j != null) {
                a(hVar.f60488j);
            }
            if (hVar.z) {
                K = true;
            }
            if (hVar.B != 0) {
                f60433h = hVar.B;
            }
            if (hVar.n != null) {
                J = hVar.n;
                com.ss.android.socialbase.downloader.i.a.a();
            }
            if (hVar.f60486h != null) {
                f60430e = hVar.f60486h;
            }
            if (hVar.w != null) {
                N = hVar.w;
                a(F());
                a(G());
            }
            f60434i = hVar.A;
            if (hVar.f60490l != null) {
                a(hVar.f60490l);
            }
        }
    }

    public static int a(String str, String str2) {
        m t2 = t();
        if (t2 == null) {
            return 0;
        }
        return t2.a(str, str2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.c.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.c.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    private static com.ss.android.socialbase.downloader.g.g b(String str, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) {
        h G2;
        Throwable th;
        if (i2 == 1) {
            G2 = t;
        } else {
            G2 = G();
        }
        if (G2 != null) {
            IOException e2 = null;
            long j2 = 0;
            if (z2) {
                try {
                    j2 = System.currentTimeMillis();
                } catch (IOException e3) {
                    e2 = e3;
                } catch (Throwable th2) {
                    th = th2;
                    if (z2) {
                        com.ss.android.socialbase.downloader.f.a.a(null, str, null, System.currentTimeMillis() - j2, "head", i2, e2, downloadInfo);
                    }
                    throw th;
                }
            }
            try {
                com.ss.android.socialbase.downloader.g.g a2 = G2.a(str, list);
                if (z2) {
                    com.ss.android.socialbase.downloader.f.a.a(a2, str, null, System.currentTimeMillis() - j2, "head", i2, null, downloadInfo);
                }
                return a2;
            } catch (IOException e4) {
                e2 = e4;
                try {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } else {
            throw new BaseException(1022, new IOException("httpService not exist, netLib = ".concat(String.valueOf(i2))));
        }
    }

    public static com.ss.android.socialbase.downloader.g.g a(String str, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) {
        Exception e2 = null;
        for (int i3 : a(i2)) {
            try {
                com.ss.android.socialbase.downloader.g.g b2 = b(str, list, i3, z2, downloadInfo);
                if (b2 != null) {
                    return b2;
                }
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return null;
        }
        throw e2;
    }

    private static com.ss.android.socialbase.downloader.g.i a(String str, String str2, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) {
        j F2;
        Throwable th;
        if (i2 == 1) {
            F2 = s;
        } else {
            F2 = F();
        }
        if (F2 != null) {
            IOException e2 = null;
            long j2 = 0;
            if (z2) {
                try {
                    j2 = System.currentTimeMillis();
                } catch (IOException e3) {
                    e2 = e3;
                } catch (Throwable th2) {
                    th = th2;
                    if (z2) {
                        com.ss.android.socialbase.downloader.f.a.a(null, str, str2, System.currentTimeMillis() - j2, "get", i2, e2, downloadInfo);
                    }
                    throw th;
                }
            }
            try {
                com.ss.android.socialbase.downloader.g.i a2 = F2.a(str, list);
                if (z2) {
                    com.ss.android.socialbase.downloader.f.a.a(a2, str, str2, System.currentTimeMillis() - j2, "get", i2, null, downloadInfo);
                }
                return a2;
            } catch (IOException e4) {
                e2 = e4;
                try {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } else {
            throw new BaseException(1022, new IOException("httpService not exist, netLib = ".concat(String.valueOf(i2))));
        }
    }

    public static com.ss.android.socialbase.downloader.g.i a(boolean z2, String str, String str2, List<HttpHeader> list, int i2, boolean z3, DownloadInfo downloadInfo) {
        if (!TextUtils.isEmpty(str2)) {
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(new HttpHeader("ss_d_request_host_ip_114", str2));
            i2 = 1;
        } else if (!z2) {
            i2 = 2;
        }
        Exception e2 = null;
        for (int i3 : a(i2)) {
            try {
                com.ss.android.socialbase.downloader.g.i a2 = a(str, str2, list, i3, z3, downloadInfo);
                if (a2 != null) {
                    return a2;
                }
            } catch (Exception e3) {
                e2 = e3;
                if (downloadInfo.isExpiredRedownload()) {
                    A();
                }
            }
        }
        if (e2 == null) {
            return null;
        }
        throw e2;
    }
}
