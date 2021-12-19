package com.ss.android.ugc.aweme.net.cache;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import h.f.b.m;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static j f112247a;

    /* renamed from: b  reason: collision with root package name */
    static h f112248b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicInteger f112249c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    static final HashSet<String> f112250d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    static final ConcurrentHashMap<String, c> f112251e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static final a f112252f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static AtomicInteger f112253g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    private static final HashSet<String> f112254h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f112255i = new ConcurrentHashMap<>();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.cache.a$a  reason: collision with other inner class name */
    static final class C2867a extends m implements h.f.a.a<c> {
        final /* synthetic */ Request $request;

        static {
            Covode.recordClassIndex(72137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2867a(Request request) {
            super(0);
            this.$request = request;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            h hVar = a.f112248b;
            if (hVar != null) {
                return hVar.a(this.$request);
            }
            return null;
        }
    }

    static final class b extends m implements h.f.a.a<u<?>> {
        final /* synthetic */ Request $request;

        static {
            Covode.recordClassIndex(72138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Request request) {
            super(0);
            this.$request = request;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<?> invoke() {
            j jVar = a.f112247a;
            if (jVar != null) {
                return jVar.a(this.$request);
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72136);
    }

    public static u<?> a(Request request) {
        l.d(request, "");
        if (f112247a == null || !b.c(request)) {
            return null;
        }
        f112249c.incrementAndGet();
        return (u) a(b.e(request), f112254h, f112255i, new b(request));
    }

    public static void a(Request request, u<?> uVar) {
        String str;
        MethodCollector.i(8058);
        l.d(request, "");
        l.d(uVar, "");
        j jVar = f112247a;
        if (jVar == null) {
            MethodCollector.o(8058);
            return;
        }
        l.d(request, "");
        l.d(uVar, "");
        if (b.c(request) && uVar.f42629a.a()) {
            d b2 = b.b(request);
            if (b2 != null) {
                String e2 = b.e(request);
                String str2 = b2.f112259a;
                if (str2 == null || str2.length() == 0) {
                    str = request.getPath();
                } else {
                    str = b2.f112259a;
                }
                if (str != null) {
                    synchronized (jVar.f112278a) {
                        try {
                            e<String, e> a2 = jVar.f112278a.a(str);
                            if (a2 == null) {
                                a2 = new e<>(b2.f112260b);
                                jVar.f112278a.a(str, a2);
                            }
                            a2.a(e2, new e(uVar));
                        } catch (Throwable th) {
                            MethodCollector.o(8058);
                            throw th;
                        }
                    }
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.".toString());
                MethodCollector.o(8058);
                throw illegalArgumentException;
            }
        }
        a(b.e(request), f112254h, f112255i);
        MethodCollector.o(8058);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012b, code lost:
        h.e.c.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        h.e.c.a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.retrofit2.client.c a(com.bytedance.retrofit2.client.Request r11, com.bytedance.retrofit2.client.c r12) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.cache.a.a(com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.client.c):com.bytedance.retrofit2.client.c");
    }

    private static void a(String str, HashSet<String> hashSet, ConcurrentHashMap<String, c> concurrentHashMap) {
        MethodCollector.i(8104);
        synchronized (hashSet) {
            try {
                hashSet.remove(str);
            } catch (Throwable th) {
                MethodCollector.o(8104);
                throw th;
            }
        }
        c cVar = concurrentHashMap.get(str);
        if (cVar != null) {
            cVar.a();
        }
        concurrentHashMap.remove(str);
        MethodCollector.o(8104);
    }

    static <T> T a(String str, HashSet<String> hashSet, ConcurrentHashMap<String, c> concurrentHashMap, h.f.a.a<? extends T> aVar) {
        c cVar;
        MethodCollector.i(8103);
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str)) {
                    cVar = concurrentHashMap.get(str);
                    if (cVar == null) {
                        cVar = new c();
                        concurrentHashMap.put(str, cVar);
                    }
                } else {
                    cVar = null;
                }
            } finally {
                MethodCollector.o(8103);
            }
        }
        if (cVar != null) {
            ReentrantLock reentrantLock = cVar.f112256a;
            reentrantLock.lock();
            try {
                cVar.f112257b.await();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                MethodCollector.o(8103);
                throw th;
            }
        }
        T t = (T) aVar.invoke();
        if (t == null) {
            synchronized (hashSet) {
                try {
                    hashSet.add(str);
                } finally {
                    MethodCollector.o(8103);
                }
            }
        } else {
            f112253g.incrementAndGet();
        }
        return t;
    }
}
