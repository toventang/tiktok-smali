package b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f4824a = g.b();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f4825b = c.f4808a.f4809b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f4826c = b.f4803a.f4807b;

    /* renamed from: d  reason: collision with root package name */
    static volatile a f4827d;

    /* renamed from: e  reason: collision with root package name */
    public static i<?> f4828e = new i<>((byte) 0);
    private static i<?> n = new i<>((Object) null);
    private static i<Boolean> o = new i<>((Boolean) true);
    private static i<Boolean> p = new i<>((Boolean) false);

    /* renamed from: f  reason: collision with root package name */
    private final Object f4829f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f4830g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4831h;

    /* renamed from: i  reason: collision with root package name */
    private TResult f4832i;

    /* renamed from: j  reason: collision with root package name */
    private Exception f4833j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4834k;

    /* renamed from: l  reason: collision with root package name */
    private k f4835l;

    /* renamed from: m  reason: collision with root package name */
    private List<g<TResult, Void>> f4836m = new ArrayList();

    public interface a {
        static {
            Covode.recordClassIndex(1911);
        }
    }

    public final boolean a() {
        boolean z;
        MethodCollector.i(696);
        synchronized (this.f4829f) {
            try {
                z = this.f4830g;
            } finally {
                MethodCollector.o(696);
            }
        }
        return z;
    }

    public final boolean a(long j2, TimeUnit timeUnit) {
        boolean a2;
        MethodCollector.i(761);
        synchronized (this.f4829f) {
            try {
                if (!a()) {
                    this.f4829f.wait(timeUnit.toMillis(j2));
                }
                a2 = a();
            } finally {
                MethodCollector.o(761);
            }
        }
        return a2;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: b.i<TResult>, b.i<TContinuationResult> */
    public final <TContinuationResult> i<TContinuationResult> a(final g<TResult, TContinuationResult> gVar, final Executor executor, final d dVar) {
        boolean a2;
        MethodCollector.i(4131);
        final j jVar = new j();
        synchronized (this.f4829f) {
            try {
                a2 = a();
                if (!a2) {
                    this.f4836m.add(new g<TResult, Void>() {
                        /* class b.i.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(1902);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void then(i<TResult> iVar) {
                            i.a(jVar, gVar, iVar, executor, dVar);
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                MethodCollector.o(4131);
                throw th;
            }
        }
        if (a2) {
            a(jVar, gVar, this, executor, dVar);
        }
        i iVar = (i<TResult>) jVar.f4869a;
        MethodCollector.o(4131);
        return iVar;
    }

    i() {
    }

    public final boolean c() {
        boolean z;
        MethodCollector.i(721);
        synchronized (this.f4829f) {
            try {
                if (e() != null) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(721);
            }
        }
        return z;
    }

    public final TResult d() {
        TResult tresult;
        MethodCollector.i(724);
        synchronized (this.f4829f) {
            try {
                tresult = this.f4832i;
            } finally {
                MethodCollector.o(724);
            }
        }
        return tresult;
    }

    public final void f() {
        MethodCollector.i(744);
        synchronized (this.f4829f) {
            try {
                if (!a()) {
                    this.f4829f.wait();
                }
            } finally {
                MethodCollector.o(744);
            }
        }
    }

    static {
        Covode.recordClassIndex(1900);
    }

    private void h() {
        MethodCollector.i(1365);
        synchronized (this.f4829f) {
            try {
                for (g<TResult, Void> gVar : this.f4836m) {
                    try {
                        gVar.then(this);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        RuntimeException runtimeException = new RuntimeException(e3);
                        MethodCollector.o(1365);
                        throw runtimeException;
                    }
                }
                this.f4836m = null;
            } finally {
                MethodCollector.o(1365);
            }
        }
        MethodCollector.o(1365);
    }

    public final Exception e() {
        Exception exc;
        MethodCollector.i(740);
        synchronized (this.f4829f) {
            try {
                if (this.f4833j != null) {
                    this.f4834k = true;
                    k kVar = this.f4835l;
                    if (kVar != null) {
                        kVar.f4870a = null;
                        this.f4835l = null;
                    }
                }
                exc = this.f4833j;
            } finally {
                MethodCollector.o(740);
            }
        }
        return exc;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        MethodCollector.i(1432);
        synchronized (this.f4829f) {
            try {
                if (this.f4830g) {
                    return false;
                }
                this.f4830g = true;
                this.f4831h = true;
                this.f4829f.notifyAll();
                h();
                MethodCollector.o(1432);
                return true;
            } finally {
                MethodCollector.o(1432);
            }
        }
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(701);
        synchronized (this.f4829f) {
            try {
                z = this.f4831h;
            } finally {
                MethodCollector.o(701);
            }
        }
        return z;
    }

    public static <TResult> i<TResult> a(Callable<TResult> callable) {
        return b(callable, f4824a);
    }

    public static <TResult> i<TResult> b(Callable<TResult> callable) {
        return b(callable, f4825b);
    }

    public final <TContinuationResult> i<TContinuationResult> c(g<TResult, TContinuationResult> gVar) {
        return c(gVar, f4825b);
    }

    public static <TResult> i<TResult> a(Exception exc) {
        j jVar = new j();
        jVar.b(exc);
        return jVar.f4869a;
    }

    public final <TContinuationResult> i<TContinuationResult> b(g<TResult, i<TContinuationResult>> gVar) {
        return b(gVar, f4825b);
    }

    public static <TResult> i<List<TResult>> a(final Collection<? extends i<TResult>> collection) {
        return b((Collection<? extends i<?>>) collection).c(new g<Void, List<TResult>>() {
            /* class b.i.AnonymousClass8 */

            static {
                Covode.recordClassIndex(1909);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ Object then(i<Void> iVar) {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (i iVar2 : collection) {
                    arrayList.add(iVar2.d());
                }
                return arrayList;
            }
        });
    }

    private i(byte b2) {
        g();
    }

    public static i<Void> a(long j2) {
        ScheduledExecutorService d2 = g.d();
        if (j2 <= 0) {
            return a((Object) null);
        }
        final j jVar = new j();
        d2.schedule(new Runnable() {
            /* class b.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1901);
            }

            public final void run() {
                jVar.a((Object) null);
            }
        }, j2, TimeUnit.MILLISECONDS);
        return jVar.f4869a;
    }

    private i(TResult tresult) {
        b((Object) tresult);
    }

    public static <TResult> i<TResult> a(TResult tresult) {
        if (tresult == null) {
            return (i<TResult>) n;
        }
        if (tresult instanceof Boolean) {
            return tresult.booleanValue() ? (i<TResult>) o : (i<TResult>) p;
        }
        j jVar = new j();
        jVar.b((Object) tresult);
        return jVar.f4869a;
    }

    public static i<Void> b(Collection<? extends i<?>> collection) {
        if (collection.size() == 0) {
            return a((Object) null);
        }
        final j jVar = new j();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends i<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a((g) new g<Object, Void>() {
                /* class b.i.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(1910);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(i<Object> iVar) {
                    MethodCollector.i(434);
                    if (iVar.c()) {
                        synchronized (obj) {
                            try {
                                arrayList.add(iVar.e());
                            } catch (Throwable th) {
                                MethodCollector.o(434);
                                throw th;
                            }
                        }
                    }
                    if (iVar.b()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                jVar.b((Exception) arrayList.get(0));
                            } else {
                                jVar.b((Exception) new a(com.a.a("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList.size())}), arrayList));
                            }
                        } else if (atomicBoolean.get()) {
                            jVar.a();
                        } else {
                            jVar.b((Object) null);
                        }
                    }
                    MethodCollector.o(434);
                    return null;
                }
            });
        }
        return jVar.f4869a;
    }

    public final <TContinuationResult> i<TContinuationResult> a(g<TResult, TContinuationResult> gVar) {
        return a(gVar, f4825b, null);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(Exception exc) {
        MethodCollector.i(1514);
        synchronized (this.f4829f) {
            try {
                if (this.f4830g) {
                    return false;
                }
                this.f4830g = true;
                this.f4833j = exc;
                this.f4834k = false;
                this.f4829f.notifyAll();
                h();
                if (!this.f4834k && f4827d != null) {
                    this.f4835l = new k(this);
                }
                MethodCollector.o(1514);
                return true;
            } finally {
                MethodCollector.o(1514);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(TResult tresult) {
        MethodCollector.i(1497);
        synchronized (this.f4829f) {
            try {
                if (this.f4830g) {
                    return false;
                }
                this.f4830g = true;
                this.f4832i = tresult;
                this.f4829f.notifyAll();
                h();
                MethodCollector.o(1497);
                return true;
            } finally {
                MethodCollector.o(1497);
            }
        }
    }

    public final <TContinuationResult> i<TContinuationResult> c(final g<TResult, TContinuationResult> gVar, Executor executor) {
        return b(new g<TResult, i<TContinuationResult>>() {
            /* class b.i.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f4848a = null;

            static {
                Covode.recordClassIndex(1904);
            }

            @Override // b.g
            public final /* synthetic */ Object then(i iVar) {
                d dVar = this.f4848a;
                if (dVar != null && dVar.f4813a.a()) {
                    return i.f4828e;
                }
                if (iVar.c()) {
                    return i.a(iVar.e());
                }
                if (iVar.b()) {
                    return i.f4828e;
                }
                return iVar.a(gVar);
            }
        }, executor);
    }

    public static <TResult> i<TResult> b(final Callable<TResult> callable, Executor executor) {
        final j jVar = new j();
        try {
            executor.execute(new Runnable() {
                /* class b.i.AnonymousClass7 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f4860a = null;

                static {
                    Covode.recordClassIndex(1908);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: b.j */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    d dVar = this.f4860a;
                    if (dVar == null || !dVar.f4813a.a()) {
                        try {
                            jVar.b(callable.call());
                        } catch (CancellationException unused) {
                            jVar.a();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.a();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b((Exception) new h(e2));
        }
        return jVar.f4869a;
    }

    public static <TResult> i<TResult> a(Callable<TResult> callable, Executor executor) {
        return b(callable, executor);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: b.i<TResult>, b.i<TContinuationResult> */
    public final <TContinuationResult> i<TContinuationResult> b(final g<TResult, i<TContinuationResult>> gVar, final Executor executor) {
        boolean a2;
        MethodCollector.i(4545);
        final j jVar = new j();
        synchronized (this.f4829f) {
            try {
                a2 = a();
                if (!a2) {
                    this.f4836m.add(new g<TResult, Void>() {
                        /* class b.i.AnonymousClass3 */

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ d f4846d = null;

                        static {
                            Covode.recordClassIndex(1903);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void then(i<TResult> iVar) {
                            i.b(jVar, gVar, iVar, executor, this.f4846d);
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                MethodCollector.o(4545);
                throw th;
            }
        }
        if (a2) {
            b(jVar, gVar, this, executor, null);
        }
        i iVar = (i<TResult>) jVar.f4869a;
        MethodCollector.o(4545);
        return iVar;
    }

    public final <TContinuationResult> i<TContinuationResult> a(g<TResult, TContinuationResult> gVar, Executor executor) {
        return a(gVar, executor, null);
    }

    public static <TContinuationResult, TResult> void b(final j<TContinuationResult> jVar, final g<TResult, i<TContinuationResult>> gVar, final i<TResult> iVar, Executor executor, final d dVar) {
        try {
            executor.execute(new Runnable() {
                /* class b.i.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(1906);
                }

                public final void run() {
                    d dVar = dVar;
                    if (dVar == null || !dVar.f4813a.a()) {
                        try {
                            i iVar = (i) gVar.then(iVar);
                            if (iVar == null) {
                                jVar.b((Object) null);
                            } else {
                                iVar.a((g) new g<TContinuationResult, Void>() {
                                    /* class b.i.AnonymousClass6.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(1907);
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.j */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // b.g
                                    public final /* synthetic */ Void then(i iVar) {
                                        if (dVar != null && dVar.f4813a.a()) {
                                            jVar.a();
                                            return null;
                                        } else if (iVar.b()) {
                                            jVar.a();
                                            return null;
                                        } else if (iVar.c()) {
                                            jVar.b(iVar.e());
                                            return null;
                                        } else {
                                            jVar.b(iVar.d());
                                            return null;
                                        }
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            jVar.a();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.a();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b(new h(e2));
        }
    }

    public static <TContinuationResult, TResult> void a(final j<TContinuationResult> jVar, final g<TResult, TContinuationResult> gVar, final i<TResult> iVar, Executor executor, final d dVar) {
        try {
            executor.execute(new Runnable() {
                /* class b.i.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(1905);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: b.j */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    d dVar = dVar;
                    if (dVar == null || !dVar.f4813a.a()) {
                        try {
                            jVar.b(gVar.then(iVar));
                        } catch (CancellationException unused) {
                            jVar.a();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.a();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b(new h(e2));
        }
    }
}
