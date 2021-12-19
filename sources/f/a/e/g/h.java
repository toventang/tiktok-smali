package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.a.a;
import f.a.e.a.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class h extends aa.c {

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f157893b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f157894c;

    static {
        Covode.recordClassIndex(104832);
    }

    @Override // f.a.b.b
    public boolean isDisposed() {
        return this.f157894c;
    }

    @Override // f.a.b.b
    public void dispose() {
        if (!this.f157894c) {
            this.f157894c = true;
            this.f157893b.shutdownNow();
        }
    }

    @Override // f.a.aa.c
    public final b a(Runnable runnable) {
        return a(runnable, 0, null);
    }

    public h(ThreadFactory threadFactory) {
        this.f157893b = n.a(threadFactory);
    }

    @Override // f.a.aa.c
    public final b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f157894c) {
            return c.INSTANCE;
        }
        return a(runnable, j2, timeUnit, (a) null);
    }

    public final b b(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future<?> future;
        l lVar = new l(f.a.h.a.a(runnable));
        if (j2 <= 0) {
            try {
                future = this.f157893b.submit(lVar);
            } catch (RejectedExecutionException e2) {
                f.a.h.a.a(e2);
                return c.INSTANCE;
            }
        } else {
            future = this.f157893b.schedule(lVar, j2, timeUnit);
        }
        lVar.setFuture(future);
        return lVar;
    }

    public final m a(Runnable runnable, long j2, TimeUnit timeUnit, a aVar) {
        Future<?> future;
        m mVar = new m(f.a.h.a.a(runnable), aVar);
        if (aVar != null && !aVar.a(mVar)) {
            return mVar;
        }
        if (j2 <= 0) {
            try {
                future = this.f157893b.submit((Callable) mVar);
            } catch (RejectedExecutionException e2) {
                if (aVar != null) {
                    aVar.b(mVar);
                }
                f.a.h.a.a(e2);
            }
        } else {
            future = this.f157893b.schedule((Callable) mVar, j2, timeUnit);
        }
        mVar.setFuture(future);
        return mVar;
    }

    public final b b(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Future<?> future;
        Runnable a2 = f.a.h.a.a(runnable);
        if (j3 <= 0) {
            e eVar = new e(a2, this.f157893b);
            if (j2 <= 0) {
                try {
                    future = this.f157893b.submit(eVar);
                } catch (RejectedExecutionException e2) {
                    f.a.h.a.a(e2);
                    return c.INSTANCE;
                }
            } else {
                future = this.f157893b.schedule(eVar, j2, timeUnit);
            }
            eVar.a(future);
            return eVar;
        }
        k kVar = new k(a2);
        try {
            kVar.setFuture(this.f157893b.scheduleAtFixedRate(kVar, j2, j3, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e3) {
            f.a.h.a.a(e3);
            return c.INSTANCE;
        }
    }
}
