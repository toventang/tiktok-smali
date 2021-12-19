package com.ss.android.ugc.aweme.filter.repository.internal.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import com.ss.android.ugc.aweme.filter.repository.internal.e;
import com.ss.android.ugc.aweme.filter.repository.internal.j;
import com.ss.android.ugc.aweme.filter.repository.internal.k;
import com.ss.android.ugc.aweme.filter.repository.internal.l;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.tools.h.a.p;
import com.ss.android.ugc.tools.utils.f;
import f.a.l.g;
import f.a.t;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final g<com.ss.android.ugc.aweme.filter.repository.internal.b> f95562a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, c> f95563b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public j f95564c;

    /* renamed from: d  reason: collision with root package name */
    public final l f95565d;

    /* renamed from: e  reason: collision with root package name */
    public final e f95566e;

    /* renamed from: f  reason: collision with root package name */
    public final q<com.ss.android.ugc.tools.h.a.l> f95567f;

    /* renamed from: g  reason: collision with root package name */
    public final int f95568g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f95569h = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    private final h f95570i = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(60563);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.k
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.b> a() {
        t<com.ss.android.ugc.aweme.filter.repository.internal.b> c2 = this.f95562a.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    static final class b extends m implements h.f.a.a<f> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            f fVar = new f(0, this.this$0.f95568g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
            fVar.allowCoreThreadTimeOut(true);
            return fVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.k
    public final void b() {
        List<c> k2;
        MethodCollector.i(9758);
        synchronized (this.f95563b) {
            try {
                Collection<c> values = this.f95563b.values();
                h.f.b.l.b(values, "");
                k2 = n.k(values);
                this.f95563b.clear();
            } finally {
                MethodCollector.o(9758);
            }
        }
        for (c cVar : k2) {
            cVar.f95577c.onNext(new com.ss.android.ugc.aweme.filter.repository.internal.b(com.ss.android.ugc.aweme.filter.repository.internal.c.FAILED, cVar.f95575a, null, null));
            cVar.f95577c.onComplete();
            Future<?> future = cVar.f95579e;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.k
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.b> b(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        h.f.b.l.d(fVar, "");
        return a(fVar, false);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.k
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.b> a(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        h.f.b.l.d(fVar, "");
        return a(fVar, true);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.repository.internal.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f95574a;

        static {
            Covode.recordClassIndex(60567);
        }

        c(a aVar) {
            this.f95574a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.repository.internal.b bVar) {
            MethodCollector.i(10611);
            com.ss.android.ugc.aweme.filter.repository.internal.b bVar2 = bVar;
            if (bVar2.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.SUCCESS || bVar2.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.FAILED) {
                synchronized (this.f95574a.f95563b) {
                    try {
                        this.f95574a.f95563b.remove(Integer.valueOf(bVar2.f95584b.f95550a));
                    } catch (Throwable th) {
                        MethodCollector.o(10611);
                        throw th;
                    }
                }
            }
            this.f95574a.f95562a.onNext(bVar2);
            MethodCollector.o(10611);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.k
    public final com.ss.android.ugc.aweme.filter.repository.internal.c c(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        f.a.l.b<com.ss.android.ugc.aweme.filter.repository.internal.b> bVar;
        com.ss.android.ugc.aweme.filter.repository.internal.b i2;
        h.f.b.l.d(fVar, "");
        c cVar = this.f95563b.get(Integer.valueOf(fVar.f95550a));
        if (cVar == null || (bVar = cVar.f95577c) == null || (i2 = bVar.i()) == null) {
            return null;
        }
        return i2.f95583a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.a$a  reason: collision with other inner class name */
    public static final class C2306a<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.a.f, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f95571a;

        static {
            Covode.recordClassIndex(60564);
        }

        C2306a(a aVar) {
            this.f95571a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public d apply(final com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
            List<String> list;
            String str;
            Object obj;
            Exception exc;
            long j2;
            Exception exc2;
            Long l2;
            String str2;
            String str3 = "";
            h.f.b.l.d(fVar, str3);
            if (this.f95571a.f95566e.a(fVar)) {
                return this.f95571a.f95566e.a(fVar.f95550a);
            }
            if (this.f95571a.f95565d.a(fVar)) {
                return this.f95571a.f95565d.d(fVar.f95550a);
            }
            ToolsUrlModel toolsUrlModel = fVar.f95554e;
            if (toolsUrlModel == null || (list = toolsUrlModel.f138733b) == null || (str = (String) n.b((List) list, 0)) == null) {
                throw new RuntimeException("Filter url list is empty while downloading. id : " + fVar.f95550a + ", name : " + fVar.f95552c + '.');
            }
            String b2 = this.f95571a.f95565d.b(fVar.f95550a);
            String a2 = this.f95571a.f95565d.a(fVar.f95550a);
            com.ss.android.ugc.tools.h.a.l b3 = this.f95571a.f95567f.b();
            try {
                com.ss.android.ugc.tools.utils.i.c(this.f95571a.f95565d.c(fVar.f95550a));
                obj = h.q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = h.q.m223constructorimpl(r.a(th));
            }
            h.q.m228isFailureimpl(obj);
            com.ss.android.ugc.tools.utils.i.a(b2, false);
            final f.a.l.c cVar = new f.a.l.c();
            h.f.b.l.b(cVar, str3);
            b3.a(str, com.ss.android.ugc.aweme.filter.repository.a.a.b.a(b2) + a2, new p() {
                /* class com.ss.android.ugc.aweme.filter.repository.internal.a.a.C2306a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(60565);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.c */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.tools.h.a.p
                public final void a(String str, long j2) {
                    h.f.b.l.d(str, "");
                    cVar.onNext(Long.valueOf(j2));
                    cVar.onComplete();
                }

                @Override // com.ss.android.ugc.tools.h.a.p
                public final void a(String str, long j2, Exception exc, Integer num) {
                    h.f.b.l.d(str, "");
                    cVar.onError(new b("Filter downloading failed, id : " + fVar.f95550a + ", name : " + fVar.f95552c + '.', exc, num, Long.valueOf(j2)));
                }
            });
            try {
                Long l3 = (Long) cVar.a();
                j jVar = this.f95571a.f95564c;
                if (jVar != null) {
                    h.f.b.l.b(l3, str3);
                    long longValue = l3.longValue();
                    h.f.b.l.b(b3, str3);
                    jVar.a(fVar, str, longValue, b3);
                }
                if (this.f95571a.f95565d.e(fVar.f95550a)) {
                    h.f.b.l.d(fVar, str3);
                    Keva keva = d.f95581a;
                    String valueOf = String.valueOf(fVar.f95550a);
                    ToolsUrlModel toolsUrlModel2 = fVar.f95554e;
                    if (!(toolsUrlModel2 == null || (str2 = toolsUrlModel2.f138732a) == null)) {
                        str3 = str2;
                    }
                    keva.storeString(valueOf, str3);
                    return this.f95571a.f95565d.d(fVar.f95550a);
                }
                throw new RuntimeException("Filter unzip failed and causing exception is missing. id : " + fVar.f95550a + ", name : " + fVar.f95552c + '.');
            } catch (Exception e2) {
                j jVar2 = this.f95571a.f95564c;
                if (jVar2 != null) {
                    boolean z = e2 instanceof b;
                    Integer num = null;
                    if (!z) {
                        exc = null;
                    } else {
                        exc = e2;
                    }
                    b bVar = (b) exc;
                    if (bVar == null || (l2 = bVar.failDuration) == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    h.f.b.l.b(b3, str3);
                    if (!z) {
                        exc2 = null;
                    } else {
                        exc2 = e2;
                    }
                    b bVar2 = (b) exc2;
                    if (bVar2 != null) {
                        num = bVar2.errorCode;
                    }
                    jVar2.a(fVar, str, j2, b3, e2, num);
                }
                throw e2;
            }
        }
    }

    private final t<com.ss.android.ugc.aweme.filter.repository.internal.b> a(com.ss.android.ugc.aweme.filter.repository.a.f fVar, boolean z) {
        boolean z2;
        c cVar;
        com.ss.android.ugc.aweme.filter.repository.internal.b bVar;
        MethodCollector.i(9922);
        synchronized (this.f95563b) {
            try {
                ConcurrentHashMap<Integer, c> concurrentHashMap = this.f95563b;
                Integer valueOf = Integer.valueOf(fVar.f95550a);
                c cVar2 = concurrentHashMap.get(valueOf);
                if (cVar2 == null) {
                    C2306a aVar = new C2306a(this);
                    f.a.l.b bVar2 = new f.a.l.b();
                    h.f.b.l.b(bVar2, "");
                    cVar2 = new c(fVar, this.f95569h.getAndIncrement(), aVar, bVar2, z, (byte) 0);
                    z2 = true;
                    c putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, cVar2);
                    if (putIfAbsent != null) {
                        cVar2 = putIfAbsent;
                    }
                } else {
                    z2 = false;
                }
                h.f.b.l.b(cVar2, "");
                cVar = cVar2;
                bVar = null;
                if (!z2) {
                    if (cVar.f95577c.i() == null) {
                    }
                }
                if (z) {
                    cVar.f95578d = z;
                    bVar = new com.ss.android.ugc.aweme.filter.repository.internal.b(com.ss.android.ugc.aweme.filter.repository.internal.c.PENDING, fVar, null, null);
                }
            } catch (Throwable th) {
                MethodCollector.o(9922);
                throw th;
            }
        }
        if (bVar != null) {
            cVar.f95577c.onNext(bVar);
        }
        if (z2) {
            cVar.f95577c.a(f.a.h.a.b(f.a.k.a.f158006c)).a(new c(this), com.ss.android.ugc.tools.utils.p.f150012a);
            cVar.f95579e = ((ExecutorService) this.f95570i.getValue()).submit(cVar);
        }
        f.a.l.b<com.ss.android.ugc.aweme.filter.repository.internal.b> bVar3 = cVar.f95577c;
        MethodCollector.o(9922);
        return bVar3;
    }

    public a(l lVar, e eVar, q<com.ss.android.ugc.tools.h.a.l> qVar, int i2) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(qVar, "");
        this.f95565d = lVar;
        this.f95566e = eVar;
        this.f95567f = qVar;
        this.f95568g = i2;
        g<com.ss.android.ugc.aweme.filter.repository.internal.b> j2 = new f.a.l.c().j();
        h.f.b.l.b(j2, "");
        this.f95562a = j2;
    }
}
