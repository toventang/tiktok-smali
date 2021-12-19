package f.a.e.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import f.a.aa;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends aa {

    /* renamed from: a  reason: collision with root package name */
    static final j f157872a;

    /* renamed from: c  reason: collision with root package name */
    static final j f157873c;

    /* renamed from: d  reason: collision with root package name */
    static final c f157874d;

    /* renamed from: g  reason: collision with root package name */
    static final a f157875g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f157876h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: i  reason: collision with root package name */
    private static final TimeUnit f157877i = TimeUnit.SECONDS;

    /* renamed from: e  reason: collision with root package name */
    final ThreadFactory f157878e;

    /* renamed from: f  reason: collision with root package name */
    final AtomicReference<a> f157879f;

    static final class b extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        final AtomicBoolean f157886a = new AtomicBoolean();

        /* renamed from: b  reason: collision with root package name */
        private final f.a.b.a f157887b;

        /* renamed from: c  reason: collision with root package name */
        private final a f157888c;

        /* renamed from: d  reason: collision with root package name */
        private final c f157889d;

        static {
            Covode.recordClassIndex(104829);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157886a.get();
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (this.f157886a.compareAndSet(false, true)) {
                this.f157887b.dispose();
                a aVar = this.f157888c;
                c cVar = this.f157889d;
                cVar.f157890a = System.nanoTime() + aVar.f157880a;
                aVar.f157881b.offer(cVar);
            }
        }

        b(a aVar) {
            this.f157888c = aVar;
            this.f157887b = new f.a.b.a();
            this.f157889d = aVar.a();
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f157887b.isDisposed()) {
                return f.a.e.a.c.INSTANCE;
            }
            return this.f157889d.a(runnable, j2, timeUnit, this.f157887b);
        }
    }

    public f() {
        this(f157872a);
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new b(this.f157879f.get());
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f157880a;

        /* renamed from: b  reason: collision with root package name */
        final ConcurrentLinkedQueue<c> f157881b;

        /* renamed from: c  reason: collision with root package name */
        final f.a.b.a f157882c;

        /* renamed from: d  reason: collision with root package name */
        private final ScheduledExecutorService f157883d;

        /* renamed from: e  reason: collision with root package name */
        private final Future<?> f157884e;

        /* renamed from: f  reason: collision with root package name */
        private final ThreadFactory f157885f;

        static {
            Covode.recordClassIndex(104828);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f157882c.dispose();
            Future<?> future = this.f157884e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f157883d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        /* access modifiers changed from: package-private */
        public final c a() {
            if (this.f157882c.isDisposed()) {
                return f.f157874d;
            }
            while (!this.f157881b.isEmpty()) {
                c poll = this.f157881b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f157885f);
            this.f157882c.a(cVar);
            return cVar;
        }

        public final void run() {
            if (!this.f157881b.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<c> it = this.f157881b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f157890a > nanoTime) {
                        return;
                    }
                    if (this.f157881b.remove(next)) {
                        this.f157882c.b(next);
                    }
                }
            }
        }

        a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j3;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j3 = timeUnit.toNanos(j2);
            } else {
                j3 = 0;
            }
            this.f157880a = j3;
            this.f157881b = new ConcurrentLinkedQueue<>();
            this.f157882c = new f.a.b.a();
            this.f157885f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = (ScheduledExecutorService) g.a(l.a(o.SCHEDULED).a(1).a(f.f157873c).a());
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f157883d = scheduledExecutorService;
            this.f157884e = scheduledFuture;
        }
    }

    @Override // f.a.aa
    public final void b() {
        a aVar = new a(f157876h, f157877i, this.f157878e);
        if (!this.f157879f.compareAndSet(f157875g, aVar)) {
            aVar.b();
        }
    }

    static {
        Covode.recordClassIndex(104827);
        c cVar = new c(new j("RxCachedThreadSchedulerShutdown"));
        f157874d = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        j jVar = new j("RxCachedThreadScheduler", max);
        f157872a = jVar;
        f157873c = new j("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, null, jVar);
        f157875g = aVar;
        aVar.b();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h {

        /* renamed from: a  reason: collision with root package name */
        public long f157890a;

        static {
            Covode.recordClassIndex(104830);
        }

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    private f(ThreadFactory threadFactory) {
        this.f157878e = threadFactory;
        this.f157879f = new AtomicReference<>(f157875g);
        b();
    }
}
