package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import java.util.concurrent.locks.LockSupport;

/* access modifiers changed from: package-private */
public final class e<T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Thread f159107b;

    /* renamed from: e  reason: collision with root package name */
    private final bl f159108e;

    static {
        Covode.recordClassIndex(105626);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public final boolean i() {
        return true;
    }

    public final T j() {
        long j2;
        bl blVar = this.f159108e;
        CompletedExceptionally completedExceptionally = null;
        if (blVar != null) {
            bl.incrementUseCount$default(blVar, false, 1, completedExceptionally);
        }
        while (!Thread.interrupted()) {
            try {
                bl blVar2 = this.f159108e;
                if (blVar2 != null) {
                    j2 = blVar2.processNextEvent();
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (k()) {
                    T t = (T) cf.b(p());
                    if (t instanceof CompletedExceptionally) {
                        completedExceptionally = t;
                    }
                    CompletedExceptionally completedExceptionally2 = completedExceptionally;
                    if (completedExceptionally2 == null) {
                        return t;
                    }
                    throw completedExceptionally2.cause;
                } else if (cy.f159102a == null) {
                    LockSupport.parkNanos(this, j2);
                }
            } finally {
                bl blVar3 = this.f159108e;
                if (blVar3 != null) {
                    bl.decrementUseCount$default(blVar3, false, 1, completedExceptionally);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        d((Throwable) interruptedException);
        throw interruptedException;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public final void c(Object obj) {
        if (!l.a(Thread.currentThread(), this.f159107b)) {
            LockSupport.unpark(this.f159107b);
        }
    }

    public e(f fVar, Thread thread, bl blVar) {
        super(fVar, true);
        this.f159107b = thread;
        this.f159108e = blVar;
    }
}
