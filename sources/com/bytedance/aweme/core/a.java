package com.bytedance.aweme.core;

import android.os.Looper;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f25795a = 4;

    /* renamed from: b  reason: collision with root package name */
    public static Choreographer f25796b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25797c = false;

    /* renamed from: d  reason: collision with root package name */
    public static b f25798d = null;

    /* renamed from: e  reason: collision with root package name */
    static final ConcurrentHashMap<Long, ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>>> f25799e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    static final LinkedBlockingQueue<com.bytedance.aweme.a.a> f25800f = new LinkedBlockingQueue<>();

    /* renamed from: g  reason: collision with root package name */
    public static Method f25801g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final b f25802h;

    /* renamed from: i  reason: collision with root package name */
    static long f25803i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final a f25804j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f25805k = f25805k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f25806l = f25806l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f25807m = f25807m;
    private static final long n = n;
    private static final long o = o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static boolean s;
    private static final AtomicLong t = new AtomicLong(1);
    private static final AtomicLong u = new AtomicLong(0);
    private static final Choreographer$FrameCallbackC0549a v;
    private static final c w;

    public static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_aweme_core_RealVsyncWorker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_aweme_core_RealVsyncWorker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private a() {
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a f25809a;

        static {
            Covode.recordClassIndex(15064);
        }

        public final void run() {
            a.a(true, a.f25803i);
        }

        public b(a aVar) {
            l.c(aVar, "");
            this.f25809a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f25811a;

        static {
            Covode.recordClassIndex(15066);
        }

        d(boolean z) {
            this.f25811a = z;
        }

        public final void run() {
            a.a(this.f25811a);
        }
    }

    static {
        Covode.recordClassIndex(15062);
        a aVar = new a();
        f25804j = aVar;
        b a2 = b.a();
        l.a((Object) a2, "");
        f25798d = a2;
        v = new Choreographer$FrameCallbackC0549a(aVar);
        w = new c(aVar);
        f25802h = new b(aVar);
    }

    public static Method a() {
        try {
            Class<?> cls = Class.forName("android.view.Choreographer");
            l.a((Object) cls, "");
            Method declaredMethod = cls.getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final a f25810a;

        static {
            Covode.recordClassIndex(15065);
        }

        public final void doFrame(long j2) {
            a.f25803i = j2;
        }

        public c(a aVar) {
            l.c(aVar, "");
            this.f25810a = aVar;
        }
    }

    /* renamed from: com.bytedance.aweme.core.a$a  reason: collision with other inner class name */
    public static final class Choreographer$FrameCallbackC0549a implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final a f25808a;

        static {
            Covode.recordClassIndex(15063);
        }

        public final void doFrame(long j2) {
            a.a(false, j2);
        }

        public Choreographer$FrameCallbackC0549a(a aVar) {
            l.c(aVar, "");
            this.f25808a = aVar;
        }
    }

    private static void b(boolean z) {
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            a(z);
        } else {
            com.bytedance.aweme.b.a.f25788b.f25790a.post(new d(z));
        }
    }

    private static long a(com.bytedance.aweme.a.a aVar) {
        long nanoTime = System.nanoTime() - System.nanoTime();
        if (com.bytedance.aweme.a.a.f25784b.get(aVar.f25786a) == null) {
            com.bytedance.aweme.a.a.f25784b.put(aVar.f25786a, new p<>(1L, Long.valueOf(nanoTime)));
        } else {
            p<Long, Long> pVar = com.bytedance.aweme.a.a.f25784b.get(aVar.f25786a);
            if (pVar == null) {
                l.a();
            }
            l.a((Object) pVar, "");
            p<Long, Long> pVar2 = pVar;
            com.bytedance.aweme.a.a.f25784b.put(aVar.f25786a, new p<>(Long.valueOf(pVar2.getFirst().longValue() + 1), Long.valueOf(((pVar2.getSecond().longValue() * pVar2.getFirst().longValue()) + nanoTime) / (pVar2.getFirst().longValue() + 1))));
        }
        return nanoTime;
    }

    public static void a(boolean z) {
        if (z) {
            Choreographer choreographer = f25796b;
            if (choreographer != null) {
                choreographer.postFrameCallback(w);
            }
            Method method = f25801g;
            if (method == null) {
                l.a();
            }
            a(method, f25796b, new Object[]{Integer.valueOf(f25795a), f25802h, null, 0});
            return;
        }
        Choreographer.getInstance().postFrameCallback(v);
    }

    public static void a(boolean z, long j2) {
        boolean z2 = false;
        q = false;
        long nanoTime = System.nanoTime();
        long j3 = f25805k;
        long j4 = (j3 - (nanoTime - j2)) - f25806l;
        if (!z) {
            j4 -= f25807m;
        }
        if (j4 > j3 || j4 < 0) {
            j4 = n;
        }
        if (f25799e.size() > f25798d.f25813b || s) {
            j4 = Long.MAX_VALUE;
        }
        LinkedBlockingQueue<com.bytedance.aweme.a.a> linkedBlockingQueue = f25800f;
        while (true) {
            if (!linkedBlockingQueue.isEmpty()) {
                if (r) {
                    r = false;
                    j4 = o;
                    break;
                }
                com.bytedance.aweme.a.a peek = linkedBlockingQueue.peek();
                com.bytedance.aweme.a.a poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    l.a();
                }
                j4 -= a(poll);
                p<Long, Long> pVar = com.bytedance.aweme.a.a.f25784b.get(peek.f25786a);
                if (pVar != null) {
                    pVar.getSecond();
                }
            } else if (j4 < 0) {
                j4 = n;
            }
        }
        if (j4 == o) {
            b(z);
            return;
        }
        t.get();
        while (true) {
            AtomicLong atomicLong = t;
            if (atomicLong.get() > u.get()) {
                break;
            }
            ConcurrentHashMap<Long, ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>>> concurrentHashMap = f25799e;
            ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(atomicLong.get()));
            if (concurrentHashMap2 != null) {
                j4 = a(com.bytedance.aweme.b.a.a.NORMAL, j4, concurrentHashMap2);
                ArrayList<com.bytedance.aweme.a.a> arrayList = concurrentHashMap2.get(com.bytedance.aweme.b.a.a.NORMAL);
                if (arrayList == null) {
                    l.a();
                }
                if (arrayList.size() == 0) {
                    concurrentHashMap.remove(Long.valueOf(atomicLong.getAndAdd(1)));
                }
                if (j4 <= 0) {
                    break;
                }
            } else {
                concurrentHashMap.remove(Long.valueOf(atomicLong.getAndAdd(1)));
            }
        }
        ConcurrentHashMap<Long, ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>>> concurrentHashMap3 = f25799e;
        if (concurrentHashMap3.size() > 0 || f25800f.size() > 0) {
            b(z);
            if (concurrentHashMap3.size() == 1) {
                for (Map.Entry<Long, ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>>> entry : concurrentHashMap3.entrySet()) {
                    if (entry.getKey().longValue() < t.get()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    f25799e.clear();
                }
            }
            f25799e.size();
            return;
        }
        concurrentHashMap3.size();
        p = false;
    }

    private static long a(com.bytedance.aweme.b.a.a aVar, long j2, ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<com.bytedance.aweme.a.a>> concurrentHashMap) {
        boolean z;
        long j3;
        Long second;
        MethodCollector.i(4515);
        long j4 = j2;
        do {
            if (j4 <= 0 && j4 != n) {
                break;
            }
            if (concurrentHashMap == null) {
                l.a();
            }
            ArrayList<com.bytedance.aweme.a.a> arrayList = concurrentHashMap.get(aVar);
            if (arrayList == null) {
                l.a();
            }
            l.a((Object) arrayList, "");
            synchronized (arrayList) {
                try {
                    ArrayList<com.bytedance.aweme.a.a> arrayList2 = concurrentHashMap.get(aVar);
                    if (arrayList2 == null) {
                        l.a();
                    }
                    l.a((Object) arrayList2, "");
                    z = true;
                    if (!arrayList2.isEmpty()) {
                        if (r) {
                            r = false;
                            j4 = o;
                        } else {
                            ArrayList<com.bytedance.aweme.a.a> arrayList3 = concurrentHashMap.get(aVar);
                            if (arrayList3 == null) {
                                l.a();
                            }
                            com.bytedance.aweme.a.a aVar2 = arrayList3.get(0);
                            l.a((Object) aVar2, "");
                            com.bytedance.aweme.a.a aVar3 = aVar2;
                            p<Long, Long> pVar = com.bytedance.aweme.a.a.f25784b.get(aVar3.f25786a);
                            if (pVar == null || (second = pVar.getSecond()) == null) {
                                j3 = 0;
                            } else {
                                j3 = second.longValue();
                            }
                            if (j4 - j3 >= 0 || j4 == n || !q) {
                                ArrayList<com.bytedance.aweme.a.a> arrayList4 = concurrentHashMap.get(aVar);
                                if (arrayList4 == null) {
                                    l.a();
                                }
                                com.bytedance.aweme.a.a remove = arrayList4.remove(0);
                                l.a((Object) remove, "");
                                long a2 = a(remove);
                                p<Long, Long> pVar2 = com.bytedance.aweme.a.a.f25784b.get(aVar3.f25786a);
                                if (pVar2 != null) {
                                    pVar2.getSecond();
                                }
                                q = true;
                                if (j2 != n) {
                                    j4 -= a2;
                                } else {
                                    j4 = o;
                                }
                            } else {
                                j4 = o;
                            }
                        }
                    }
                    z = false;
                } finally {
                    MethodCollector.o(4515);
                }
            }
        } while (z);
        return j4;
    }
}
