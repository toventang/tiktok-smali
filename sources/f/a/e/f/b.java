package f.a.e.f;

import com.bytedance.covode.number.Covode;
import f.a.e.c.h;
import f.a.e.j.m;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b<E> extends AtomicReferenceArray<E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final Integer f157824a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    @Override // f.a.e.c.i
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    static {
        Covode.recordClassIndex(104811);
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        if (this.producerIndex.get() == this.consumerIndex.get()) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.h, f.a.e.c.i
    public final E poll() {
        long j2 = this.consumerIndex.get();
        int i2 = ((int) j2) & this.mask;
        E e2 = get(i2);
        if (e2 == null) {
            return null;
        }
        this.consumerIndex.lazySet(j2 + 1);
        lazySet(i2, null);
        return e2;
    }

    public b(int i2) {
        super(m.a(i2));
        this.lookAheadStep = Math.min(i2 / 4, f157824a.intValue());
    }

    @Override // f.a.e.c.i
    public final boolean offer(E e2) {
        Objects.requireNonNull(e2, "Null is not a valid element");
        int i2 = this.mask;
        long j2 = this.producerIndex.get();
        int i3 = ((int) j2) & i2;
        if (j2 >= this.producerLookAhead) {
            long j3 = ((long) this.lookAheadStep) + j2;
            if (get(i2 & ((int) j3)) == null) {
                this.producerLookAhead = j3;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, e2);
        this.producerIndex.lazySet(j2 + 1);
        return true;
    }

    public final boolean offer(E e2, E e3) {
        if (!offer(e2) || !offer(e3)) {
            return false;
        }
        return true;
    }
}
