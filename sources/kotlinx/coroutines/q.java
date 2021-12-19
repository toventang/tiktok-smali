package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class q extends CompletedExceptionally {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159175a = AtomicIntegerFieldUpdater.newUpdater(q.class, "_resumed");
    private volatile int _resumed;

    static {
        Covode.recordClassIndex(105690);
    }

    public final boolean a() {
        return f159175a.compareAndSet(this, 0, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(d<?> dVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException("Continuation " + dVar + " was cancelled normally") : th, z);
        this._resumed = 0;
    }
}
