package com.toutiao.proxyserver;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.ae;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.g.b;
import com.toutiao.proxyserver.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class v {

    /* renamed from: m  reason: collision with root package name */
    private static volatile v f154999m;

    /* renamed from: a  reason: collision with root package name */
    public volatile ServerSocket f155000a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f155001b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f155002c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f155003d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
        /* class com.toutiao.proxyserver.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103199);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("video-proxyserver-" + thread.getId());
            return thread;
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public volatile c f155004e;

    /* renamed from: f  reason: collision with root package name */
    public volatile h f155005f;

    /* renamed from: g  reason: collision with root package name */
    public volatile r f155006g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray<Set<w>> f155007h;

    /* renamed from: i  reason: collision with root package name */
    public final w.c f155008i;

    /* renamed from: j  reason: collision with root package name */
    volatile long f155009j;

    /* renamed from: k  reason: collision with root package name */
    volatile long f155010k;

    /* renamed from: l  reason: collision with root package name */
    volatile long f155011l;
    private final Runnable n;
    private final AtomicBoolean o;

    static {
        Covode.recordClassIndex(103198);
    }

    public final void b() {
        if (this.o.compareAndSet(false, true)) {
            new Thread(this.n).start();
        }
    }

    public static v a() {
        MethodCollector.i(10603);
        if (f154999m == null) {
            synchronized (v.class) {
                try {
                    if (f154999m == null) {
                        f154999m = new v();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10603);
                    throw th;
                }
            }
        }
        v vVar = f154999m;
        MethodCollector.o(10603);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final String f155026a;

        /* renamed from: b  reason: collision with root package name */
        private final int f155027b;

        static {
            Covode.recordClassIndex(103205);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            MethodCollector.i(9677);
            try {
                socket = new Socket(this.f155026a, this.f155027b);
                try {
                    socket.setSoTimeout(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(b.f154859a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        b.a(socket);
                        MethodCollector.o(9677);
                        return true;
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                socket = null;
            }
            b.a(socket);
            MethodCollector.o(9677);
            return false;
        }

        a(String str, int i2) {
            this.f155026a = str;
            this.f155027b = i2;
        }
    }

    private v() {
        SparseArray<Set<w>> sparseArray = new SparseArray<>(2);
        this.f155007h = sparseArray;
        this.f155008i = new w.c() {
            /* class com.toutiao.proxyserver.v.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103200);
            }

            @Override // com.toutiao.proxyserver.w.c
            public final void a(w wVar) {
                MethodCollector.i(11930);
                com.toutiao.proxyserver.e.c.a("TAG_PROXY_ProxyServer", "startExecute, ProxyTask: ".concat(String.valueOf(wVar)), null);
                synchronized (v.this.f155007h) {
                    try {
                        Set<w> set = v.this.f155007h.get(wVar.g());
                        if (set != null) {
                            set.add(wVar);
                        }
                    } finally {
                        MethodCollector.o(11930);
                    }
                }
            }

            @Override // com.toutiao.proxyserver.w.c
            public final void b(final w wVar) {
                MethodCollector.i(12076);
                com.toutiao.proxyserver.e.c.a("TAG_PROXY_ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(wVar)), null);
                final int g2 = wVar.g();
                synchronized (v.this.f155007h) {
                    try {
                        Set<w> set = v.this.f155007h.get(g2);
                        if (set != null) {
                            set.remove(wVar);
                        }
                    } finally {
                        MethodCollector.o(12076);
                    }
                }
                final o oVar = u.f154992g;
                if (oVar != null) {
                    b.b(new Runnable() {
                        /* class com.toutiao.proxyserver.v.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103201);
                        }

                        public final void run() {
                            oVar.a(wVar.f154714c.get(), 0, wVar.f154715d.get());
                        }
                    });
                }
            }
        };
        this.f155009j = 10000;
        this.f155010k = 10000;
        this.f155011l = 10000;
        this.n = new Runnable() {
            /* class com.toutiao.proxyserver.v.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103203);
            }

            public final void run() {
                try {
                    int i2 = 0;
                    v.this.f155000a = new ServerSocket(0, 50, InetAddress.getByName("127.0.0.1"));
                    v vVar = v.this;
                    vVar.f155001b = vVar.f155000a.getLocalPort();
                    if (v.this.f155001b == -1) {
                        v.this.c();
                        return;
                    }
                    ProxySelector.setDefault(new aa("127.0.0.1", v.this.f155001b));
                    if (v.this.d() && v.this.f155002c.compareAndSet(0, 1)) {
                        com.toutiao.proxyserver.e.c.b("TAG_PROXY_ProxyServer", "proxy server start!", null);
                        while (v.this.f155002c.get() == 1) {
                            try {
                                try {
                                    Socket accept = v.this.f155000a.accept();
                                    com.toutiao.proxyserver.e.c.b("TAG_PROXY_ProxyServer", "proxy server new task!", null);
                                    c cVar = v.this.f155004e;
                                    if (cVar != null) {
                                        w.a aVar = new w.a();
                                        aVar.f155041b = cVar;
                                        ExecutorService executorService = v.this.f155003d;
                                        if (executorService != null) {
                                            aVar.f155042c = executorService;
                                            if (accept != null) {
                                                aVar.f155043d = accept;
                                                aVar.f155044e = v.this.f155008i;
                                                if (aVar.f155041b == null || aVar.f155042c == null || aVar.f155043d == null) {
                                                    throw new IllegalArgumentException();
                                                }
                                                v.this.f155003d.execute(new w(aVar));
                                            } else {
                                                throw new IllegalArgumentException("socket == null");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("executor == null");
                                        }
                                    } else {
                                        b.a(accept);
                                    }
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    i2++;
                                    if (i2 > 3) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyServer", "proxy server crashed!  " + com.toutiao.proxyserver.e.c.a(th), null);
                            }
                        }
                        com.toutiao.proxyserver.e.c.b("TAG_PROXY_ProxyServer", "proxy server closed!", null);
                        v.this.c();
                    }
                } catch (IOException e3) {
                    com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyServer", "create ServerSocket error!  " + com.toutiao.proxyserver.e.c.a(e3), null);
                    v.this.c();
                }
            }
        };
        this.o = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public final void c() {
        MethodCollector.i(10605);
        if (this.f155002c.compareAndSet(1, 2) || this.f155002c.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.f155000a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            this.f155003d.shutdownNow();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f155007h) {
                try {
                    int size = this.f155007h.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SparseArray<Set<w>> sparseArray = this.f155007h;
                        Set<w> set = sparseArray.get(sparseArray.keyAt(i2));
                        if (set != null) {
                            arrayList.addAll(set);
                            set.clear();
                        }
                    }
                } finally {
                    MethodCollector.o(10605);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((w) it.next()).a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.v.d():boolean");
    }

    public final void a(long j2) {
        this.f155009j = j2;
        this.f155010k = 10000;
        this.f155011l = 10000;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, String str) {
        MethodCollector.i(10602);
        if (str == null) {
            MethodCollector.o(10602);
            return false;
        }
        synchronized (this.f155007h) {
            try {
                Set<w> set = this.f155007h.get(i2);
                if (set != null) {
                    for (w wVar : set) {
                        if (wVar != null && str.equals(wVar.f154719h)) {
                            return true;
                        }
                    }
                }
                MethodCollector.o(10602);
                return false;
            } finally {
                MethodCollector.o(10602);
            }
        }
    }

    public final String a(String str, boolean z, String... strArr) {
        b bVar;
        String a2;
        com.toutiao.proxyserver.c.a a3;
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        if (z) {
            bVar = this.f155006g;
        } else {
            bVar = this.f155005f;
        }
        if (bVar == null || this.f155004e == null) {
            return strArr[0];
        }
        String a4 = com.toutiao.proxyserver.g.a.a(str);
        ae.b.f154780a.a(str, a4);
        if (u.q) {
            File a5 = bVar.a(a4);
            if (a5.exists() && a5.isFile() && (a3 = this.f155004e.a(a4, 0)) != null && a5.length() >= ((long) a3.f154804c)) {
                if (u.f154992g != null) {
                    b.b(new Runnable(str, a3, false) {
                        /* class com.toutiao.proxyserver.v.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f155018a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ com.toutiao.proxyserver.c.a f155019b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ boolean f155020c = false;

                        static {
                            Covode.recordClassIndex(103202);
                        }

                        public final void run() {
                            u.f154992g.a();
                            u.f154992g.a(this.f155018a, this.f155019b.f154804c, this.f155019b.f154804c);
                            ae.b.f154780a.a(this.f155018a, (long) this.f155019b.f154804c);
                        }

                        {
                            this.f155018a = r3;
                            this.f155019b = r4;
                        }
                    });
                }
                return a5.getAbsolutePath();
            }
        }
        List<String> a6 = b.a(strArr);
        if (this.f155002c.get() != 1 || a6 == null) {
            return strArr[0];
        }
        if (z) {
            a2 = y.a(str, a4, a6, "music");
        } else {
            a2 = y.a(str, a4, a6, "");
        }
        if (a2 == null) {
            return strArr[0];
        }
        return "http://127.0.0.1:" + this.f155001b + "?" + a2;
    }
}
