package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends aa {

    /* renamed from: a  reason: collision with root package name */
    static final C4173b f157837a;

    /* renamed from: c  reason: collision with root package name */
    static final j f157838c;

    /* renamed from: d  reason: collision with root package name */
    static final int f157839d;

    /* renamed from: e  reason: collision with root package name */
    static final c f157840e;

    /* renamed from: f  reason: collision with root package name */
    final ThreadFactory f157841f;

    /* renamed from: g  reason: collision with root package name */
    final AtomicReference<C4173b> f157842g;

    static final class a extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        volatile boolean f157843a;

        /* renamed from: b  reason: collision with root package name */
        private final d f157844b;

        /* renamed from: c  reason: collision with root package name */
        private final f.a.b.a f157845c;

        /* renamed from: d  reason: collision with root package name */
        private final d f157846d;

        /* renamed from: e  reason: collision with root package name */
        private final c f157847e;

        static {
            Covode.recordClassIndex(104815);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157843a;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f157843a) {
                this.f157843a = true;
                this.f157846d.dispose();
            }
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable) {
            if (this.f157843a) {
                return f.a.e.a.c.INSTANCE;
            }
            return this.f157847e.a(runnable, 0, TimeUnit.MILLISECONDS, this.f157844b);
        }

        a(c cVar) {
            this.f157847e = cVar;
            d dVar = new d();
            this.f157844b = dVar;
            f.a.b.a aVar = new f.a.b.a();
            this.f157845c = aVar;
            d dVar2 = new d();
            this.f157846d = dVar2;
            dVar2.a(dVar);
            dVar2.a(aVar);
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f157843a) {
                return f.a.e.a.c.INSTANCE;
            }
            return this.f157847e.a(runnable, j2, timeUnit, this.f157845c);
        }
    }

    public b() {
        this(f157838c);
    }

    /* renamed from: f.a.e.g.b$b  reason: collision with other inner class name */
    static final class C4173b {

        /* renamed from: a  reason: collision with root package name */
        final int f157848a;

        /* renamed from: b  reason: collision with root package name */
        final c[] f157849b;

        /* renamed from: c  reason: collision with root package name */
        long f157850c;

        static {
            Covode.recordClassIndex(104816);
        }

        public final void b() {
            for (c cVar : this.f157849b) {
                cVar.dispose();
            }
        }

        public final c a() {
            int i2 = this.f157848a;
            if (i2 == 0) {
                return b.f157840e;
            }
            c[] cVarArr = this.f157849b;
            long j2 = this.f157850c;
            this.f157850c = 1 + j2;
            return cVarArr[(int) (j2 % ((long) i2))];
        }

        C4173b(int i2, ThreadFactory threadFactory) {
            this.f157848a = i2;
            this.f157849b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f157849b[i3] = new c(threadFactory);
            }
        }
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new a(this.f157842g.get().a());
    }

    @Override // f.a.aa
    public final void b() {
        C4173b bVar = new C4173b(f157839d, this.f157841f);
        if (!this.f157842g.compareAndSet(f157837a, bVar)) {
            bVar.b();
        }
    }

    static {
        Covode.recordClassIndex(104814);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f157839d = availableProcessors;
        c cVar = new c(new j("RxComputationShutdown"));
        f157840e = cVar;
        cVar.dispose();
        j jVar = new j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f157838c = jVar;
        C4173b bVar = new C4173b(0, jVar);
        f157837a = bVar;
        bVar.b();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h {
        static {
            Covode.recordClassIndex(104817);
        }

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    private b(ThreadFactory threadFactory) {
        this.f157841f = threadFactory;
        this.f157842g = new AtomicReference<>(f157837a);
        b();
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f157842g.get().a().b(runnable, j2, timeUnit);
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f157842g.get().a().b(runnable, j2, j3, timeUnit);
    }
}
