package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import h.c.f;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.bp;

final class e extends bp implements Executor, i {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159194f = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: a  reason: collision with root package name */
    public final c f159195a;

    /* renamed from: d  reason: collision with root package name */
    public final int f159196d;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f159197e = new ConcurrentLinkedQueue<>();

    /* renamed from: g  reason: collision with root package name */
    private final int f159198g = 1;
    private volatile int inFlightTasks = 0;

    static {
        Covode.recordClassIndex(105701);
    }

    @Override // kotlinx.coroutines.bp
    public final Executor a() {
        return this;
    }

    @Override // kotlinx.coroutines.scheduling.i
    public final int c() {
        return this.f159198g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.scheduling.i
    public final void b() {
        Runnable poll = this.f159197e.poll();
        if (poll != null) {
            this.f159195a.a(poll, this, true);
            return;
        }
        f159194f.decrementAndGet(this);
        Runnable poll2 = this.f159197e.poll();
        if (poll2 != null) {
            a(poll2, true);
        }
    }

    @Override // kotlinx.coroutines.ah
    public final String toString() {
        return super.toString() + "[dispatcher = " + this.f159195a + ']';
    }

    public final void execute(Runnable runnable) {
        a(runnable, false);
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        a(runnable, false);
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatchYield(f fVar, Runnable runnable) {
        a(runnable, true);
    }

    public e(c cVar, int i2) {
        this.f159195a = cVar;
        this.f159196d = i2;
    }

    private final void a(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f159194f;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f159196d) {
                this.f159195a.a(runnable, this, z);
                return;
            }
            this.f159197e.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.f159196d) {
                runnable = this.f159197e.poll();
            } else {
                return;
            }
        } while (runnable != null);
    }
}
