package f.a.e.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.aa;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class p extends aa {

    /* renamed from: a  reason: collision with root package name */
    public static final p f157912a = new p();

    static final class c extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        final PriorityBlockingQueue<b> f157920a = new PriorityBlockingQueue<>();

        /* renamed from: b  reason: collision with root package name */
        final AtomicInteger f157921b = new AtomicInteger();

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f157922c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicInteger f157923d = new AtomicInteger();

        static {
            Covode.recordClassIndex(104847);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157922c = true;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157922c;
        }

        /* access modifiers changed from: package-private */
        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final b f157924a;

            static {
                Covode.recordClassIndex(104848);
            }

            public final void run() {
                this.f157924a.f157919d = true;
                c.this.f157920a.remove(this.f157924a);
            }

            a(b bVar) {
                this.f157924a = bVar;
            }
        }

        c() {
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable) {
            return a(runnable, a(TimeUnit.MILLISECONDS));
        }

        private f.a.b.b a(Runnable runnable, long j2) {
            if (this.f157922c) {
                return f.a.e.a.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.f157921b.incrementAndGet());
            this.f157920a.add(bVar);
            if (this.f157923d.getAndIncrement() != 0) {
                return f.a.b.c.a(new a(bVar));
            }
            int i2 = 1;
            while (!this.f157922c) {
                b poll = this.f157920a.poll();
                if (poll == null) {
                    i2 = this.f157923d.addAndGet(-i2);
                    if (i2 == 0) {
                        return f.a.e.a.c.INSTANCE;
                    }
                } else if (!poll.f157919d) {
                    poll.f157916a.run();
                }
            }
            this.f157920a.clear();
            return f.a.e.a.c.INSTANCE;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            long a2 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j2);
            return a(new a(runnable, this, a2), a2);
        }
    }

    p() {
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new c();
    }

    static {
        Covode.recordClassIndex(104844);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f157913a;

        /* renamed from: b  reason: collision with root package name */
        private final c f157914b;

        /* renamed from: c  reason: collision with root package name */
        private final long f157915c;

        static {
            Covode.recordClassIndex(104845);
        }

        public final void run() {
            MethodCollector.i(11789);
            if (!this.f157914b.f157922c) {
                long a2 = c.a(TimeUnit.MILLISECONDS);
                long j2 = this.f157915c;
                if (j2 > a2) {
                    try {
                        Thread.sleep(j2 - a2);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        f.a.h.a.a(e2);
                        MethodCollector.o(11789);
                        return;
                    }
                }
                if (!this.f157914b.f157922c) {
                    this.f157913a.run();
                }
            }
            MethodCollector.o(11789);
        }

        a(Runnable runnable, c cVar, long j2) {
            this.f157913a = runnable;
            this.f157914b = cVar;
            this.f157915c = j2;
        }
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable) {
        f.a.h.a.a(runnable).run();
        return f.a.e.a.c.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f157916a;

        /* renamed from: b  reason: collision with root package name */
        final long f157917b;

        /* renamed from: c  reason: collision with root package name */
        final int f157918c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f157919d;

        static {
            Covode.recordClassIndex(104846);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            long j2 = this.f157917b;
            long j3 = bVar2.f157917b;
            if (j2 < j3) {
                return -1;
            }
            if (j2 > j3) {
                return 1;
            }
            int i2 = this.f157918c;
            int i3 = bVar2.f157918c;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            return 0;
        }

        b(Runnable runnable, Long l2, int i2) {
            this.f157916a = runnable;
            this.f157917b = l2.longValue();
            this.f157918c = i2;
        }
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            f.a.h.a.a(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            f.a.h.a.a(e2);
        }
        return f.a.e.a.c.INSTANCE;
    }
}
