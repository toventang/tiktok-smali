package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.aa;
import f.a.e.d.p;
import f.a.e.j.n;
import f.a.x;
import f.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class c<T, U extends Collection<? super T>> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final long f157593b;

    /* renamed from: c  reason: collision with root package name */
    final long f157594c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f157595d;

    /* renamed from: e  reason: collision with root package name */
    final aa f157596e;

    /* renamed from: f  reason: collision with root package name */
    final Callable<U> f157597f;

    /* renamed from: g  reason: collision with root package name */
    final int f157598g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    final boolean f157599h = false;

    static {
        Covode.recordClassIndex(104702);
    }

    static final class a<T, U extends Collection<? super T>> extends p<T, U, U> implements f.a.b.b, Runnable {

        /* renamed from: g  reason: collision with root package name */
        final Callable<U> f157600g;

        /* renamed from: h  reason: collision with root package name */
        final long f157601h;

        /* renamed from: i  reason: collision with root package name */
        final TimeUnit f157602i;

        /* renamed from: j  reason: collision with root package name */
        final int f157603j;

        /* renamed from: k  reason: collision with root package name */
        final boolean f157604k;

        /* renamed from: l  reason: collision with root package name */
        final aa.c f157605l;

        /* renamed from: m  reason: collision with root package name */
        U f157606m;
        f.a.b.b n;
        f.a.b.b o;
        long p;
        long q;

        static {
            Covode.recordClassIndex(104703);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157228c;
        }

        @Override // f.a.b.b
        public final void dispose() {
            MethodCollector.i(12252);
            if (!this.f157228c) {
                this.f157228c = true;
                this.o.dispose();
                this.f157605l.dispose();
                synchronized (this) {
                    try {
                        this.f157606m = null;
                    } finally {
                        MethodCollector.o(12252);
                    }
                }
                return;
            }
            MethodCollector.o(12252);
        }

        @Override // f.a.z
        public final void onComplete() {
            U u;
            MethodCollector.i(12097);
            this.f157605l.dispose();
            synchronized (this) {
                try {
                    u = this.f157606m;
                    this.f157606m = null;
                } finally {
                    MethodCollector.o(12097);
                }
            }
            this.f157227b.offer(u);
            this.f157229d = true;
            if (c()) {
                n.a(this.f157227b, this.f157226a, this, this);
            }
        }

        public final void run() {
            MethodCollector.i(12397);
            try {
                U u = (U) ((Collection) f.a.e.b.b.a((Object) this.f157600g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    try {
                        U u2 = this.f157606m;
                        if (u2 != null && this.p == this.q) {
                            this.f157606m = u;
                            b(u2, this);
                            MethodCollector.o(12397);
                        }
                    } finally {
                        MethodCollector.o(12397);
                    }
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                dispose();
                this.f157226a.onError(th);
                MethodCollector.o(12397);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            MethodCollector.i(11964);
            synchronized (this) {
                try {
                    this.f157606m = null;
                } catch (Throwable th2) {
                    MethodCollector.o(11964);
                    throw th2;
                }
            }
            this.f157226a.onError(th);
            this.f157605l.dispose();
            MethodCollector.o(11964);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.o, bVar)) {
                this.o = bVar;
                try {
                    this.f157606m = (U) ((Collection) f.a.e.b.b.a((Object) this.f157600g.call(), "The buffer supplied is null"));
                    this.f157226a.onSubscribe(this);
                    aa.c cVar = this.f157605l;
                    long j2 = this.f157601h;
                    this.n = cVar.a(this, j2, j2, this.f157602i);
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    bVar.dispose();
                    f.a.e.a.c.error(th, this.f157226a);
                    this.f157605l.dispose();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
            if (r13.f157604k == false) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            r13.n.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
            b(r4, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r0 = (U) ((java.util.Collection) f.a.e.b.b.a((java.lang.Object) r13.f157600g.call(), "The buffer supplied is null"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r13.f157606m = r0;
            r13.q++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
            if (r13.f157604k == false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r6 = r13.f157605l;
            r8 = r13.f157601h;
            r13.n = r6.a(r13, r8, r8, r13.f157602i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(11963);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
            f.a.c.b.a(r1);
            r13.f157226a.onError(r1);
            dispose();
            com.bytedance.frameworks.apm.trace.MethodCollector.o(11963);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
            return;
         */
        @Override // f.a.z
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r14) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.c.a.onNext(java.lang.Object):void");
        }

        @Override // f.a.e.j.k, f.a.e.d.p
        public final /* synthetic */ void a(z zVar, Object obj) {
            zVar.onNext(obj);
        }

        a(z<? super U> zVar, Callable<U> callable, long j2, TimeUnit timeUnit, int i2, boolean z, aa.c cVar) {
            super(zVar, new f.a.e.f.a());
            this.f157600g = callable;
            this.f157601h = j2;
            this.f157602i = timeUnit;
            this.f157603j = i2;
            this.f157604k = z;
            this.f157605l = cVar;
        }
    }

    /* renamed from: f.a.e.e.e.c$c  reason: collision with other inner class name */
    static final class RunnableC4166c<T, U extends Collection<? super T>> extends p<T, U, U> implements f.a.b.b, Runnable {

        /* renamed from: g  reason: collision with root package name */
        final Callable<U> f157614g;

        /* renamed from: h  reason: collision with root package name */
        final long f157615h;

        /* renamed from: i  reason: collision with root package name */
        final long f157616i;

        /* renamed from: j  reason: collision with root package name */
        final TimeUnit f157617j;

        /* renamed from: k  reason: collision with root package name */
        final aa.c f157618k;

        /* renamed from: l  reason: collision with root package name */
        final List<U> f157619l = new LinkedList();

        /* renamed from: m  reason: collision with root package name */
        f.a.b.b f157620m;

        static {
            Covode.recordClassIndex(104705);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157228c;
        }

        private void e() {
            MethodCollector.i(11316);
            synchronized (this) {
                try {
                    this.f157619l.clear();
                } finally {
                    MethodCollector.o(11316);
                }
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f157228c) {
                this.f157228c = true;
                e();
                this.f157620m.dispose();
                this.f157618k.dispose();
            }
        }

        /* renamed from: f.a.e.e.e.c$c$a */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final U f157622b;

            static {
                Covode.recordClassIndex(104706);
            }

            public final void run() {
                MethodCollector.i(11946);
                synchronized (RunnableC4166c.this) {
                    try {
                        RunnableC4166c.this.f157619l.remove(this.f157622b);
                    } catch (Throwable th) {
                        MethodCollector.o(11946);
                        throw th;
                    }
                }
                RunnableC4166c cVar = RunnableC4166c.this;
                cVar.b(this.f157622b, cVar.f157618k);
                MethodCollector.o(11946);
            }

            a(U u) {
                this.f157622b = u;
            }
        }

        /* renamed from: f.a.e.e.e.c$c$b */
        final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final U f157624b;

            static {
                Covode.recordClassIndex(104707);
            }

            public final void run() {
                MethodCollector.i(10726);
                synchronized (RunnableC4166c.this) {
                    try {
                        RunnableC4166c.this.f157619l.remove(this.f157624b);
                    } catch (Throwable th) {
                        MethodCollector.o(10726);
                        throw th;
                    }
                }
                RunnableC4166c cVar = RunnableC4166c.this;
                cVar.b(this.f157624b, cVar.f157618k);
                MethodCollector.o(10726);
            }

            b(U u) {
                this.f157624b = u;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.e.c.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.z
        public final void onComplete() {
            ArrayList<Object> arrayList;
            MethodCollector.i(10996);
            synchronized (this) {
                try {
                    arrayList = new ArrayList(this.f157619l);
                    this.f157619l.clear();
                } finally {
                    MethodCollector.o(10996);
                }
            }
            for (Object obj : arrayList) {
                this.f157227b.offer(obj);
            }
            this.f157229d = true;
            if (c()) {
                n.a(this.f157227b, this.f157226a, this.f157618k, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            MethodCollector.i(11475);
            if (this.f157228c) {
                MethodCollector.o(11475);
                return;
            }
            try {
                Collection collection = (Collection) f.a.e.b.b.a((Object) this.f157614g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (!this.f157228c) {
                            this.f157619l.add(collection);
                            this.f157618k.a(new a(collection), this.f157615h, this.f157617j);
                            MethodCollector.o(11475);
                        }
                    } finally {
                        MethodCollector.o(11475);
                    }
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157226a.onError(th);
                dispose();
                MethodCollector.o(11475);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157229d = true;
            e();
            this.f157226a.onError(th);
            this.f157618k.dispose();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            MethodCollector.i(10821);
            synchronized (this) {
                try {
                    for (U u : this.f157619l) {
                        u.add(t);
                    }
                } finally {
                    MethodCollector.o(10821);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157620m, bVar)) {
                this.f157620m = bVar;
                try {
                    Collection collection = (Collection) f.a.e.b.b.a((Object) this.f157614g.call(), "The buffer supplied is null");
                    this.f157619l.add(collection);
                    this.f157226a.onSubscribe(this);
                    aa.c cVar = this.f157618k;
                    long j2 = this.f157616i;
                    cVar.a(this, j2, j2, this.f157617j);
                    this.f157618k.a(new b(collection), this.f157615h, this.f157617j);
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    bVar.dispose();
                    f.a.e.a.c.error(th, this.f157226a);
                    this.f157618k.dispose();
                }
            }
        }

        @Override // f.a.e.j.k, f.a.e.d.p
        public final /* synthetic */ void a(z zVar, Object obj) {
            zVar.onNext(obj);
        }

        RunnableC4166c(z<? super U> zVar, Callable<U> callable, long j2, long j3, TimeUnit timeUnit, aa.c cVar) {
            super(zVar, new f.a.e.f.a());
            this.f157614g = callable;
            this.f157615h = j2;
            this.f157616i = j3;
            this.f157617j = timeUnit;
            this.f157618k = cVar;
        }
    }

    static final class b<T, U extends Collection<? super T>> extends p<T, U, U> implements f.a.b.b, Runnable {

        /* renamed from: g  reason: collision with root package name */
        final Callable<U> f157607g;

        /* renamed from: h  reason: collision with root package name */
        final long f157608h;

        /* renamed from: i  reason: collision with root package name */
        final TimeUnit f157609i;

        /* renamed from: j  reason: collision with root package name */
        final aa f157610j;

        /* renamed from: k  reason: collision with root package name */
        f.a.b.b f157611k;

        /* renamed from: l  reason: collision with root package name */
        U f157612l;

        /* renamed from: m  reason: collision with root package name */
        final AtomicReference<f.a.b.b> f157613m = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104704);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.f157613m);
            this.f157611k.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (this.f157613m.get() == f.a.e.a.b.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // f.a.z
        public final void onComplete() {
            U u;
            MethodCollector.i(11063);
            synchronized (this) {
                try {
                    u = this.f157612l;
                    this.f157612l = null;
                } catch (Throwable th) {
                    MethodCollector.o(11063);
                    throw th;
                }
            }
            if (u != null) {
                this.f157227b.offer(u);
                this.f157229d = true;
                if (c()) {
                    n.a(this.f157227b, this.f157226a, null, this);
                }
            }
            f.a.e.a.b.dispose(this.f157613m);
            MethodCollector.o(11063);
        }

        public final void run() {
            U u;
            MethodCollector.i(11221);
            try {
                U u2 = (U) ((Collection) f.a.e.b.b.a((Object) this.f157607g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    try {
                        u = this.f157612l;
                        if (u != null) {
                            this.f157612l = u2;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11221);
                        throw th;
                    }
                }
                if (u == null) {
                    f.a.e.a.b.dispose(this.f157613m);
                    MethodCollector.o(11221);
                    return;
                }
                a(u, this);
                MethodCollector.o(11221);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157226a.onError(th2);
                dispose();
                MethodCollector.o(11221);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            MethodCollector.i(10892);
            synchronized (this) {
                try {
                    this.f157612l = null;
                } catch (Throwable th2) {
                    MethodCollector.o(10892);
                    throw th2;
                }
            }
            this.f157226a.onError(th);
            f.a.e.a.b.dispose(this.f157613m);
            MethodCollector.o(10892);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            MethodCollector.i(10891);
            synchronized (this) {
                try {
                    U u = this.f157612l;
                    if (u != null) {
                        u.add(t);
                        MethodCollector.o(10891);
                    }
                } finally {
                    MethodCollector.o(10891);
                }
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157611k, bVar)) {
                this.f157611k = bVar;
                try {
                    this.f157612l = (U) ((Collection) f.a.e.b.b.a((Object) this.f157607g.call(), "The buffer supplied is null"));
                    this.f157226a.onSubscribe(this);
                    if (!this.f157228c) {
                        aa aaVar = this.f157610j;
                        long j2 = this.f157608h;
                        f.a.b.b a2 = aaVar.a(this, j2, j2, this.f157609i);
                        if (!this.f157613m.compareAndSet(null, a2)) {
                            a2.dispose();
                        }
                    }
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    dispose();
                    f.a.e.a.c.error(th, this.f157226a);
                }
            }
        }

        @Override // f.a.e.j.k, f.a.e.d.p
        public final /* synthetic */ void a(z zVar, Object obj) {
            this.f157226a.onNext(obj);
        }

        b(z<? super U> zVar, Callable<U> callable, long j2, TimeUnit timeUnit, aa aaVar) {
            super(zVar, new f.a.e.f.a());
            this.f157607g = callable;
            this.f157608h = j2;
            this.f157609i = timeUnit;
            this.f157610j = aaVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        if (this.f157593b == this.f157594c && this.f157598g == Integer.MAX_VALUE) {
            this.f157412a.b(new b(new f.a.g.c(zVar), this.f157597f, this.f157593b, this.f157595d, this.f157596e));
            return;
        }
        aa.c a2 = this.f157596e.a();
        if (this.f157593b == this.f157594c) {
            this.f157412a.b(new a(new f.a.g.c(zVar), this.f157597f, this.f157593b, this.f157595d, this.f157598g, this.f157599h, a2));
        } else {
            this.f157412a.b(new RunnableC4166c(new f.a.g.c(zVar), this.f157597f, this.f157593b, this.f157594c, this.f157595d, a2));
        }
    }

    public c(x<T> xVar, long j2, long j3, TimeUnit timeUnit, aa aaVar, Callable<U> callable, int i2) {
        super(xVar);
        this.f157593b = j2;
        this.f157594c = j3;
        this.f157595d = timeUnit;
        this.f157596e = aaVar;
        this.f157597f = callable;
    }
}
