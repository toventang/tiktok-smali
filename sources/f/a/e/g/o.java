package f.a.e.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import f.a.aa;
import f.a.b.b;
import f.a.e.a.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends aa {

    /* renamed from: d  reason: collision with root package name */
    static final j f157905d = new j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e  reason: collision with root package name */
    static final ScheduledExecutorService f157906e;

    /* renamed from: a  reason: collision with root package name */
    final ThreadFactory f157907a;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f157908c;

    static final class a extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f157909a;

        /* renamed from: b  reason: collision with root package name */
        final f.a.b.a f157910b = new f.a.b.a();

        /* renamed from: c  reason: collision with root package name */
        volatile boolean f157911c;

        static {
            Covode.recordClassIndex(104843);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157911c;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f157911c) {
                this.f157911c = true;
                this.f157910b.dispose();
            }
        }

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f157909a = scheduledExecutorService;
        }

        @Override // f.a.aa.c
        public final b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            Future<?> future;
            if (this.f157911c) {
                return c.INSTANCE;
            }
            m mVar = new m(f.a.h.a.a(runnable), this.f157910b);
            this.f157910b.a(mVar);
            if (j2 <= 0) {
                try {
                    future = this.f157909a.submit((Callable) mVar);
                } catch (RejectedExecutionException e2) {
                    dispose();
                    f.a.h.a.a(e2);
                    return c.INSTANCE;
                }
            } else {
                future = this.f157909a.schedule((Callable) mVar, j2, timeUnit);
            }
            mVar.setFuture(future);
            return mVar;
        }
    }

    public o() {
        this(f157905d);
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new a(this.f157908c.get());
    }

    static {
        Covode.recordClassIndex(104842);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) g.a(l.a(com.ss.android.ugc.aweme.cw.o.SCHEDULED).a(0).a());
        f157906e = scheduledExecutorService;
        scheduledExecutorService.shutdown();
    }

    @Override // f.a.aa
    public final void b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f157908c.get();
            if (scheduledExecutorService != f157906e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = n.a(this.f157907a);
            }
        } while (!this.f157908c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    private o(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f157908c = atomicReference;
        this.f157907a = threadFactory;
        atomicReference.lazySet(n.a(threadFactory));
    }

    @Override // f.a.aa
    public final b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future<?> future;
        l lVar = new l(f.a.h.a.a(runnable));
        if (j2 <= 0) {
            try {
                future = this.f157908c.get().submit(lVar);
            } catch (RejectedExecutionException e2) {
                f.a.h.a.a(e2);
                return c.INSTANCE;
            }
        } else {
            future = this.f157908c.get().schedule(lVar, j2, timeUnit);
        }
        lVar.setFuture(future);
        return lVar;
    }

    @Override // f.a.aa
    public final b a(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Future<?> future;
        Runnable a2 = f.a.h.a.a(runnable);
        if (j3 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f157908c.get();
            e eVar = new e(a2, scheduledExecutorService);
            if (j2 <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e2) {
                    f.a.h.a.a(e2);
                    return c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j2, timeUnit);
            }
            eVar.a(future);
            return eVar;
        }
        k kVar = new k(a2);
        try {
            kVar.setFuture(this.f157908c.get().scheduleAtFixedRate(kVar, j2, j3, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e3) {
            f.a.h.a.a(e3);
            return c.INSTANCE;
        }
    }
}
