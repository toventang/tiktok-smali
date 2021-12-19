package com.toutiao.proxyserver;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.ae;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class t {

    /* renamed from: h  reason: collision with root package name */
    public static final s f154953h = new s();

    /* renamed from: m  reason: collision with root package name */
    private static volatile t f154954m;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<Map<String, i>> f154955a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<Runnable> f154956b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f154957c;

    /* renamed from: d  reason: collision with root package name */
    public volatile h f154958d;

    /* renamed from: e  reason: collision with root package name */
    public volatile g f154959e;

    /* renamed from: f  reason: collision with root package name */
    public volatile r f154960f;

    /* renamed from: g  reason: collision with root package name */
    public List<Object> f154961g;

    /* renamed from: i  reason: collision with root package name */
    volatile long f154962i = 10000;

    /* renamed from: j  reason: collision with root package name */
    volatile long f154963j = 10000;

    /* renamed from: k  reason: collision with root package name */
    volatile long f154964k = 10000;

    /* renamed from: l  reason: collision with root package name */
    private final ExecutorService f154965l;
    private final i.b n = new i.b() {
        /* class com.toutiao.proxyserver.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103185);
        }

        @Override // com.toutiao.proxyserver.i.b
        public final void a(i iVar) {
            MethodCollector.i(10594);
            com.toutiao.proxyserver.e.c.a("TAG_PROXY_Preloader", "onLazyUrlsProvided, key: " + iVar.f154719h, null);
            int g2 = iVar.g();
            synchronized (t.this.f154955a) {
                try {
                    Map<String, i> map = t.this.f154955a.get(g2);
                    if (!map.containsKey(iVar.f154719h)) {
                        map.put(iVar.f154719h, iVar);
                    }
                } finally {
                    MethodCollector.o(10594);
                }
            }
        }

        @Override // com.toutiao.proxyserver.i.b
        public final void b(final i iVar) {
            MethodCollector.i(10432);
            final int g2 = iVar.g();
            synchronized (t.this.f154955a) {
                try {
                    Map<String, i> map = t.this.f154955a.get(g2);
                    if (map != null) {
                        map.remove(iVar.f154719h);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10432);
                    throw th;
                }
            }
            if (t.this.d()) {
                t.this.e();
            }
            final o oVar = u.f154992g;
            if (oVar != null) {
                com.toutiao.proxyserver.g.b.b(new Runnable() {
                    /* class com.toutiao.proxyserver.t.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103186);
                    }

                    public final void run() {
                        oVar.a(iVar.f154714c.get(), 0, iVar.f154715d.get());
                    }
                });
            }
            com.toutiao.proxyserver.e.c.a("TAG_PROXY_Preloader", "afterExecute, key: " + iVar.f154719h, null);
            MethodCollector.o(10432);
        }
    };

    static final class b<T> extends LinkedBlockingDeque<T> {
        ThreadPoolExecutor executor;

        static {
            Covode.recordClassIndex(103195);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Deque
        public final boolean offer(T t) {
            MethodCollector.i(12233);
            synchronized (this) {
                try {
                    int poolSize = this.executor.getPoolSize();
                    int activeCount = this.executor.getActiveCount();
                    int maximumPoolSize = this.executor.getMaximumPoolSize();
                    if (activeCount < poolSize || poolSize >= maximumPoolSize) {
                        boolean offerFirst = offerFirst(t);
                        MethodCollector.o(12233);
                        return offerFirst;
                    }
                    com.toutiao.proxyserver.e.c.b("TAG_PROXY_TT", "create new preloader thread", null);
                    return false;
                } finally {
                    MethodCollector.o(12233);
                }
            }
        }
    }

    public final a f() {
        return new a();
    }

    static {
        Covode.recordClassIndex(103184);
    }

    public final void b() {
        com.toutiao.proxyserver.g.b.a(new Runnable() {
            /* class com.toutiao.proxyserver.t.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103188);
            }

            public final void run() {
                MethodCollector.i(10430);
                ArrayList<i> arrayList = new ArrayList();
                synchronized (t.this.f154955a) {
                    try {
                        int size = t.this.f154955a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Map<String, i> map = t.this.f154955a.get(t.this.f154955a.keyAt(i2));
                            if (map != null) {
                                arrayList.addAll(map.values());
                                map.clear();
                            }
                        }
                        t.this.f154956b.clear();
                    } finally {
                        MethodCollector.o(10430);
                    }
                }
                t.this.e();
                for (i iVar : arrayList) {
                    iVar.a();
                    com.toutiao.proxyserver.e.c.c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!", null);
                }
            }
        });
    }

    public final void c() {
        com.toutiao.proxyserver.g.b.a(new Runnable() {
            /* class com.toutiao.proxyserver.t.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103189);
            }

            public final void run() {
                MethodCollector.i(12236);
                ArrayList<i> arrayList = new ArrayList();
                synchronized (t.this.f154955a) {
                    try {
                        int size = t.this.f154955a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Map<String, i> map = t.this.f154955a.get(t.this.f154955a.keyAt(i2));
                            if (map != null) {
                                arrayList.addAll(map.values());
                            }
                        }
                        for (i iVar : arrayList) {
                            iVar.a();
                            com.toutiao.proxyserver.e.c.c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!", null);
                        }
                        int size2 = t.this.f154955a.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Map<String, i> map2 = t.this.f154955a.get(t.this.f154955a.keyAt(i3));
                            if (map2 != null) {
                                map2.clear();
                            }
                        }
                        t.this.f154956b.clear();
                    } catch (Throwable th) {
                        MethodCollector.o(12236);
                        throw th;
                    }
                }
                t.this.e();
                MethodCollector.o(12236);
            }
        });
    }

    public final void e() {
        com.toutiao.proxyserver.g.b.b(new Runnable() {
            /* class com.toutiao.proxyserver.t.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103190);
            }

            public final void run() {
                Iterator<Object> it = t.this.f154961g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f154979a = t.f154953h.f154951b;

        /* renamed from: b  reason: collision with root package name */
        public String f154980b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f154981c;

        /* renamed from: d  reason: collision with root package name */
        public q f154982d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f154984f;

        /* renamed from: g  reason: collision with root package name */
        private List<com.toutiao.proxyserver.net.c> f154985g;

        static {
            Covode.recordClassIndex(103194);
        }

        public final void a() {
            q qVar = this.f154982d;
            if (qVar == null) {
                t.this.a(this.f154984f, this.f154979a, this.f154980b, this.f154985g, this.f154981c);
            } else {
                t.this.a(this.f154984f, this.f154979a, this.f154980b, this.f154985g, qVar);
            }
        }

        public a() {
        }
    }

    public static t a() {
        MethodCollector.i(11084);
        if (f154954m == null) {
            synchronized (t.class) {
                try {
                    if (f154954m == null) {
                        f154954m = new t();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11084);
                    throw th;
                }
            }
        }
        t tVar = f154954m;
        MethodCollector.o(11084);
        return tVar;
    }

    public final boolean d() {
        MethodCollector.i(11410);
        synchronized (this.f154955a) {
            for (int i2 = 0; i2 < this.f154955a.size(); i2++) {
                try {
                    SparseArray<Map<String, i>> sparseArray = this.f154955a;
                    Map<String, i> map = sparseArray.get(sparseArray.keyAt(i2));
                    if (map != null && map.size() > 0) {
                        return false;
                    }
                } finally {
                    MethodCollector.o(11410);
                }
            }
            MethodCollector.o(11410);
            return true;
        }
    }

    private t() {
        MethodCollector.i(10926);
        SparseArray<Map<String, i>> sparseArray = new SparseArray<>(2);
        this.f154955a = sparseArray;
        s sVar = f154953h;
        if (sVar.f154952c == null) {
            sVar.f154952c = new b((byte) 0);
        }
        final BlockingQueue<Runnable> blockingQueue = sVar.f154952c;
        this.f154956b = blockingQueue;
        int a2 = com.toutiao.proxyserver.g.b.a();
        if (a2 <= 0) {
            a2 = 1;
        } else if (a2 > 4) {
            a2 = 4;
        }
        a2 = s.f154950a == 1 ? 1 : a2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(a2, a2, 60, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() {
            /* class com.toutiao.proxyserver.t.AnonymousClass6 */

            static {
                Covode.recordClassIndex(103191);
            }

            public final Thread newThread(Runnable runnable) {
                AnonymousClass1 r3 = new Thread(runnable) {
                    /* class com.toutiao.proxyserver.t.AnonymousClass6.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103192);
                    }

                    public final void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                r3.setName("video-preload-" + r3.getId());
                r3.setDaemon(true);
                com.toutiao.proxyserver.e.c.b("TAG_PROXY_Preloader", "new preload thead: " + r3.getName(), null);
                return r3;
            }
        }, new RejectedExecutionHandler() {
            /* class com.toutiao.proxyserver.t.AnonymousClass7 */

            static {
                Covode.recordClassIndex(103193);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    blockingQueue.offer(runnable);
                    com.toutiao.proxyserver.e.c.b("TAG_PROXY_TT", "task rejected in preloader, put first!!!", null);
                } catch (Throwable unused) {
                }
            }
        });
        this.f154965l = threadPoolExecutor;
        if (blockingQueue instanceof b) {
            b bVar = (b) blockingQueue;
            synchronized (bVar) {
                try {
                    if (bVar.executor == null) {
                        bVar.executor = threadPoolExecutor;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("You can only call setExecutor() once!");
                        MethodCollector.o(10926);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10926);
                    throw th;
                }
            }
        }
        this.f154961g = new ArrayList();
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
        MethodCollector.o(10926);
    }

    public final void a(long j2) {
        this.f154962i = j2;
        this.f154963j = 30000;
        this.f154964k = 30000;
    }

    public final void a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.toutiao.proxyserver.g.b.a(new Runnable() {
                /* class com.toutiao.proxyserver.t.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f154971a = false;

                static {
                    Covode.recordClassIndex(103187);
                }

                public final void run() {
                    t tVar = t.this;
                    boolean z = this.f154971a;
                    tVar.a(z ? 1 : 0, com.toutiao.proxyserver.g.a.a(str));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        i iVar;
        MethodCollector.i(11249);
        synchronized (this.f154955a) {
            try {
                Map<String, i> map = this.f154955a.get(i2);
                if (map != null) {
                    iVar = map.remove(str);
                } else {
                    iVar = null;
                }
            } finally {
                MethodCollector.o(11249);
            }
        }
        if (iVar != null) {
            iVar.a();
        }
        if (d()) {
            e();
        }
    }

    public final void a(boolean z, int i2, String str, List<com.toutiao.proxyserver.net.c> list, q qVar) {
        a(z, i2, str, list, qVar, null);
    }

    public final void a(boolean z, int i2, String str, List<com.toutiao.proxyserver.net.c> list, String... strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            a(z, i2, str, list, null, new ad(com.toutiao.proxyserver.g.b.a(strArr)));
        }
    }

    private void a(boolean z, int i2, String str, List<com.toutiao.proxyserver.net.c> list, q qVar, ad adVar) {
        a(z, i2, str, list, qVar, adVar, false);
    }

    public final void a(boolean z, int i2, String str, List<com.toutiao.proxyserver.net.c> list, q qVar, ad adVar, boolean z2) {
        b bVar;
        i iVar;
        int i3;
        int i4 = i2;
        MethodCollector.i(11087);
        if (z2) {
            bVar = this.f154960f;
        } else if (z) {
            bVar = this.f154959e;
        } else {
            bVar = this.f154958d;
        }
        c cVar = this.f154957c;
        if (bVar == null || cVar == null) {
            com.toutiao.proxyserver.e.c.d("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!", null);
            MethodCollector.o(11087);
            return;
        }
        if (i4 <= 0) {
            i4 = f154953h.f154951b;
        }
        com.toutiao.proxyserver.e.c.c("TAG_PROXY_Preloader", "Preload urlsLazyProvider:".concat(String.valueOf(qVar)), null);
        if (qVar != null) {
            i.a a2 = new i.a().a(bVar).a(cVar);
            a2.f154907g = list;
            i.a a3 = a2.a(qVar);
            a3.f154908h = i4;
            a3.f154910j = this.n;
            a3.f154911k = true;
            iVar = a3.a();
        } else if (TextUtils.isEmpty(str) || adVar == null) {
            MethodCollector.o(11087);
            return;
        } else {
            String a4 = com.toutiao.proxyserver.g.a.a(str);
            ae.b.f154780a.a(str, a4);
            File e2 = bVar.e(a4);
            if (e2 != null && e2.length() >= ((long) i4)) {
                com.toutiao.proxyserver.e.c.b("TAG_PROXY_Preloader", "no need preload, file size: " + e2.length() + ", need preload size: " + i4, null);
                MethodCollector.o(11087);
                return;
            } else if (z2 || !v.a().a(z ? 1 : 0, a4)) {
                synchronized (this.f154955a) {
                    try {
                        SparseArray<Map<String, i>> sparseArray = this.f154955a;
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        com.toutiao.proxyserver.g.b.a(list);
                        i.a a5 = new i.a().a(bVar).a(cVar).a(str).b(a4).a(adVar);
                        a5.f154907g = list;
                        a5.f154908h = i4;
                        a5.f154910j = this.n;
                        a5.f154911k = true;
                        iVar = a5.a();
                        sparseArray.get(i3).put(a4, iVar);
                    } catch (Throwable th) {
                        MethodCollector.o(11087);
                        throw th;
                    }
                }
            } else {
                com.toutiao.proxyserver.e.c.c("TAG_PROXY_Preloader", "has pending proxy task, skip preload for key: ".concat(String.valueOf(str)), null);
                MethodCollector.o(11087);
                return;
            }
        }
        this.f154965l.execute(iVar);
        MethodCollector.o(11087);
    }
}
