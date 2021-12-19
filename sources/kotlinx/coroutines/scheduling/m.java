package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ar;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159211b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159212c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159213d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159214e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f159215a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    static {
        Covode.recordClassIndex(105709);
    }

    private int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int a() {
        if (this.lastScheduledTask != null) {
            return c() + 1;
        }
        return c();
    }

    public final h b() {
        h hVar = (h) f159211b.getAndSet(this, null);
        if (hVar == null) {
            return d();
        }
        return hVar;
    }

    private final h d() {
        h andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f159213d.compareAndSet(this, i2, i2 + 1) && (andSet = this.f159215a.getAndSet(i3, null)) != null) {
                b(andSet);
                return andSet;
            }
        }
    }

    private final void b(h hVar) {
        if (hVar != null && hVar.f159203h.c() == 1) {
            int decrementAndGet = f159214e.decrementAndGet(this);
            if (ar.f159021a && decrementAndGet < 0) {
                throw new AssertionError();
            }
        }
    }

    private final h a(h hVar) {
        if (hVar.f159203h.c() == 1) {
            f159214e.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f159215a.get(i2) != null) {
            Thread.yield();
        }
        this.f159215a.lazySet(i2, hVar);
        f159212c.incrementAndGet(this);
        return null;
    }

    public final long b(m mVar) {
        if (!ar.f159021a || c() == 0) {
            int i2 = mVar.producerIndex;
            AtomicReferenceArray<h> atomicReferenceArray = mVar.f159215a;
            for (int i3 = mVar.consumerIndex; i3 != i2; i3++) {
                int i4 = i3 & 127;
                if (mVar.blockingTasksInBuffer == 0) {
                    break;
                }
                h hVar = atomicReferenceArray.get(i4);
                if (hVar != null && hVar.f159203h.c() == 1 && atomicReferenceArray.compareAndSet(i4, hVar, null)) {
                    f159214e.decrementAndGet(mVar);
                    a((m) hVar, (h) false);
                    return -1;
                }
            }
            return a(mVar, true);
        }
        throw new AssertionError();
    }

    public final long a(m mVar) {
        if (!ar.f159021a || c() == 0) {
            h d2 = mVar.d();
            if (d2 == null) {
                return a(mVar, false);
            }
            h a2 = a((m) d2, (h) false);
            if (!ar.f159021a || a2 == null) {
                return -1;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public final void a(d dVar) {
        Object andSet = f159211b.getAndSet(this, null);
        if (andSet != null) {
            dVar.a(andSet);
        }
        while (true) {
            h d2 = d();
            if (d2 != null) {
                dVar.a(d2);
            } else {
                return;
            }
        }
    }

    public final h a(h hVar, boolean z) {
        if (z) {
            return a(hVar);
        }
        h hVar2 = (h) f159211b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return a(hVar2);
    }

    private final long a(m mVar, boolean z) {
        h hVar;
        do {
            hVar = (h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z && hVar.f159203h.c() != 1) {
                return -2;
            }
            long a2 = k.f159210f.a() - hVar.f159202g;
            if (a2 < k.f159205a) {
                return k.f159205a - a2;
            }
        } while (!f159211b.compareAndSet(mVar, hVar, null));
        a(hVar, false);
        return -1;
    }
}
