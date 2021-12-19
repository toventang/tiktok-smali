package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends aa {

    /* renamed from: d  reason: collision with root package name */
    static final aa f157852d = f.a.h.a.d(f.a.k.a.f158004a);

    /* renamed from: a  reason: collision with root package name */
    final boolean f157853a = false;

    /* renamed from: c  reason: collision with root package name */
    final Executor f157854c;

    public static final class c extends aa.c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final boolean f157857a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f157858b;

        /* renamed from: c  reason: collision with root package name */
        final f.a.e.f.a<Runnable> f157859c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f157860d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicInteger f157861e = new AtomicInteger();

        /* renamed from: f  reason: collision with root package name */
        final f.a.b.a f157862f = new f.a.b.a();

        static {
            Covode.recordClassIndex(104822);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157860d;
        }

        static final class a extends AtomicBoolean implements f.a.b.b, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            static {
                Covode.recordClassIndex(104823);
            }

            @Override // f.a.b.b
            public final void dispose() {
                lazySet(true);
            }

            @Override // f.a.b.b
            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            a(Runnable runnable) {
                this.actual = runnable;
            }
        }

        static final class b extends AtomicInteger implements f.a.b.b, Runnable {
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final f.a.e.a.a tasks;
            volatile Thread thread;

            static {
                Covode.recordClassIndex(104824);
            }

            private void a() {
                f.a.e.a.a aVar = this.tasks;
                if (aVar != null) {
                    aVar.c(this);
                }
            }

            @Override // f.a.b.b
            public final boolean isDisposed() {
                if (get() >= 2) {
                    return true;
                }
                return false;
            }

            @Override // f.a.b.b
            public final void dispose() {
                while (true) {
                    int i2 = get();
                    if (i2 >= 2) {
                        return;
                    }
                    if (i2 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread2 = this.thread;
                        if (thread2 != null) {
                            thread2.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            public final void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                a();
                            }
                            throw th;
                        }
                    } else {
                        this.thread = null;
                    }
                }
            }

            b(Runnable runnable, f.a.e.a.a aVar) {
                this.run = runnable;
                this.tasks = aVar;
            }
        }

        /* renamed from: f.a.e.g.d$c$c  reason: collision with other inner class name */
        final class RunnableC4174c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final f f157864b;

            /* renamed from: c  reason: collision with root package name */
            private final Runnable f157865c;

            static {
                Covode.recordClassIndex(104825);
            }

            public final void run() {
                this.f157864b.replace(c.this.a(this.f157865c));
            }

            RunnableC4174c(f fVar, Runnable runnable) {
                this.f157864b = fVar;
                this.f157865c = runnable;
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f157860d) {
                this.f157860d = true;
                this.f157862f.dispose();
                if (this.f157861e.getAndIncrement() == 0) {
                    this.f157859c.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r4.f157860d == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r3.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r2 = r4.f157861e.addAndGet(-r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r2 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                f.a.e.f.a<java.lang.Runnable> r3 = r4.f157859c
                r2 = 1
            L_0x0003:
                boolean r0 = r4.f157860d
                if (r0 == 0) goto L_0x000b
                r3.clear()
                return
            L_0x000b:
                java.lang.Object r0 = r3.poll()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 == 0) goto L_0x001e
                r0.run()
                boolean r0 = r4.f157860d
                if (r0 == 0) goto L_0x000b
                r3.clear()
                return
            L_0x001e:
                boolean r0 = r4.f157860d
                if (r0 == 0) goto L_0x0026
                r3.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f157861e
                int r0 = -r2
                int r2 = r1.addAndGet(r0)
                if (r2 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.g.d.c.run():void");
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable) {
            f.a.b.b aVar;
            if (this.f157860d) {
                return f.a.e.a.c.INSTANCE;
            }
            Runnable a2 = f.a.h.a.a(runnable);
            if (this.f157857a) {
                aVar = new b(a2, this.f157862f);
                this.f157862f.a(aVar);
            } else {
                aVar = new a(a2);
            }
            this.f157859c.offer(aVar);
            if (this.f157861e.getAndIncrement() == 0) {
                try {
                    this.f157858b.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f157860d = true;
                    this.f157859c.clear();
                    f.a.h.a.a(e2);
                    return f.a.e.a.c.INSTANCE;
                }
            }
            return aVar;
        }

        public c(Executor executor, boolean z) {
            this.f157858b = executor;
            this.f157859c = new f.a.e.f.a<>();
            this.f157857a = z;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (j2 <= 0) {
                return a(runnable);
            }
            if (this.f157860d) {
                return f.a.e.a.c.INSTANCE;
            }
            f fVar = new f();
            f fVar2 = new f(fVar);
            m mVar = new m(new RunnableC4174c(fVar2, f.a.h.a.a(runnable)), this.f157862f);
            this.f157862f.a(mVar);
            Executor executor = this.f157858b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.setFuture(((ScheduledExecutorService) executor).schedule((Callable) mVar, j2, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.f157860d = true;
                    f.a.h.a.a(e2);
                    return f.a.e.a.c.INSTANCE;
                }
            } else {
                mVar.setFuture(new c(d.f157852d.a(mVar, j2, timeUnit)));
            }
            fVar.replace(mVar);
            return fVar2;
        }
    }

    final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final b f157856b;

        static {
            Covode.recordClassIndex(104820);
        }

        public final void run() {
            this.f157856b.direct.replace(d.this.a(this.f157856b));
        }

        a(b bVar) {
            this.f157856b = bVar;
        }
    }

    static final class b extends AtomicReference<Runnable> implements f.a.b.b, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;
        final f direct = new f();
        final f timed = new f();

        static {
            Covode.recordClassIndex(104821);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(f.a.e.a.b.DISPOSED);
                    this.direct.lazySet(f.a.e.a.b.DISPOSED);
                }
            }
        }

        b(Runnable runnable) {
            super(runnable);
        }
    }

    static {
        Covode.recordClassIndex(104819);
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new c(this.f157854c, this.f157853a);
    }

    public d(Executor executor) {
        this.f157854c = executor;
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable) {
        Runnable a2 = f.a.h.a.a(runnable);
        try {
            if (this.f157854c instanceof ExecutorService) {
                l lVar = new l(a2);
                lVar.setFuture(((ExecutorService) this.f157854c).submit(lVar));
                return lVar;
            } else if (this.f157853a) {
                c.b bVar = new c.b(a2, null);
                this.f157854c.execute(bVar);
                return bVar;
            } else {
                c.a aVar = new c.a(a2);
                this.f157854c.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e2) {
            f.a.h.a.a(e2);
            return f.a.e.a.c.INSTANCE;
        }
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        Runnable a2 = f.a.h.a.a(runnable);
        if (this.f157854c instanceof ScheduledExecutorService) {
            try {
                l lVar = new l(a2);
                lVar.setFuture(((ScheduledExecutorService) this.f157854c).schedule(lVar, j2, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e2) {
                f.a.h.a.a(e2);
                return f.a.e.a.c.INSTANCE;
            }
        } else {
            b bVar = new b(a2);
            bVar.timed.replace(f157852d.a(new a(bVar), j2, timeUnit));
            return bVar;
        }
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        if (!(this.f157854c instanceof ScheduledExecutorService)) {
            return super.a(runnable, j2, j3, timeUnit);
        }
        try {
            k kVar = new k(f.a.h.a.a(runnable));
            kVar.setFuture(((ScheduledExecutorService) this.f157854c).scheduleAtFixedRate(kVar, j2, j3, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            f.a.h.a.a(e2);
            return f.a.e.a.c.INSTANCE;
        }
    }
}
