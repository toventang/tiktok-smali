package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a extends AtomicReference<Future<?>> implements b {

    /* renamed from: a  reason: collision with root package name */
    protected static final FutureTask<Void> f157835a = new FutureTask<>(f.a.e.b.a.f157189b, null);

    /* renamed from: b  reason: collision with root package name */
    protected static final FutureTask<Void> f157836b = new FutureTask<>(f.a.e.b.a.f157189b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        Object obj = get();
        if (obj == f157835a || obj == f157836b) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104813);
    }

    @Override // f.a.b.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f157835a && future != (futureTask = f157836b) && compareAndSet(future, futureTask) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    a(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        boolean z;
        do {
            obj = get();
            if (obj == f157835a) {
                return;
            }
            if (obj == f157836b) {
                if (this.runner != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(obj, future));
    }
}
