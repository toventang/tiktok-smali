package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.h.a.e;
import com.ss.android.ugc.tools.h.a.f;
import com.ss.android.ugc.tools.h.a.h;
import com.ss.android.ugc.tools.h.a.k;
import f.a.l.g;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.p;
import h.v;
import h.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<KEY, RESULT, INFO> implements h<KEY, RESULT, INFO> {

    /* renamed from: d  reason: collision with root package name */
    public static final C4029a f149221d = new C4029a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final g<com.ss.android.ugc.tools.h.a.d<KEY, RESULT>> f149222a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, f<KEY, RESULT>> f149223b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f149224c;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f149225e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    private k<KEY, INFO> f149226f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f149227g = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(98281);
    }

    /* access modifiers changed from: protected */
    public abstract String a(KEY key);

    /* access modifiers changed from: protected */
    public abstract void a(KEY key, f<KEY, RESULT, INFO> fVar);

    /* renamed from: com.ss.android.ugc.tools.h.b.a.a$a  reason: collision with other inner class name */
    public static final class C4029a {
        static {
            Covode.recordClassIndex(98282);
        }

        private C4029a() {
        }

        public /* synthetic */ C4029a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.tools.utils.f> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(98285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.utils.f invoke() {
            com.ss.android.ugc.tools.utils.f fVar = new com.ss.android.ugc.tools.utils.f(Math.min((Runtime.getRuntime().availableProcessors() * 2) + 1, this.this$0.f149224c), this.this$0.f149224c, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
            fVar.allowCoreThreadTimeOut(true);
            return fVar;
        }
    }

    public final void a(k<KEY, INFO> kVar) {
        l.d(kVar, "");
        this.f149226f = kVar;
    }

    static final class d<T> implements f.a.d.f<com.ss.android.ugc.tools.h.a.d<KEY, RESULT>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149232a;

        static {
            Covode.recordClassIndex(98286);
        }

        d(a aVar) {
            this.f149232a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.i(7228);
            com.ss.android.ugc.tools.h.a.d<KEY, RESULT> dVar = (com.ss.android.ugc.tools.h.a.d) obj;
            if (dVar.f149207a == e.SUCCESS || dVar.f149207a == e.FAILED) {
                synchronized (this.f149232a.f149223b) {
                    try {
                        this.f149232a.f149223b.remove(this.f149232a.a((Object) dVar.f149208b));
                    } catch (Throwable th) {
                        MethodCollector.o(7228);
                        throw th;
                    }
                }
            }
            this.f149232a.f149222a.onNext(dVar);
            MethodCollector.o(7228);
        }
    }

    public a(int i2) {
        this.f149224c = i2;
        g<com.ss.android.ugc.tools.h.a.d<KEY, RESULT>> j2 = new f.a.l.c().j();
        l.b(j2, "");
        this.f149222a = j2;
    }

    @Override // com.ss.android.ugc.tools.h.a.h
    public final p<e, Boolean> b(KEY key) {
        f<KEY, RESULT> fVar = this.f149223b.get(a((Object) key));
        e eVar = null;
        if (fVar == null) {
            return null;
        }
        com.ss.android.ugc.tools.h.a.d<KEY, RESULT> i2 = fVar.f149248a.i();
        if (i2 != null) {
            eVar = i2.f149207a;
        }
        return v.a(eVar, Boolean.valueOf(fVar.f149251d));
    }

    static final class b<T1, T2, R> implements f.a.d.c<KEY, h.f.a.b<? super Integer, ? extends z>, RESULT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f149229b;

        static {
            Covode.recordClassIndex(98283);
        }

        b(a aVar, k kVar) {
            this.f149228a = aVar;
            this.f149229b = kVar;
        }

        /* renamed from: com.ss.android.ugc.tools.h.b.a.a$b$a  reason: collision with other inner class name */
        public static final class C4030a implements f<KEY, RESULT, INFO> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.google.c.h.a.v f149230a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f149231b;

            static {
                Covode.recordClassIndex(98284);
            }

            C4030a(com.google.c.h.a.v vVar, h.f.a.b bVar) {
                this.f149230a = vVar;
                this.f149231b = bVar;
            }

            @Override // com.ss.android.ugc.tools.h.a.f
            public final void a(KEY key, int i2) {
                this.f149231b.invoke(Integer.valueOf(i2));
            }

            @Override // com.ss.android.ugc.tools.h.a.f
            public final void a(KEY key, RESULT result) {
                this.f149230a.b(new g(key, result, true, null, null, null));
            }

            @Override // com.ss.android.ugc.tools.h.a.f
            public final void a(KEY key, Exception exc, INFO info, long j2) {
                this.f149230a.b(new g(key, null, false, info, Long.valueOf(j2), exc));
            }

            @Override // com.ss.android.ugc.tools.h.a.f
            public final void a(KEY key, RESULT result, INFO info, long j2) {
                this.f149230a.b(new g(key, result, false, info, Long.valueOf(j2), null));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // f.a.d.c
        public final /* bridge */ /* synthetic */ Object a(Object obj, h.f.a.b<? super Integer, ? extends z> bVar) {
            return a(obj, (h.f.a.b<? super Integer, z>) bVar);
        }

        private RESULT a(KEY key, h.f.a.b<? super Integer, z> bVar) {
            k kVar;
            k kVar2;
            l.d(bVar, "");
            com.google.c.h.a.v e2 = com.google.c.h.a.v.e();
            try {
                this.f149228a.a(key, new C4030a(e2, bVar));
                g gVar = (g) e2.get();
                KEY key2 = gVar.f149254a;
                RESULT result = gVar.f149255b;
                boolean z = gVar.f149256c;
                INFO info = gVar.f149257d;
                Long l2 = gVar.f149258e;
                Exception exc = gVar.f149259f;
                if (result == null) {
                    k kVar3 = this.f149229b;
                    if (kVar3 != null) {
                        kVar3.a(key2, l2, exc, info);
                    }
                    throw new e(exc);
                }
                if (!z && (kVar2 = this.f149229b) != null) {
                    kVar2.a(key2, l2, info);
                }
                return result;
            } catch (InterruptedException e3) {
                throw e3;
            } catch (Exception e4) {
                if (!(e4 instanceof e) && !(e4 instanceof InterruptedException) && (kVar = this.f149229b) != null) {
                    kVar.a(key, 0L, e4, null);
                }
                throw e4;
            }
        }
    }

    @Override // com.ss.android.ugc.tools.h.a.h
    public final t<com.ss.android.ugc.tools.h.a.d<KEY, RESULT>> a(KEY key, boolean z) {
        boolean z2;
        f<KEY, RESULT> fVar;
        com.ss.android.ugc.tools.h.a.d<KEY, RESULT> dVar;
        synchronized (this.f149223b) {
            ConcurrentHashMap<String, f<KEY, RESULT>> concurrentHashMap = this.f149223b;
            String a2 = a((Object) key);
            f<KEY, RESULT> fVar2 = concurrentHashMap.get(a2);
            if (fVar2 == null) {
                fVar2 = new f<>(key, this.f149225e.getAndIncrement(), new b(this, this.f149226f), z, (byte) 0);
                z2 = true;
                f<KEY, RESULT> putIfAbsent = concurrentHashMap.putIfAbsent(a2, fVar2);
                if (putIfAbsent != null) {
                    fVar2 = putIfAbsent;
                }
            } else {
                z2 = false;
            }
            l.b(fVar2, "");
            fVar = fVar2;
            dVar = null;
            if (!z2) {
                if (fVar.f149248a.i() == null) {
                }
            }
            if (z) {
                fVar.f149251d = z;
                dVar = new com.ss.android.ugc.tools.h.a.d<>(e.PENDING, key, null, null);
            }
        }
        if (dVar != null) {
            fVar.f149248a.onNext(dVar);
        }
        if (z2) {
            fVar.f149248a.a(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(this), com.ss.android.ugc.tools.utils.p.f150012a);
            fVar.f149252e = ((ExecutorService) this.f149227g.getValue()).submit(fVar);
        }
        return fVar.f149248a;
    }
}
