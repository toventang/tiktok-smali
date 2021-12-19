package f.a;

import com.bytedance.covode.number.Covode;
import f.a.e.a.f;
import f.a.e.j.h;
import java.util.concurrent.TimeUnit;

public abstract class aa {

    /* renamed from: b  reason: collision with root package name */
    static final long f157166b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract c a();

    public void b() {
    }

    static final class b implements f.a.b.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f157170a;

        /* renamed from: b  reason: collision with root package name */
        final c f157171b;

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f157172c;

        static {
            Covode.recordClassIndex(104360);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157172c;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157172c = true;
            this.f157171b.dispose();
        }

        public final void run() {
            if (!this.f157172c) {
                try {
                    this.f157170a.run();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    this.f157171b.dispose();
                    throw h.a(th);
                }
            }
        }

        b(Runnable runnable, c cVar) {
            this.f157170a = runnable;
            this.f157171b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements f.a.b.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f157167a;

        /* renamed from: b  reason: collision with root package name */
        final c f157168b;

        /* renamed from: c  reason: collision with root package name */
        Thread f157169c;

        static {
            Covode.recordClassIndex(104359);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157168b.isDisposed();
        }

        public final void run() {
            this.f157169c = Thread.currentThread();
            try {
                this.f157167a.run();
            } finally {
                dispose();
                this.f157169c = null;
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (this.f157169c == Thread.currentThread()) {
                c cVar = this.f157168b;
                if (cVar instanceof f.a.e.g.h) {
                    f.a.e.g.h hVar = (f.a.e.g.h) cVar;
                    if (!hVar.f157894c) {
                        hVar.f157894c = true;
                        hVar.f157893b.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f157168b.dispose();
        }

        a(Runnable runnable, c cVar) {
            this.f157167a = runnable;
            this.f157168b = cVar;
        }
    }

    static {
        Covode.recordClassIndex(104358);
    }

    public static abstract class c implements f.a.b.b {
        static {
            Covode.recordClassIndex(104361);
        }

        public abstract f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit);

        /* access modifiers changed from: package-private */
        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final Runnable f157173a;

            /* renamed from: b  reason: collision with root package name */
            final f f157174b;

            /* renamed from: c  reason: collision with root package name */
            final long f157175c;

            /* renamed from: d  reason: collision with root package name */
            long f157176d;

            /* renamed from: e  reason: collision with root package name */
            long f157177e;

            /* renamed from: f  reason: collision with root package name */
            long f157178f;

            static {
                Covode.recordClassIndex(104362);
            }

            public final void run() {
                long j2;
                this.f157173a.run();
                if (!this.f157174b.isDisposed()) {
                    long a2 = c.a(TimeUnit.NANOSECONDS);
                    long j3 = this.f157177e;
                    if (aa.f157166b + a2 < j3 || a2 >= j3 + this.f157175c + aa.f157166b) {
                        long j4 = this.f157175c;
                        j2 = a2 + j4;
                        long j5 = this.f157176d + 1;
                        this.f157176d = j5;
                        this.f157178f = j2 - (j4 * j5);
                    } else {
                        long j6 = this.f157178f;
                        long j7 = this.f157176d + 1;
                        this.f157176d = j7;
                        j2 = j6 + (j7 * this.f157175c);
                    }
                    this.f157177e = a2;
                    this.f157174b.replace(c.this.a(this, j2 - a2, TimeUnit.NANOSECONDS));
                }
            }

            a(long j2, Runnable runnable, long j3, f fVar, long j4) {
                this.f157173a = runnable;
                this.f157174b = fVar;
                this.f157175c = j4;
                this.f157177e = j3;
                this.f157178f = j2;
            }
        }

        public static long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public f.a.b.b a(Runnable runnable) {
            return a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public final f.a.b.b a(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            f fVar = new f();
            f fVar2 = new f(fVar);
            Runnable a2 = f.a.h.a.a(runnable);
            long nanos = timeUnit.toNanos(j3);
            long a3 = a(TimeUnit.NANOSECONDS);
            f.a.b.b a4 = a(new a(a3 + timeUnit.toNanos(j2), a2, a3, fVar2, nanos), j2, timeUnit);
            if (a4 == f.a.e.a.c.INSTANCE) {
                return a4;
            }
            fVar.replace(a4);
            return fVar2;
        }
    }

    public f.a.b.b a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        c a2 = a();
        a aVar = new a(f.a.h.a.a(runnable), a2);
        a2.a(aVar, j2, timeUnit);
        return aVar;
    }

    public f.a.b.b a(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        c a2 = a();
        b bVar = new b(f.a.h.a.a(runnable), a2);
        f.a.b.b a3 = a2.a(bVar, j2, j3, timeUnit);
        if (a3 == f.a.e.a.c.INSTANCE) {
            return a3;
        }
        return bVar;
    }
}
