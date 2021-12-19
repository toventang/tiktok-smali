package com.ss.android.ugc.aweme.net.preload;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpreload.b.i;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f112495a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static C2873a f112496b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f112497c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final String f112498d = "PowerPreload-CacheA";

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f112499e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f112500f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private static AtomicInteger f112501g = new AtomicInteger(0);

    /* renamed from: com.ss.android.ugc.aweme.net.preload.a$a  reason: collision with other inner class name */
    public static final class C2873a {

        /* renamed from: c  reason: collision with root package name */
        public static final C2874a f112502c = new C2874a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final e<String, e> f112503a = new e<>(this.f112504b);

        /* renamed from: b  reason: collision with root package name */
        public int f112504b = 16;

        static {
            Covode.recordClassIndex(72303);
        }

        /* renamed from: com.ss.android.ugc.aweme.net.preload.a$a$a  reason: collision with other inner class name */
        public static final class C2874a {
            static {
                Covode.recordClassIndex(72304);
            }

            private C2874a() {
            }

            public /* synthetic */ C2874a(byte b2) {
                this();
            }
        }

        private void c(String str) {
            l.d(str, "");
            this.f112503a.b(str);
        }

        static String b(String str) {
            if (!p.b(str, "/", false)) {
                str = "/".concat(String.valueOf(str));
            }
            if (p.c(str, "/", false)) {
                return str;
            }
            return str + '/';
        }

        public final u<?> a(String str) {
            e a2;
            i iVar;
            MethodCollector.i(5784);
            if (str == null) {
                MethodCollector.o(5784);
                return null;
            } else if (this.f112503a.b() == 0) {
                MethodCollector.o(5784);
                return null;
            } else {
                synchronized (this.f112503a) {
                    try {
                        a2 = this.f112503a.a(str);
                    } catch (Throwable th) {
                        MethodCollector.o(5784);
                        throw th;
                    }
                }
                if (a2 == null) {
                    MethodCollector.o(5784);
                    return null;
                } else if (Math.abs(a2.a()) < ((long) a2.f112509a.x.f34498a)) {
                    f fVar = a2.f112509a;
                    if (!(fVar == null || (iVar = fVar.x) == null || !iVar.f34501d)) {
                        c(str);
                    }
                    u<?> uVar = a2.f112510b;
                    MethodCollector.o(5784);
                    return uVar;
                } else {
                    c(str);
                    a2.a();
                    MethodCollector.o(5784);
                    return null;
                }
            }
        }
    }

    private a() {
    }

    public static final class b extends m implements h.f.a.a<u<?>> {
        final /* synthetic */ b $preloadKey;

        static {
            Covode.recordClassIndex(72305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b bVar) {
            super(0);
            this.$preloadKey = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u<?> invoke() {
            C2873a aVar = a.f112496b;
            if (aVar != null) {
                return aVar.a(this.$preloadKey.f112506b);
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72302);
    }

    public static void a(String str) {
        MethodCollector.i(6427);
        HashSet<String> hashSet = f112495a;
        synchronized (hashSet) {
            try {
                hashSet.remove(str);
            } catch (Throwable th) {
                MethodCollector.o(6427);
                throw th;
            }
        }
        ConcurrentHashMap<String, c> concurrentHashMap = f112499e;
        c cVar = concurrentHashMap.get(str);
        if (cVar != null) {
            cVar.a();
        }
        concurrentHashMap.remove(str);
        MethodCollector.o(6427);
    }

    public static <T> T a(String str, f fVar, h.f.a.a<? extends T> aVar) {
        c cVar;
        MethodCollector.i(6341);
        HashSet<String> hashSet = f112495a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str)) {
                    if (fVar != null) {
                        f112500f.incrementAndGet();
                    }
                    ConcurrentHashMap<String, c> concurrentHashMap = f112499e;
                    cVar = concurrentHashMap.get(str);
                    if (cVar == null) {
                        cVar = new c();
                        concurrentHashMap.put(str, cVar);
                    }
                } else {
                    cVar = null;
                }
            } finally {
                MethodCollector.o(6341);
            }
        }
        if (cVar != null) {
            ReentrantLock reentrantLock = cVar.f112507a;
            reentrantLock.lock();
            try {
                cVar.f112508b.await();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                MethodCollector.o(6341);
                throw th;
            }
        }
        T t = (T) aVar.invoke();
        if (t == null) {
            if (fVar != null) {
                synchronized (hashSet) {
                    try {
                        hashSet.add(str);
                    } finally {
                        MethodCollector.o(6341);
                    }
                }
                f112500f.incrementAndGet();
            }
        } else if (fVar == null) {
            f112501g.incrementAndGet();
        }
        return t;
    }
}
