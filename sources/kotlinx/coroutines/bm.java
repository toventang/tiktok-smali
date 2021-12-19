package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;

public abstract class bm extends bl {
    static {
        Covode.recordClassIndex(105566);
    }

    /* access modifiers changed from: protected */
    public abstract Thread getThread();

    /* access modifiers changed from: protected */
    public final void unpark() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread && cy.f159102a == null) {
            LockSupport.unpark(thread);
        }
    }

    /* access modifiers changed from: protected */
    public final void reschedule(long j2, EventLoopImplBase.c cVar) {
        if (!ar.f159021a || this != at.f159025a) {
            at.f159025a.schedule(j2, cVar);
            return;
        }
        throw new AssertionError();
    }
}
