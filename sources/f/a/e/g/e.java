package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.b.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class e implements b, Callable<Void> {

    /* renamed from: f  reason: collision with root package name */
    static final FutureTask<Void> f157866f = new FutureTask<>(a.f157189b, null);

    /* renamed from: a  reason: collision with root package name */
    final Runnable f157867a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<Future<?>> f157868b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Future<?>> f157869c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    final ExecutorService f157870d;

    /* renamed from: e  reason: collision with root package name */
    Thread f157871e;

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.f157869c.get() == f157866f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104826);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() {
        boolean z;
        this.f157871e = Thread.currentThread();
        try {
            this.f157867a.run();
            Future<?> submit = this.f157870d.submit(this);
            while (true) {
                Future<?> future = this.f157868b.get();
                if (future != f157866f) {
                    if (this.f157868b.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    if (this.f157871e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    submit.cancel(z);
                }
            }
            this.f157871e = null;
        } catch (Throwable th) {
            this.f157871e = null;
            f.a.h.a.a(th);
        }
        return null;
    }

    @Override // f.a.b.b
    public final void dispose() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.f157869c;
        FutureTask<Void> futureTask = f157866f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (!(andSet == null || andSet == futureTask)) {
            if (this.f157871e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.f157868b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.f157871e == Thread.currentThread()) {
                z2 = false;
            }
            andSet2.cancel(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f157869c.get();
            if (future2 == f157866f) {
                if (this.f157871e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f157869c.compareAndSet(future2, future));
    }

    e(Runnable runnable, ExecutorService executorService) {
        this.f157867a = runnable;
        this.f157870d = executorService;
    }
}
