package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.a.b;
import h.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.d;

public abstract class bq extends bp implements ax {

    /* renamed from: a  reason: collision with root package name */
    private boolean f159052a;

    static {
        Covode.recordClassIndex(105572);
    }

    public final void b() {
        this.f159052a = d.a(a());
    }

    public int hashCode() {
        return System.identityHashCode(a());
    }

    @Override // kotlinx.coroutines.ah
    public String toString() {
        return a().toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a2 = a();
        if (!(a2 instanceof ExecutorService)) {
            a2 = null;
        }
        ExecutorService executorService = (ExecutorService) a2;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bq) || ((bp) obj).a() != a()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.ah
    public void dispatch(f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor a2 = a();
            cx cxVar = cy.f159102a;
            if (cxVar == null || (runnable2 = cxVar.b()) == null) {
                runnable2 = runnable;
            }
            a2.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            at.f159025a.enqueue(runnable);
        }
    }

    @Override // kotlinx.coroutines.ax
    public bh invokeOnTimeout(long j2, Runnable runnable) {
        ScheduledFuture<?> a2;
        if (!this.f159052a || (a2 = a(runnable, j2, TimeUnit.MILLISECONDS)) == null) {
            return at.f159025a.invokeOnTimeout(j2, runnable);
        }
        return new bg(a2);
    }

    @Override // kotlinx.coroutines.ax
    public void scheduleResumeAfterDelay(long j2, m<? super z> mVar) {
        ScheduledFuture<?> a2;
        if (!this.f159052a || (a2 = a(new cq(this, mVar), j2, TimeUnit.MILLISECONDS)) == null) {
            at.f159025a.scheduleResumeAfterDelay(j2, mVar);
        } else {
            mVar.a((b<? super Throwable, z>) new j(a2));
        }
    }

    private final ScheduledFuture<?> a(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            Executor a2 = a();
            if (!(a2 instanceof ScheduledExecutorService)) {
                a2 = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a2;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j2, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }
}
